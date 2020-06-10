package entites;

public class Personne {

	private String nom;
	private String prenom;
	private AdressePostale adressePostale;
	
	public Personne(String n, String p) {
		this.nom = n;
		this.prenom = p;
	}

	public Personne(String n, String p, AdressePostale ap) {
		this.nom = n;
		this.prenom = p;
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
}
