package com.streamTerminalOpertaion.methods;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class Close {
	
	/*
	 * The close method in Java Streams is used to close the stream and release any
	 * resources that are associated with it. This method should always be called
	 * after you are done using the stream, especially if the stream has been
	 * created from a resource like a file, a network connection, or a database. By
	 * closing the stream, you free up the underlying resources and prevent
	 * potential resource leaks.
	 */
	
	

	public static void main(String[] args) {

		try {
		    Stream<String> lines = Files.lines(Paths.get("filename.txt"));
		    lines.forEach(System.out::println);
		    lines.close();
		    
		} catch (IOException e) {
		    e.printStackTrace();
		}
		

	}
	/*
	 * It's worth noting that the close method is automatically called when the
	 * stream is consumed by a terminal operation such as forEach, reduce, collect,
	 * or toArray. However, if you create a stream and do not consume it, you should
	 * always call the close method explicitly to release any resources associated
	 * with the stream.
	 * 
	 * In addition, some stream sources like Files.lines or BufferedReader.lines
	 * create a new Stream object each time they are called. In such cases, it is
	 * important to close the stream to release any underlying resources.
	 */
	

}
