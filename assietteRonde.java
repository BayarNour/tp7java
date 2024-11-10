package devoir7;

public class assietteRonde extends assiette {
	private double rayon;
	
	public assietteRonde(int annee,double rayon) {
		super(annee);
		this.rayon=rayon;
	}

	public double getRayon() {
		return rayon;
	}

	public void setRayon(double rayon) {
		this.rayon = rayon;
	}
	public double surface() {
		return 3.14 * rayon *rayon;
		
		}

}
