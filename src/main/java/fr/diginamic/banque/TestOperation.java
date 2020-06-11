package fr.diginamic.banque;

import java.util.ArrayList;

import fr.diginamic.banque.entites.Credits;
import fr.diginamic.banque.entites.Debits;
import fr.diginamic.banque.entites.Operations;

public class TestOperation {

	public static void main(String[] args) {
		ArrayList<Operations> tab = new ArrayList<Operations>();
		tab.add(new Credits("jeudi 21", 200));
		tab.add(new Debits("vendredi 13", 666));
		tab.add(new Credits("samedi 32", 99999));
		tab.add(new Debits("lundi 01", 753));

		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
	}
}
