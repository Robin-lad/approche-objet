package fr.diginamic.interfaces.entites;

public class CompteTaux extends Compte {
	private double tauxRemun;

	public CompteTaux(String numero, double solde, double tauxRemun) {
		super(numero, solde);
		this.tauxRemun = tauxRemun;
	}

	public double getTauxRemun() {
		return tauxRemun;
	}

	public void setTauxRemun(double tauxRemun) {
		this.tauxRemun = tauxRemun;
	}

	@Override
	public String toString() {
		return super.toString() + " - Taux: " + tauxRemun + " %";
	}
}
