package fr.diginamic.banque;

import java.util.ArrayList;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;
import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(1, 200);
		CompteTaux ct1 = new CompteTaux(4, 875, 8);

		ArrayList<Compte> tab = new ArrayList<Compte>();
		tab.add(c1);
		tab.add(ct1);

		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
		System.out.println("\n");

		Credit cred = new Credit("jeudi 21", 200);
		Credit cred2 = new Credit("vendredi 22", 500);
		Credit cred3 = new Credit("samedi 23", 400);
		Debit deb = new Debit("vendredi 13", 666);
		Debit deb2 = new Debit("dimanche 24", 5);

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
