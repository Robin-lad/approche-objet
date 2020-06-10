package fr.diginamic.banque.entites;

import java.util.ArrayList;

public class Compte {
	private int numero;
	private double solde;
	
	private ArrayList<Credit> listCredit;
	private ArrayList<Debit> listDebit;

	public Compte(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
		listCredit = new ArrayList<Credit>();
		listDebit = new ArrayList<Debit>();
	}
	
	public void calculNouveauSolde(double d) {
		this.solde = this.solde + d;
	}
	
	public void addCredit(Credit c){
		calculNouveauSolde(c.getMontant());
		this.listCredit.add(c);
		
	}
	
	public void addDebit(Debit d){
		calculNouveauSolde(-d.getMontant());
		this.listDebit.add(d);
	}

	public ArrayList<Credit> getListCredit() {
		return listCredit;
	}

	public void setListCredit(ArrayList<Credit> listCredit) {
		this.listCredit = listCredit;
	}

	public ArrayList<Debit> getListDebit() {
		return listDebit;
	}

	public void setListDebit(ArrayList<Debit> listDebit) {
		this.listDebit = listDebit;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSolde() {
		return solde;
	}

	public void setSolde(double solde) {
		this.solde = solde;
	}

	@Override
	public String toString() {
		return "Compte [numero=" + numero + ", solde=" + solde + "]\n\t" + listCredit + "\n\t" + listDebit +"\n";
	}
}
