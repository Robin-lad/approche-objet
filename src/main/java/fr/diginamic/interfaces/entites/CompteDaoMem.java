package fr.diginamic.interfaces.entites;

import java.util.ArrayList;

public class CompteDaoMem implements CompteDao {

	private ArrayList<Compte> tab;

	public CompteDaoMem() {
		super();
		tab = new ArrayList<Compte>();
	}

	@Override
	public ArrayList<Compte> lister() {
		return tab;
	}

	@Override
	public void sauvegarder(Compte nvCompte) {
		tab.add(nvCompte);
	}

	@Override
	public boolean supprimer(String numero) {
		for (Compte c : tab) {
			if (c.getNumero() == numero) {
				System.out.println("c'est egal");
				tab.remove(c);
				return true;
			} else {
				System.out.println("pas egal");
			}
		}
		return false;
	}

	@Override
	public boolean existe(String numero) {
		for (Compte c : tab) {
			if (c.getNumero() == numero) {
				System.out.println("existe");
				return true;
			} else {
				System.out.println("existe pas");
			}
		}
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		for(Compte c : tab) {
			if (numero.equals(c.getNumero())) {
				System.out.println("compte trouvé");
				return c;
			}
		}
		return null;
	}
}
