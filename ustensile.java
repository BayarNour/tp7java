package devoir7;

public abstract class ustensile {
	private int annee;
	public ustensile(int annee) {
		this.annee=annee;
	}

	public int getAnnee() {
		return annee;
	}

	public void setAnnee(int annee) {
		this.annee = annee;
	}
	public double ustensile() {
		double age=2024-annee;
		if (age <50) {
			return 0;
			
		}
		else{
			return age-50;
			
			
			
			
		}
	}
	
	
}
