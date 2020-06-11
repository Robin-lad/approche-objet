package fr.diginamic.geometrie.entites;

public class Rectangle implements ObjetGeometrique {
	private double longueur;
	private double largeur;

	public Rectangle(double longueur, double largeur) {
		super();
		this.longueur = longueur;
		this.largeur = largeur;
	}

	@Override
	public double perimetre() {
		return 2 * (largeur + longueur);
	}

	@Override
	public double surface() {
		return largeur * longueur;
	}

	@Override
	public String toString() {
		return "Rectangle [perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}
}
