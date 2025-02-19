package com.hemebiotech.analytics;

import java.util.List;
import java.util.Map;

/**
 * Turning a list into a map, the data need to be sorted
 */

public interface ISymptomMap {
	/**
	 * If no data is available, return an empty List
	 * 
	 * @param list a list of strings
	 * @return a sorted map of all the symptoms and how many time they're found
	 */
	Map<String, Integer> dataCount(List<String> list);
}
