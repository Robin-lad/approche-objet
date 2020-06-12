/** 
*
*/
package fr.diginamic.operations;

/**
 * @author robin
 *
 */
public class Operations {

	public static double calcul(double a, double b, char ope) {
		switch(ope) {
		case '+': return a+b;
		case '-': return a-b;
		case '*': return a*b;
		case '/': return a/b;
		default: return -1;
		}
	}
}
