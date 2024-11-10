package devoir7;

public class cuillere extends ustensile {
	private double longeur ;
	public cuillere(int annee, double longeur) {
		super(annee);
		this.longeur=longeur;
		
	}

	public double getLongeur() {
		return longeur;
	}

	public void setLongeur(double longeur) {
		this.longeur = longeur;
	}
	

}
