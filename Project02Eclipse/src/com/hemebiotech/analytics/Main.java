package com.hemebiotech.analytics;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

/**
 * Main class calling all the methodes
 */

public class Main {

	/**
	 * Select a file in wich the symptoms are listed to turn it into a list
	 * 
	 * use that list to create a map and count how many time each symptom appear
	 * 
	 * Create a new file in wich the map is written
	 */

	public static void main(String args[]) {

		ISymptomReader reader = new ReadSymptomDataFromFile("Project02Eclipse/symptoms.txt");
		ArrayList<String> symptoms = new ArrayList<String>();
		symptoms = (ArrayList<String>) reader.getSymptoms();

		ISymptomMap listing = new MapData();
		Map<String, Integer> count = new TreeMap<String, Integer>();
		count = listing.dataCount(symptoms);

		WriteFile result = new WriteFile("result.out");
		try {
			result.writeInFile(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
