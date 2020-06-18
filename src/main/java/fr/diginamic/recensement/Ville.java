/** 
*
*/
package fr.diginamic.recensement;

/**
 * classe représentant une ville 
 * @author robin
 *
 */
public class Ville {
	/** codeRegion code de la région*/
	private int codeRegion;
	/** nomRegion nom de la region*/
	private String nomRegion;
	/** codeDepartement code du departement*/
	private String codeDepartement;
	/** codeCommune code de la commune*/
	private int codeCommune;
	/** nomCommune nom de la commune*/
	private String nomCommune;
	/** populationTotale population totale de la ville*/
	private int populationTotale;

	/** Construteur
	 * @param codeRegion code region
	 * @param nomRegion nom region
	 * @param codeDepartement code departement
	 * @param codeCommune code commune
	 * @param nomCommune nom commune
	 * @param populationTotale population totale
	 */
	public Ville(int codeRegion, String nomRegion, String codeDepartement, int codeCommune, String nomCommune,
			int populationTotale) {
		super();
		this.codeRegion = codeRegion;
		this.nomRegion = nomRegion;
		this.codeDepartement = codeDepartement;
		this.codeCommune = codeCommune;
		this.nomCommune = nomCommune;
		this.populationTotale = populationTotale;
	}
	
	// j'ai enlevé les setter car on ne va pas changer les données lues dans le fichier.

	/**
	 * Getter
	 * 
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the nomRegion
	 */
	public String getNomRegion() {
		return nomRegion;
	}

	/**
	 * Getter
	 * 
	 * @return the codeDepartement
	 */
	public String getCodeDepartement() {
		return codeDepartement;
	}

	/**
	 * Getter
	 * 
	 * @return the codeCommune
	 */
	public int getCodeCommune() {
		return codeCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the nomCommune
	 */
	public String getNomCommune() {
		return nomCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}
}
