package fr.diginamic.interfaces.entites;

public class Debit extends Operation {

	public Debit(String date, double montant) {
		super(date, montant);
	}

	@Override
	public String toString() {
		return "Debit " + super.toString();
	}
}
