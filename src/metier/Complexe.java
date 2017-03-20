package metier;
/**
 * Classe representant un nombre complexe
 * @author Stagiaire
 *
 */
public class Complexe {
	private double im;
	private double re;
	
	/**
	 * Constructeur par defaut
	 */
	public Complexe() {
		super();
	}
	/**
	 * Constructeur prenant les deux parties d'un nombre complexe
	 * @param im partie imaginaire
	 * @param re partie reelle
	 */
	public Complexe(double im, double re) {
		super();
		this.im = im;
		this.re = re;
	}
	public double getIm() {
		return im;
	}
	public void setIm(double im) {
		this.im = im;
	}
	public double getRe() {
		return re;
	}
	public void setRe(double re) {
		this.re = re;
	}
	@Override
	public String toString() {
		return "Complexe [im=" + im + ", re=" + re + "]";
	}
	
	
}
