package service;

import metier.Complexe;

public interface IComplexeService {
	/**
	 * Additionne deux nombres complexes
	 * @param x Premier nombre à additionner
	 * @param y Second nombre à additionner
	 * @return Le resultat de l'addition
	 */
	public Complexe addition(Complexe x, Complexe y);
	/**
	 * Soustrait deux nombres complexes
	 * @param x Nombre complexe
	 * @param y Nombre complexe a soustraire
	 * @return Le resultat de la soustraction
	 */
	public Complexe soustraction(Complexe x, Complexe y);
}
