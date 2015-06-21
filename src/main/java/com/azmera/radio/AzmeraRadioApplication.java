package com.azmera.radio;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.tika.metadata.Metadata;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.azmera.radio.models.Song;
import com.azmera.radio.services.DirectoryParser;
import com.azmera.radio.services.SongMetadataParser;

@SpringBootApplication
/*@EnableAutoConfiguration
@EnableWebMvc
@ComponentScan("com.azmera.radio")*/
public class AzmeraRadioApplication {

    public static void main(String[] args) {
        SpringApplication.run(AzmeraRadioApplication.class, args);
        DirectoryParser dirParser = new DirectoryParser();
        List<String> songPaths = new ArrayList<>();
        songPaths = dirParser.walk("Music/");
        System.out.println(songPaths);

        /*SongMetadataParser metadata = new SongMetadataParser(); 
        ArrayList<Song> songs;
        try {
			songs = (ArrayList<Song>) metadata.parseMetadata(songPaths);
			System.out.println(songs);
		} catch (IOException e) {
			e.printStackTrace();
		}*/
    }
}
