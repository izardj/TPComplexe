package service;

import metier.Reel;

public class ReelService implements IReelService {

	@Override
	public Reel addition(Reel x, Reel y) {
		Reel resultat = new Reel();
		resultat.setX(x.getX() + y.getX());
		return resultat;
	}

	@Override
	public Reel soustraction(Reel x, Reel y) {
		Reel resultat = new Reel();
		resultat.setX(x.getX() - y.getX());
		return resultat;
	}

}
