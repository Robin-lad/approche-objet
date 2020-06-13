/** 
*
*/
package fr.diginamic.maison;

/**
 * classe qui représente un wc
 * 
 * @author robin
 *
 */
public class WC extends Piece {

	/**
	 * Construteur
	 * 
	 * @param superficie superficie
	 * @param etage      etage
	 */
	public WC(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	protected String getType() {
		return "WC";
	}

}
