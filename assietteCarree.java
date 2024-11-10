package devoir7;

public class assietteCarree extends assiette {
		private double cote ;
		public assietteCarree(int annee,double cote) {
			super(annee);
			this.cote=cote;
		}

	public double getCote() {
		return cote;
	}

	public void setCote(double cote) {
		this.cote = cote;
	}
	

	public double surface() {
		return cote*cote;
		
		}
	public double ustensile() {
		return super.ustensile() *5;
				}
	

}
