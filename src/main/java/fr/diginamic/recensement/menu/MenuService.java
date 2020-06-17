/** 
*
*/
package fr.diginamic.recensement.menu;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * @author robin
 *
 */
public abstract class MenuService {

	public abstract boolean traiter(Scanner scanner);

	public ArrayList<String> reverse(Map<String, Integer> map, String format2, String affiche) {

		DecimalFormat format1 = new DecimalFormat("0,000");

		Map<String, Integer> sortedMap = map.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (v1, v2) -> v1, LinkedHashMap::new));

		List<String> reverseList = new ArrayList<>(sortedMap.keySet());
		Collections.reverse(reverseList);

		for (int i = 0; i < MenuApplication.NB_AFFICHAGE; i++) {
			System.out.printf(format2, affiche, reverseList.get(i), " Habitants: ",
					format1.format(sortedMap.get(reverseList.get(i))));
		}
		System.out.println("\n");
		return null;
	}

}
