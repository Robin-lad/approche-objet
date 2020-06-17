/** 
*
*/
package fr.diginamic.fichier;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

/**
 * @author robin
 *
 */
public class LectureFichier {

	/**
	 * @param args void
	 */
	public static void main(String[] args) {

		try {
			File f = new File("D:\\Telechargements\\recensement_2016.csv");
			List<String> lignes = FileUtils.readLines(f, "UTF-8");

			for (String ligne : lignes) {
				System.out.println(ligne);
			}

			System.out.println("Nombre de lignes :" + lignes.size());

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
