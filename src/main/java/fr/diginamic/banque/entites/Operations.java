package fr.diginamic.banque.entites;

public abstract class Operations {
	private String date;
	private double montant;
	
	public Operations(String date, double montant) {
		this.date = date;
		this.montant = montant;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public double getMontant() {
		return montant;
	}
	
	public void setMontant(double montant) {
		this.montant = montant;
	}

	@Override
	public String toString() {
		return "[date=" + date + ", montant=" + montant + "]";
	}
}
