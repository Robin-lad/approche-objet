/** 
*
*/
package sets;

/**
 * @author robin
 *
 */
public class Pays {
	public String nom;
	public int nbHabitants;
	public int pibParHab;

	public Pays(String nom, int nbHabitants, int pibParHab) {
		super();
		this.nom = nom;
		this.nbHabitants = nbHabitants;
		this.pibParHab = pibParHab;
	}

	@Override
	public String toString() {
		return "Pays " + nom + ", nbHabitants = " + nbHabitants + ", pibParHab = " + pibParHab + "\n";
	}

	/**
	 * Getter
	 * 
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Setter
	 * 
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * Getter
	 * 
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * Setter
	 * 
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * Getter
	 * 
	 * @return the pibParHab
	 */
	public int getPibParHab() {
		return pibParHab;
	}

	/**
	 * Setter
	 * 
	 * @param pibParHab the pibParHab to set
	 */
	public void setPibParHab(int pibParHab) {
		this.pibParHab = pibParHab;
	}

}
