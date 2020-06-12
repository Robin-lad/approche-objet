/** 
*
*/
package fr.diginamic.operations;

import java.util.ArrayList;

/**
 * @author robin
 *
 */
public class CalculMoyenne {
	
	/** tab tableau de double sur lequelle on fait la moyenne*/
	private ArrayList<Double> tab;

	/** Construteur
	 * 
	 */
	public CalculMoyenne() {
		super();
		tab = new ArrayList<Double>();
	}
	
	/**
	 * @param d double à ajouter dans tab
	 */
	public void ajoutTableau(double d) {
		tab.add(d);
	}

	/**
	 * @return double équivalent à la moyenne du tableau
	 */
	public double calcul() {
		double res = 0;

		for (int i = 0; i < tab.size(); i++) {
			res += tab.get(i);
		}
		return res / tab.size();
	}

	/**
	 * Getter
	 * 
	 * @return the tab
	 */
	public ArrayList<Double> getTab() {
		return tab;
	}

	/**
	 * Setter
	 * 
	 * @param tab the tab to set
	 */
	public void setTab(ArrayList<Double> tab) {
		this.tab = tab;
	}
}
