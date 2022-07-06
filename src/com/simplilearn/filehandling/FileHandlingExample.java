package com.simplilearn.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;

public class FileHandlingExample {

	public static void main(String[] args) throws IOException {
		// createNewFileUsingFileClass();
		// createNewFileUsingFileOutputStream();
		// JDK 8.0 - Java NIO package
		createFileUsingNIOPackage();
		
		System.out.println("Welcome to the lockes.me application");

	}

	private static void createFileUsingNIOPackage() throws IOException {
		String data = "Simplilearn data";
		// Files.write(Paths.get("c://temp/simplilean3.txt"), data.getBytes());

		List<String> lines = Arrays.asList("1", "2","This is the last line of file");

		Files.write(Paths.get("c://temp/simplilearn3.txt"), lines, StandardCharsets.UTF_8, StandardOpenOption.CREATE,
				StandardOpenOption.APPEND);
	}

	private static void createNewFileUsingFileOutputStream() throws FileNotFoundException, IOException {
		String data = "This is simplilearn test data";
		FileOutputStream fos = new FileOutputStream("c://temp//simplilearn1.txt");

		fos.write(data.getBytes());

		fos.close();
	}

	private static void createNewFileUsingFileClass() throws IOException {
		File file = new File("c://temp//simplilearn.txt");

		boolean isCreated = file.createNewFile();

		if (isCreated) {
			System.out.println("File is created");
		} else {
			System.out.println("File already exist!");
		}

		FileWriter fw = new FileWriter(file);
		fw.write("Simplilean Test data");
		fw.close();

		// file.delete();
	}

}
