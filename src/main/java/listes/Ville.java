/** 
*
*/
package listes;

/**
 * @author robin
 *
 */
public class Ville {
	public String nom;
	public int nbHabitants;

	public Ville(String nom, int nbHabitants) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}

	@Override
	public String toString() {
		return "Ville " + nom + ", nbHabitants=" + nbHabitants + " \n";
	}

}
