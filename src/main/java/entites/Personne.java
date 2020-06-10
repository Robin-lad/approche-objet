package entites;

public class Personne {
 
	private String nom;
	private String prenom;
	private AdressePostale adressePostale;

	public Personne(String p, String n) {
		this.prenom = p;
		this.nom = n;
	}

	public Personne(String p, String n, AdressePostale ap) {
		this.prenom = p;
		this.nom = n;
		this.adressePostale = ap;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public AdressePostale getAdressePostale() {
		return adressePostale;
	}

	public void setAp(AdressePostale ap) {
		this.adressePostale = ap;
	}

	public String toString() {
		return prenom + " " + nom.toUpperCase() + " " + adressePostale;
	}
}
