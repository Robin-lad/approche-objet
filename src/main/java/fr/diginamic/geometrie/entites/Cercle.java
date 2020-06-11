package fr.diginamic.geometrie.entites;

public class Cercle implements ObjetGeometrique {
	private double rayon;

	public Cercle(double rayon) {
		super();
		this.rayon = rayon;
	}

	@Override
	public double perimetre() {
		return 2 * Math.PI * rayon;
	}

	@Override
	public double surface() {
		return 2 * 2 * Math.PI;
	}

	@Override
	public String toString() {
		return "Cercle [perimetre()=" + perimetre() + ", surface()=" + surface() + "]";
	}
}
