/** 
*
*/
package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

/**
 * @author robin
 *
 */
public class TestMoyenne {

	/**
	 * Main
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		CalculMoyenne tabMoyenne = new CalculMoyenne();
		tabMoyenne.ajoutTableau(10);
		tabMoyenne.ajoutTableau(20);
		tabMoyenne.ajoutTableau(10);
		tabMoyenne.ajoutTableau(20);

		System.out.println(tabMoyenne.calcul());
		
		tabMoyenne.ajoutTableau(18);
		tabMoyenne.ajoutTableau(14);
		tabMoyenne.ajoutTableau(2);
		tabMoyenne.ajoutTableau(17.5);
		
		System.out.println(tabMoyenne.calcul());
	}
}
