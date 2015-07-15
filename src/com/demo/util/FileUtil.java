package com.demo.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.util.Collection;

import org.apache.commons.io.FileUtils;

/**
 * @author xubenling
 * @since Jul 15, 2015
 */
/**
 * @author xubenling
 * @since Jul 15, 2015
 */
public final class FileUtil {
	
	private FileUtil() {
		throw new AssertionError();
	}
	
	/**
	 * 文件拷贝
	 * @param source
	 * @param target
	 * @throws IOException
	 */
	public static void fileCopy(String source, String target) throws IOException {
		/**
		 * Java7的TWR(try-with-resources)语法
		 */
		try(InputStream in = new FileInputStream(source)) {
			try(OutputStream out = new FileOutputStream(target)) {
				byte[] buffer = new byte[4096];
				int bytesToRead;
				while ((bytesToRead = in.read()) != -1) {
					out.write(buffer, 0, bytesToRead);;
				}
				System.out.println("Copy file successfully.");
			}
		}
	}
	
	
	/**
	 * Copy file with NIO
	 * @param source
	 * @param target
	 * @throws IOException
	 */
	public static void fileCopyNIO(String source, String target) throws IOException {
		try(FileInputStream in = new FileInputStream(source)) {
			try(FileOutputStream out = new FileOutputStream(target)) {
				FileChannel inChannel = in.getChannel();
				FileChannel outChannel = out.getChannel();
				ByteBuffer buffer = ByteBuffer.allocate(4096);
				while (inChannel.read(buffer) != -1) {
					buffer.flip();
					outChannel.write(buffer);
					buffer.clear();
				}
				System.out.println("Copy file successfully.");
			}
		}
	}

	public static void main(String[] args) throws IOException {
//		String[] extensions = {"txt", "docx"};
//		Collection<File> files = FileUtils.listFiles(new File("e:/CyJob/Assets"), extensions, true);
//		for (File file : files) {
//			System.out.println(file.getPath());
//		}
		
		fileCopyNIO("e:/website.txt", "e:/website_copy.txt");
	}

}
