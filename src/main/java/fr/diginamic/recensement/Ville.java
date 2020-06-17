/** 
*
*/
package fr.diginamic.recensement;

/**
 * @author robin
 *
 */
public class Ville {
	private int codeRegion;
	private String nomRegion;
	private String codeDepartement;
	private int codeCommune;
	private String nomCommune;
	private int populationTotale;

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

	/**
	 * Getter
	 * 
	 * @return the codeRegion
	 */
	public int getCodeRegion() {
		return codeRegion;
	}

	/**
	 * Setter
	 * 
	 * @param codeRegion the codeRegion to set
	 */
	public void setCodeRegion(int codeRegion) {
		this.codeRegion = codeRegion;
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
	 * Setter
	 * 
	 * @param nomRegion the nomRegion to set
	 */
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
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
	 * Setter
	 * 
	 * @param codeDepartement the codeDepartement to set
	 */
	public void setCodeDepartement(String codeDepartement) {
		this.codeDepartement = codeDepartement;
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
	 * Setter
	 * 
	 * @param codeCommune the codeCommune to set
	 */
	public void setCodeCommune(int codeCommune) {
		this.codeCommune = codeCommune;
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
	 * Setter
	 * 
	 * @param nomCommune the nomCommune to set
	 */
	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	/**
	 * Getter
	 * 
	 * @return the populationTotale
	 */
	public int getPopulationTotale() {
		return populationTotale;
	}

	/**
	 * Setter
	 * 
	 * @param populationTotale the populationTotale to set
	 */
	public void setPopulationTotale(int populationTotale) {
		this.populationTotale = populationTotale;
	}

	@Override
	public String toString() {
		return "Ville [codeRegion=" + codeRegion + ", nomRegion=" + nomRegion + ", codeDepartement=" + codeDepartement
				+ ", codeCommune=" + codeCommune + ", nomCommune=" + nomCommune + ", populationTotale="
				+ populationTotale + "]";
	}
}
