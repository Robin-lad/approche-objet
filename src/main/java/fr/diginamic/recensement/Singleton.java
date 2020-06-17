/** 
*
*/
package fr.diginamic.recensement;

import java.io.Serializable;

/**
 * @author robin
 *
 */
public class Singleton implements Serializable {
	/** serialVersionUID */
	private static final long serialVersionUID = 1L;

	/** Constructeur privé */
	private Singleton() {
	}

	/** Instance unique pré-initialisée */
	private static Singleton INSTANCE = new Singleton();

	/** Point d'accès pour l'instance unique du singleton */
	public static Singleton getInstance() {
		return INSTANCE;
	}

	/** Sécurité anti-désérialisation */
	private Object readResolve() {
		return INSTANCE;
	}
}
