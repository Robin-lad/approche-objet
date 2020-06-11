package fr.diginamic.banque.entites;

public class Debits extends Operations {

	public Debits(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String toString() {
		return "Debit " + super.toString();
	}
}
