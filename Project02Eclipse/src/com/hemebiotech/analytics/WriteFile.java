package com.hemebiotech.analytics;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;

public class WriteFile {

	public void writeInFile(Map<String, Integer> dataCount) throws IOException {
		FileWriter writer = new FileWriter("result.out");
		writer.write("List of Symptoms: \r\n");
		for (Map.Entry<String, Integer> data : dataCount.entrySet()) {
			writer.write(" for " + data.getKey() + " : " + data.getValue() + "\r\n");
		}
		writer.close();
	}

}
