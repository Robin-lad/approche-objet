package fr.diginamic.interfaces.entites;

import java.util.Scanner;

public class FonctionsUtils {

	public static void casListeCompte(CompteDaoMem compteDao) {
		System.out.println("Liste des comptes");
		for (Compte c : compteDao.lister()) {
			System.out.println(c);
		}
	}

	public static void casAjoutCompte(CompteDaoMem compteDao, Scanner sc) {
		System.out.println("Ajout d'un nouveau compte");
		System.out.println("Veuillez saisir le numéro :");
		String num = sc.next();
		System.out.println("Veuillez saisir le solde initial :");
		double solde = sc.nextDouble();
		System.out.println("Veuillez saisir le type de compte(1: NORMAL, 2: REMUNERE) :");
		int type = sc.nextInt();

		if (!compteDao.existe(num)) {
			if (type == 1) {
				compteDao.sauvegarder(new Compte(num, solde));
			} else if (type == 2) {
				System.out.println("Veuillez saisir le taux :");
				double taux = sc.nextDouble();
				compteDao.sauvegarder(new CompteTaux(num, solde, taux));
			}
		} else {
			System.out.println("Le numero de compte existe déjà");
		}
	}

	public static void casAjoutOperationCompte(CompteDaoMem compteDao, Scanner sc) {
		System.out.println("Ajout d'une opération à un compte");
		System.out.println("Veuillez choisir le numéro du compte concerné :");
		String numCpt = sc.next();

		if (compteDao.existe(numCpt)) {
			System.out.println("Veuillez saisir le type d'opération (1: CREDIT, 2: DEBIT):");
			int operation = sc.nextInt();
			System.out.println("Veuillez saisir la date");
			String date = sc.next();
			System.out.println("Veuillez saisir le montant");
			double montant = sc.nextDouble();

			if (operation == 1) {
				compteDao.getCompte(numCpt).addCredit(new Credit(date, montant));
			} else {
				compteDao.getCompte(numCpt).addDebit(new Debit(date, montant));
			}

		} else {
			System.out.println("Ce numéro de compte n'existe pas");
		}
	}

	public static void casSupprimerCompte(CompteDaoMem compteDao, Scanner sc) {
		System.out.println("Suppression d'un compte");
		System.out.println("Veuillez saisir le numéro du compte à supprimer :");
		String suppr = sc.next();
		if (compteDao.supprimer(suppr)) {
			System.out.println("Compte bien supprimé ! youhou !!");
		} else {
			System.out.println("Ce numéro de compte n'existe pas");
		}
	}

}
