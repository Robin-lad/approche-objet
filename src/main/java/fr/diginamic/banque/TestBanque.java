package fr.diginamic.banque;

import java.util.ArrayList;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {

	public static void main(String[] args) {
		Compte c1 = new Compte(1, 7.5);
		CompteTaux ct1 = new CompteTaux(1, 7.5, 8);
		//System.out.println(ct1);
		
		ArrayList<Compte> tab = new ArrayList<Compte>();
		tab.add(c1);
		tab.add(ct1);
		
		for(int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
	}
}
