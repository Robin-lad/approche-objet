package fr.diginamic.banque.entites;

import java.util.ArrayList;

public class Comptes {
	private int numero;
	private double solde;
	
	private ArrayList<Credits> listCredit;
	private ArrayList<Debits> listDebit;

	public Comptes(int numero, double solde) {
		this.numero = numero;
		this.solde = solde;
		listCredit = new ArrayList<Credits>();
		listDebit = new ArrayList<Debits>();
	}
	
	public void calculNouveauSolde(double d) {
		this.solde = this.solde + d;
	}
	
	public void addCredit(Credits c){
		calculNouveauSolde(c.getMontant());
		this.listCredit.add(c);
	}
	
	public void addDebit(Debits d){
		calculNouveauSolde(-d.getMontant());
		this.listDebit.add(d);
	}

	public ArrayList<Credits> getListCredit() {
		return listCredit;
	}

	public void setListCredit(ArrayList<Credits> listCredit) {
		this.listCredit = listCredit;
	}

	public ArrayList<Debits> getListDebit() {
		return listDebit;
	}

	public void setListDebit(ArrayList<Debits> listDebit) {
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
