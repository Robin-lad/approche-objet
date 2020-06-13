/** 
*
*/
package fr.diginamic.maison;

/**Classe qui représente une piece
 * @author robin
 *
 */
public abstract class Piece {
	/** superficie superficie*/
	protected double superficie;
	/** etage etage*/
	protected int etage;
	
	/** Construteur
	 * @param superficie superficie de la piece
	 * @param etage etage de la piece
	 */
	public Piece(double superficie, int etage) {
		super();
		this.superficie = superficie;
		this.etage = etage;
	}

	/** retourne le type de piece 
	 * @return String
	 */
	protected abstract String getType();
}
