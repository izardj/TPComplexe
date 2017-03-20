package service;

import metier.Complexe;

public class ComplexeService implements IComplexeService {

	@Override
	public Complexe addition(Complexe x, Complexe y) {
		Complexe resultat = new Complexe();
		resultat.setIm(x.getIm() + y.getIm());
		resultat.setRe(x.getRe() + y.getRe());
		return resultat;
	}

	@Override
	public Complexe soustraction(Complexe x, Complexe y) {
		Complexe resultat = new Complexe();
		resultat.setIm(x.getIm() - y.getIm());
		resultat.setRe(x.getRe() - y.getRe());
		return resultat;
	}

}
