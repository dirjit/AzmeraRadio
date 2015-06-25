package com.azmera.radio.services;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.text.DecimalFormat;
import java.text.Format;
import java.util.ArrayList;
import java.util.List;

import org.apache.tika.exception.TikaException;
import org.apache.tika.metadata.Metadata;
import org.apache.tika.parser.ParseContext;
import org.apache.tika.parser.Parser;
import org.apache.tika.parser.mp3.Mp3Parser;
import org.springframework.stereotype.Component;
import org.xml.sax.ContentHandler;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import com.azmera.radio.models.Song;

@Component
public class SongMetadataParser {
	List<Song> songs;
	DirectoryParser dirParser;
	InputStream input; 
	File file;
	ContentHandler handler;
	Metadata metadata;
	Parser parser;
	ParseContext parseCtx;
	
	public List<Song> parseMetadata(List<String> audioFileLoc) throws IOException {
		try {

			songs = new ArrayList<>();
			for(String path: audioFileLoc) {
				Song song = new Song();
				file = new File(path);
				input = new FileInputStream(file);
				
				handler = new DefaultHandler();
				metadata = new Metadata();
				parser = new Mp3Parser();
				parseCtx = new ParseContext();
				parser.parse(input, handler, metadata, parseCtx);
				input.close();
				try {
					song.setTitle(metadata.get("title"));
					song.setArtist(metadata.get("xmpDM:artist"));
					song.setGenre(metadata.get("xmpDM:genre"));
					song.setAlbum(metadata.get("xmpDM:album"));
					song.setUrl(path);
					String duration =  String.format("%.2f",(Float.valueOf(metadata.get("xmpDM:duration")) / 1000/60));
					song.setLenth(Float.valueOf(duration));
				}catch(NullPointerException e) {
					System.out.println("there was null value");
				}
				songs.add(song);
			}
			
		}catch(FileNotFoundException | SAXException | TikaException e) {
			e.printStackTrace();
		} 
		return songs;
	}
}
