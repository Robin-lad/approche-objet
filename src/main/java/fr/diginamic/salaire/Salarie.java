/** 
*
*/
package fr.diginamic.salaire;

/**
 * classe qui représente un salarié
 * 
 * @author robin
 *
 */
public class Salarie extends Intervenant {

	private double salaire;

	/**
	 * Construteur
	 * 
	 * @param prenom  prenom du salarié
	 * @param nom     nom du salarié
	 * @param salaire salaire du salarié
	 */
	public Salarie(String prenom, String nom, double salaire) {
		super(prenom, nom);
		this.salaire = salaire;
	}

	/**
	 * Getter
	 * 
	 * @return the salaire
	 */
	@Override
	public double getSalaire() {
		return salaire;
	}

	@Override
	public String toString() {
		return "Salarie " + super.toString();
	}

}
