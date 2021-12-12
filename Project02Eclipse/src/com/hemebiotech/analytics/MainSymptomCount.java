package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MainSymptomCount {

	public static void main(String args[]) {

		ReadSymptomDataFromFile reader = new ReadSymptomDataFromFile(
				"/Project_DA_Java_EN_Come_to_the_Rescue_of_a_Java_Application/Project02Eclipse/symptoms.txt");
		ArrayList<String> symptoms = new ArrayList<String>();
		symptoms = (ArrayList<String>) reader.GetSymptoms();

		MapData listing = new MapData();
		Map<String, Integer> count = new TreeMap<String, Integer>();
		count = listing.dataCount(symptoms);

		WriteFile result = new WriteFile();
		try {
			result.writeInFile(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
