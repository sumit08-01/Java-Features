package com3_.newFIleMethods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FileReading {

	public static void main(String[] args) throws IOException {

		Path path = Paths.get("/Java_11_Features/src/com3_/newFIleMethods/sample.txt");
		String fileContent = Files.readString(path);
		System.out.println(fileContent);
		String newFileContent = fileContent.replace("Line", "Lines");
		
		
	}

}
