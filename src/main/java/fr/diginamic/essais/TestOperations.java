/** 
*
*/
package fr.diginamic.essais;

import fr.diginamic.operations.Operations;

/**
 * Classe pour tester les opérations
 * 
 * @author robin
 *
 */
public class TestOperations {

	/**
	 * Main
	 * 
	 * @param args void
	 */
	public static void main(String[] args) {
		System.out.println(Operations.calcul(2.5, 2, '+'));
		System.out.println(Operations.calcul(5, 3.5, '-'));
		System.out.println(Operations.calcul(10.5, 5, '*'));
		System.out.println(Operations.calcul(20, 19, '/'));
	}
}
