package fr.diginamic.banque.entites;

public class CompteTaux extends Comptes {
	private double tauxRemun;

	public CompteTaux(int numero, double solde, double tauxRemun) {
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
		return super.toString() +  "[tauxRemun=" + tauxRemun + "]";
		//return super.toString().substring(0, super.toString().length() - 1) +  ", tauxRemun=" + tauxRemun + "]";
	}
}
