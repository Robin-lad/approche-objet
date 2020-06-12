/** 
*
*/
package fr.diginamic.formes;

/**
 * abstract classe Forme avec les calculs de surface et perimetre
 * 
 * @author robin
 *
 */
public abstract class Forme {

	/**
	 * Methode qui calcule la surface d'une forme
	 * 
	 * @return la surface de la forme
	 */
	public abstract double calculerSurface();

	/**
	 * Methode qui calcule le perimetre d'une forme
	 * 
	 * @return le perimetre de la forme
	 */
	public abstract double calculerPerimetre();

}
