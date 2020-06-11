package fr.diginamic.banque.entites;

public class Credits extends Operations {

	public Credits(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String toString() {
		return "Credit " + super.toString();
	}
}
