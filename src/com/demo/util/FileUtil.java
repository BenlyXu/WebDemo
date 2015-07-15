package com.demo.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

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
	
	
	/**
	 * 统计给定文件中给定字符串出现的次数
	 * @param fileName
	 * @param word
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static int countWordInFile(String fileName, String word) throws FileNotFoundException, IOException {
		int count = 0;
		try(FileReader fr = new FileReader(fileName)) {
			try(BufferedReader br = new BufferedReader(fr)) {
				String line = null;
				while ((line = br.readLine()) != null) {
					int index = -1;
					while (line.length() >= word.length() && (index = line.indexOf(word)) >= 0) {
						count++;
						line = line.substring(index + word.length());
					}
				}
			}
		}
		return count;
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
