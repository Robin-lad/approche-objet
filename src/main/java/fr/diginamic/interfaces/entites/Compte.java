package fr.diginamic.interfaces.entites;

import java.util.ArrayList;
import fr.diginamic.banque.entites.Credits;
import fr.diginamic.banque.entites.Debits;

public class Compte {
	private String numero;
	private double solde;
	private int nombreOpe;

	private ArrayList<Credit> credits;
	private ArrayList<Debit> debits;

	public Compte(String numero, double solde) {
		this.numero = numero;
		this.solde = solde;
		this.nombreOpe = 0;
		credits = new ArrayList<Credit>();
		debits = new ArrayList<Debit>();
	}

	public void addCredit(Credit c) {
		this.credits.add(c);
	}

	public void addDebit(Debit d) {
		this.debits.add(d);
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	public int getNombreOpe() {
		return nombreOpe;
	}

	public void setNombreOpe(int nombreOpe) {
		this.nombreOpe = nombreOpe;
	}

	public ArrayList<Credit> getCredits() {
		return credits;
	}

	public void setCredits(ArrayList<Credit> credits) {
		this.credits = credits;
	}

	public ArrayList<Debit> getDebits() {
		return debits;
	}

	public void setDebits(ArrayList<Debit> debits) {
		this.debits = debits;
	}

	@Override
	public String toString() {
		return "Numero : " + numero + " - Nombre d'opérations: " + nombreOpe + " - Solde: " + solde + "€";
	}
}
