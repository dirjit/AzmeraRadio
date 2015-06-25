package com.azmera.radio.services;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class DirectoryParser {
	
	private List<String> files = new ArrayList<String>();;

	public List<String> walk(String path) {

		File homedir = new File(System.getProperty("user.home"));
		File root = new File(homedir, "/" + path);
		File[] list = root.listFiles();

		if (list == null)
			return null;
		
		for (File f : list) {
			String newPath = root.getAbsolutePath().replaceAll(
					homedir.getAbsolutePath(), "");
			if (f.isDirectory()) {
				if(f.getName() != path) {
					newPath += "/" + f.getName();
					this.walk(newPath);
				}
			} else if (f.isFile()) {
				files.add("" + f.getAbsoluteFile());
			}else {
				System.out.println("File is neither a file or dir");
			}
		}
		return files;
	}

}
