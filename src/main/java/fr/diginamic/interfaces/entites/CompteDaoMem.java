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
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).getNumero().equals(numero)) {
				tab.remove(tab.get(i));
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean existe(String numero) {
		for (int i = 0; i < tab.size(); i++) {
			if (tab.get(i).getNumero().equals(numero)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public Compte getCompte(String numero) {
		for (int i = 0; i < tab.size(); i++) {
			if (numero.equals(tab.get(i).getNumero())) {
				return tab.get(i);
			}
		}
		return null;
	}
}
