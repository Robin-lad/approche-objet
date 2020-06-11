package fr.diginamic.geometrie;

import java.util.ArrayList;

import fr.diginamic.geometrie.entites.Cercle;
import fr.diginamic.geometrie.entites.ObjetGeometrique;
import fr.diginamic.geometrie.entites.Rectangle;

public class TestObjetGeometrique {

	public static void main(String[] args) {
		ArrayList<ObjetGeometrique> tab = new ArrayList<ObjetGeometrique>();
		Cercle c = new Cercle(3);
		Rectangle r = new Rectangle(4,5);
		tab.add(c);
		tab.add(r);

		for (int i = 0; i < tab.size(); i++) {
			System.out.println(tab.get(i));
		}
	}
}
