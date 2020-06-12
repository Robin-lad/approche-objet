/** 
*
*/
package fr.diginamic.operations;

/**
 * Classe qui fait des calculs
 * 
 * @author robin
 *
 */
public class Operations {

	/**
	 * Methode qui fait un calcul entre a et b avec l'operateur ope
	 * 
	 * @param a   double pour faire un calcul
	 * @param b   double pour faire un calcul
	 * @param ope operateur du calcul à faire sur a et b
	 * @return double résultat de l'operation
	 */
	public static double calcul(double a, double b, char ope) {
		switch (ope) {
		case '+':
			return a + b;
		case '-':
			return a - b;
		case '*':
			return a * b;
		case '/':
			return a / b;
		default:
			return -1;
		}
	}
}
