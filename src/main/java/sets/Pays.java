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

}
