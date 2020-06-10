package essais;

import entites.AdressePostale;
import entites.Personne;

public class TestPersonne {

	public static void main(String[] args) {

		AdressePostale a1 = new AdressePostale(16, "rue de metz", 57000, "Metz");
		AdressePostale a2 = new AdressePostale(22, "rue des plantes", 00002, "Nulpart");
		Personne p1 = new Personne("Bob", "dupont", a1);

		System.out.println(p1);
		p1.setNom("avecunnom");
		p1.setPrenom("Boby");
		p1.setAp(a2);

		String a = p1.getNom();
		String b = p1.getPrenom();
		AdressePostale c = p1.getAdressePostale();
	}
}