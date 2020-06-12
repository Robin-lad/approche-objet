/** 
*
*/
package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.interfaces.entites.Compte;

/**
 * @author robin
 *
 */
public class ManipulationChaines {

	/**
	 * différentes manipulations de chaines
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		String chaine = "Durand;Marcel;012543;1 523.5";

		char premierCaractere = chaine.charAt(0);
		System.out.println("Premier caractère: " + premierCaractere);
		System.out.println(chaine.length());
		System.out.println(chaine.indexOf(";"));
		System.out.println(chaine.substring(0, chaine.indexOf(";")));
		System.out.println(chaine.substring(0, chaine.indexOf(";")).toUpperCase());
		System.out.println(chaine.substring(0, chaine.indexOf(";")).toLowerCase());
		String[] str = chaine.split(";");
		System.out.println(Arrays.toString(str));

		String s = str[3].replaceAll("\\s", "");
		// On a pas fait de classe client dans les tp d'avant
		Compte c1 = new Compte(str[2], Double.parseDouble(s));
		System.out.println(c1);

	}
}
