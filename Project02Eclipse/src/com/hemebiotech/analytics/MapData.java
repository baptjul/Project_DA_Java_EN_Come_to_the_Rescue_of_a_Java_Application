package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * simple count of how many time a value is found in an list
 */

public class MapData implements ISymptomMap {

	/**
	 * Change a list in a map for each iteration: increment in corrresponding key
	 *
	 * @param list of all the symptoms with no specific sort
	 * @return Map containing sympotms as key and there number of iteration as value
	 * 
	 *         commit soutenance
	 */

	public Map<String, Integer> dataCount(List<String> list) {

		Map<String, Integer> dataMap = new TreeMap<String, Integer>();

		for (String data : list) {
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
