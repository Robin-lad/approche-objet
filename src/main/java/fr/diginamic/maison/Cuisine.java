/** 
*
*/
package fr.diginamic.maison;

/**
 * classe qui représente une cuisine
 * 
 * @author robin
 *
 */
public class Cuisine extends Piece {

	/**
	 * Construteur
	 * 
	 * @param superficie superficie
	 * @param etage      etage
	 */
	public Cuisine(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	protected String getType() {
		return "Cuisine";
	}

}
