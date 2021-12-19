package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

/**
 * class writing in given file name
 */

public class WriteFile {

	private String fileReturn;

	/**
	 * 
	 * @param fileReturn a full or partial path to file with all the symptoms listed
	 */
	public WriteFile(String fileReturn) {
		this.fileReturn = fileReturn;
	}

	/**
	 * 
	 * @param dataCount Map containing a key / value with, as key a symptom and
	 *                  asvalue the number of iteration
	 * 
	 * @throws IOException le paramètre ne correspond pas
	 */

	public void writeInFile(Map<String, Integer> dataCount) throws IOException {
		FileWriter writer = new FileWriter(fileReturn); // "result.out"
		writer.write("List of Symptoms: \r\n");
		for (Map.Entry<String, Integer> data : dataCount.entrySet()) {
			writer.write(" for " + data.getKey() + " : " + data.getValue() + "\r\n");
		}
		writer.close();
	}

}
