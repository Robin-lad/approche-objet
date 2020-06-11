package fr.diginamic.interfaces;

import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.interfaces.entites.CompteDaoMem;
import fr.diginamic.interfaces.entites.FonctionsUtils;

public class Main {

	// TODO où mettre ces 4 fonctions pour que ce soit un code propre ?

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		int menu;
		CompteDaoMem compteDao = new CompteDaoMem();

		do {
			System.out.println("***** Administration des comptes *****");
			System.out.println("1. Lister les comptes");
			System.out.println("2. Ajouter un nouveau compte");
			System.out.println("3. Ajouter une opération à un compte");
			System.out.println("4. Supprimer un compte");
			System.out.println("99. Sortir\n");

			menu = sc.nextInt();

			switch (menu) {
			case 1:
				FonctionsUtils.casListeCompte(compteDao);
				break;
			case 2:
				FonctionsUtils.casAjoutCompte(compteDao, sc);
				break;
			case 3:
				FonctionsUtils.casAjoutOperationCompte(compteDao, sc);
				break;
			case 4:
				FonctionsUtils.casSupprimerCompte(compteDao, sc);
				break;
			case 99:
				System.out.println("Au revoir :(");
				break;
			}

			System.out.println("\n");
		} while (menu != 99);

		sc.close();
	}
}
