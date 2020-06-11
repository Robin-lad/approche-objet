package fr.diginamic.banque;

import java.util.ArrayList;

import fr.diginamic.banque.entites.Comptes;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credits;
import fr.diginamic.banque.entites.Debits;

public class TestBanque {

	public static void main(String[] args) {
		Comptes c1 = new Comptes(1, 200);
		CompteTaux ct1 = new CompteTaux(4, 875, 8);

		ArrayList<Comptes> tab = new ArrayList<Comptes>();
		tab.add(c1);
		tab.add(ct1);

		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
		System.out.println("\n");

		Credits cred = new Credits("jeudi 21", 200);
		Credits cred2 = new Credits("vendredi 22", 500);
		Credits cred3 = new Credits("samedi 23", 400);
		Debits deb = new Debits("vendredi 13", 666);
		Debits deb2 = new Debits("dimanche 24", 5);

		c1.addCredit(cred);
		c1.addCredit(cred2);
		c1.addCredit(cred3);
		c1.addDebit(deb);
		c1.addDebit(deb2);

		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
	}
}
