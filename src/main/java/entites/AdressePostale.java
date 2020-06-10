package entites;

public class AdressePostale {
	private int numero;
	private String libelle;
	private int code;
	private String ville;

	public AdressePostale(int n, String l, int c, String v) {
		this.numero = n;
		this.libelle = l;
		this.code = c;
		this.ville = v;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getLibelle() {
		return libelle;
	}

	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	
	public String toString() {
		return " Num : " + numero + " " + libelle + " " + code + " " + ville ;
	}
}
