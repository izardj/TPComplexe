package metier;
/**
 * Classe representant un nombre reel
 * @author Stagiaire
 *
 */
public class Reel {
	private double x;

	/**
	 * Constructeur par defaut
	 */
	public Reel() {
		super();
	}

	/**
	 * Constructeur avec argument
	 * @param x nombre reel
	 */
	public Reel(double x) {
		super();
		this.x = x;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	@Override
	public String toString() {
		return "Reel [x=" + x + "]";
	}
	
}
