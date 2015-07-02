package com.changyou.demo.util;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

public final class FileUtil {

	public static void main(String[] args) {
		String[] extensions = {"txt", "docx"};
		Collection<File> files = FileUtils.listFiles(new File("e:/CyJob/Assets"), extensions, true);
		for (File file : files) {
			System.out.println(file.getPath());
		}
		
	}

}
