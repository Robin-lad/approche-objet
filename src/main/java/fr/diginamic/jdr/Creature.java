/** 
*
*/
package fr.diginamic.jdr;

/**
 * Classe représentant une créature
 * 
 * @author robin
 *
 */
public abstract class Creature {
	/** force force */
	private int force;
	/** pv points de vie */
	private int pv;

	/** MIN_ATQ attaque minimale ajoutée à la force */
	protected static final int MIN_ATQ = 1;
	/** MAX_ATQ attaque maximale ajoutée à la force */
	protected static final int MAX_ATQ = 10;

	/**
	 * calcule le montant de dégat du coup que va faire la créature
	 * 
	 * @return int
	 */
	public int calculAttaque() {
		return this.force + (int) (Math.random() * MAX_ATQ + MIN_ATQ);
	}

	/**
	 * retourne le score que donne la créature en mourrant
	 * 
	 * @return int
	 */
	public abstract int getScoreDonne();

	/**
	 * retourne le type de la créature : personnage / loup / gobelin etc..
	 * 
	 * @return String
	 */
	public abstract String getType();

	/**
	 * Getter
	 * 
	 * @return the force
	 */
	public int getForce() {
		return force;
	}

	/**
	 * Setter
	 * 
	 * @param force the force to set
	 */
	public void setForce(int force) {
		this.force = force;
	}

	/**
	 * Getter
	 * 
	 * @return the pv
	 */
	public int getPv() {
		return pv;
	}

	/**
	 * Setter
	 * 
	 * @param pv the pv to set
	 */
	public void setPv(int pv) {
		this.pv = pv;
	}

	/**
	 * toString
	 * 
	 * @return String
	 */
	@Override
	public String toString() {
		return "force=" + force + ", pv=" + pv;
	}
}
