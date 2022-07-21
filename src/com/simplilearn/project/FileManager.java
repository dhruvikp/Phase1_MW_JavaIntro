package com.simplilearn.project;

import java.util.List;

public interface FileManager {
	void addFile(String fileName);
	void deleteFile(String fileName);
	List<String> listFiles();
	boolean searchFile(String fileName);
}
