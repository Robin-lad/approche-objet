/** 
*
*/
package fr.diginamic.recensement;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * classe qui lit le fichier et crée des objets Ville
 * @author robin
 *
 */
public class Fichier {

	/**
	 * lecture du fichier et crée des objets Ville
	 * @param s string chemin vers le fichier
	 */
	public static void lectureFichier(String s) {
		try {
			File f = new File(s);
			List<String> lignes = FileUtils.readLines(f, "UTF-8");
			lignes.remove(0);
			for (String ligne : lignes) {
				String[] morceaux = ligne.split(";");
//				String codeRegion = morceaux[0];
//				String nomRegion = morceaux[1];
//				String codeDepartement = morceaux[2];
//				String codeCommune = morceaux[5];
//				String nomCommune = morceaux[6];
//				String population = morceaux[7];

				Recensement.getVilles()
						.add(new Ville(Integer.parseInt(morceaux[0].replaceAll("\\s+", "")), morceaux[1], morceaux[2],
								Integer.parseInt(morceaux[5].replaceAll("\\s+", "")), morceaux[6],
								Integer.parseInt(morceaux[7].replaceAll("\\s+", ""))));
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
