package fr.diginamic.essais;

import fr.diginamic.entites.Cercle;
import fr.diginamic.utils.CercleFactory;

/** 
 * Class main pour tester Cercle
 * @author robin
 *
 */
public class TestCercle {

	/** Main
	 * @param args void
	 */
	public static void main(String[] args) {
		Cercle cercle1 = CercleFactory.créerCercle(2);
		Cercle cercle2 = new Cercle(5.2);
		
		System.out.println(cercle1);
		System.out.println(cercle2);
	}
}
