package map;

import java.util.HashMap;

public class FusionMap {

	public static void main(String args[]) {

		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		map1.put(1, "Rouge");
		map1.put(2, "Vert");
		map1.put(3, "Orange");

		HashMap<Integer, String> map2 = new HashMap<Integer, String>();
		map2.put(4, "Blanc");
		map2.put(5, "Bleu");
		map2.put(6, "Orange");

		HashMap<Integer, String> map3 = new HashMap<>(map1);
		// il a toujours 2 fois orange car ils n'ont pas la même clé
		map2.forEach((k, v) -> map3.merge(k, v, (v1, v2) -> v1));
		System.out.println(map3);
	}
}