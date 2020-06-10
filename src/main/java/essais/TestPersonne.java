package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale a1 = new AdressePostale(1, "tbde", 00001, "Metz");
		Personne p1 = new Personne("Bob", "Sansnom", a1);
	}
}
