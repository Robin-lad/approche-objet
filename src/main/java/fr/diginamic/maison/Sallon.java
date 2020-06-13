/** 
*
*/
package fr.diginamic.maison;

/**
 * classe qui représente un sallon
 * 
 * @author robin
 *
 */
public class Sallon extends Piece {

	/**
	 * Construteur
	 * 
	 * @param superficie superficie
	 * @param etage      etage
	 */
	public Sallon(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	protected String getType() {
		return "Sallon";
	}

}
