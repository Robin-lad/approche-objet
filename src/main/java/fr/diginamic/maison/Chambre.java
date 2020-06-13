/** 
*
*/
package fr.diginamic.maison;

/**
 * classe qui représente une chambre
 * 
 * @author robin
 *
 */
public class Chambre extends Piece {

	/**
	 * Construteur
	 * 
	 * @param superficie superficie
	 * @param etage      etage
	 */
	public Chambre(double superficie, int etage) {
		super(superficie, etage);
	}

	@Override
	protected String getType() {
		return "Chambre";
	}

}
