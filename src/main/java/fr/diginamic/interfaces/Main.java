package fr.diginamic.interfaces;

import java.util.Locale;
import java.util.Scanner;

import fr.diginamic.interfaces.entites.Compte;
import fr.diginamic.interfaces.entites.CompteDaoMem;
import fr.diginamic.interfaces.entites.CompteTaux;
import fr.diginamic.interfaces.entites.Credit;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		;
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
				System.out.println("Liste des comptes");
				for (Compte c : compteDao.lister()) {
					System.out.println(c);
				}
				break;
			case 2:
				System.out.println("Ajout d'un nouveau compte");
				System.out.println("Veuillez saisir le numéro :");
				String num = sc.next();
				System.out.println("Veuillez saisir le solde initial :");
				double solde = sc.nextDouble();
				System.out.println("Veuillez saisir le type de compte(1: NORMAL, 2: REMUNERE) :");
				int type = sc.nextInt();

				if (type == 1) {
					compteDao.sauvegarder(new Compte(num, solde));
				} else if (type == 2) {
					System.out.println("Veuillez saisir le taux :");
					double taux = sc.nextDouble();
					compteDao.sauvegarder(new CompteTaux(num, solde, taux));
				}
				break;
			case 3:
				System.out.println("Ajout d'une opération à un compte");
				System.out.println("Veuillez choisir le numéro du compte concerné :");
				String numCpt = sc.next();
				for (Compte c : compteDao.lister()) {
					if (numCpt.equals(c.getNumero())) {
						System.out.println("Veuillez saisir le type d'opération (1: CREDIT, 2: DEBIT):");
						int operation = sc.nextInt();
						System.out.println("Veuillez saisir la date");
						String date = sc.next();
						System.out.println("Veuillez saisir le montant");
						double montant = sc.nextDouble();

						if (operation == 1) {
							c.addCredit(new Credit(date,montant));
						} else {

						}
					}
				}

				break;
			case 4:
				System.out.println("Suppression d'un compte");
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
