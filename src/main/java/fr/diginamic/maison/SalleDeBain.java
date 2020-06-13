/** 
*
*/
package fr.diginamic.maison;

/**
 * classe qui représente une salle de bain
 * 
 * @author robin
 *
 */
public class SalleDeBain extends Piece {

	/**
	 * Construteur
	 * 
	 * @param superficie superficie
	 * @param etage      etage
	 */
	public SalleDeBain(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	protected String getType() {
		return "SalleDeBain";
	}

}
