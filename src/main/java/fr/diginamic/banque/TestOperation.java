package fr.diginamic.banque;

import java.util.ArrayList;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {

	public static void main(String[] args) {
		ArrayList<Operation> tab = new ArrayList<Operation>();
		tab.add(new Credit("jeudi 21", 200));
		tab.add(new Debit("vendredi 13", 666));
		tab.add(new Credit("samedi 32", 99999));
		tab.add(new Debit("lundi 01", 753));

		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
	}
}
