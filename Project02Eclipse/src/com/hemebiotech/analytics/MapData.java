package com.hemebiotech.analytics;

import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class MapData {

	public Map<String, Integer> dataCount(ArrayList<String> ArrayList) {

		Map<String, Integer> dataMap = new TreeMap<String, Integer>();

		for (String data : ArrayList) {
			if (dataMap.containsKey(data)) {
				int count = dataMap.get(data) + 1;
				dataMap.put(data, count);

			} else {
				dataMap.put(data, 1);
			}
		}

		return dataMap;
	}

}
