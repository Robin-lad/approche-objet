/** 
*
*/
package fr.diginamic.salaire;

/**
 * classe abstraite qui représente un intervenant
 * 
 * @author robin
 *
 */
public abstract class Intervenant {

	/** prenom de l'intervenant */
	protected String prenom;
	/** nom de l'intervenant */
	protected String nom;

	/**
	 * Construteur
	 * 
	 * @param prenom prenom d'un intervenant
	 * @param nom    nom d'un intervenant
	 */
	public Intervenant(String prenom, String nom) {
		super();
		this.prenom = prenom;
		this.nom = nom;
	}


	/** retourne le salaire 
	 * @return double
	 */
	public abstract double getSalaire();

	/**
	 * Affiche le toString fille en fonction de si on est un salarié ou pigiste et appelle le tostring Mère
	 */
	public void afficherDonnees() {
		System.out.println(this);
	}

	@Override
	public String toString() {
		return " prenom = " + prenom + "    nom = " + nom + "    salaire = " + this.getSalaire();
	}
}
