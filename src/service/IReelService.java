package service;

import metier.Reel;

public interface IReelService {
	/**
	 * Additionne deux nombres reels
	 * @param x Premier nombre à additionner
	 * @param y Second nombre à additionner
	 * @return Le resultat de l'addition
	 */
	public Reel addition(Reel x, Reel y);
	/**
	 * Soustrait deux nombres reels
	 * @param x Nombre reel
	 * @param y Nombre reel a soustraire
	 * @return Le resultat de la soustraction
	 */
	public Reel soustraction(Reel x, Reel y);
}
