package devoir7;

public class collection {
	public static void main(String[] args) {
		ustensile[] us = new ustensile[5];
		us[0]= new assietteRonde(1926,8.4);
		us[1]= new cuillere(1881,7.3); 
		us[2]= new assietteCarree(1935,5.6); 
		us[3]= new cuillere(1917, 8.8);
		us[4]= new assietteRonde(1837, 5.4);
		
		afficherCuilleres(us);
		afficherSurfaceAssiettes(us);
		afficherValeurTotale(us);
		}
		static void afficherCuilleres(ustensile[] us) {
		int nbCuilleres = 0;
			for (int i = 0; i <us.length; i++) {
				 if (us[i] instanceof cuillere) {
					 nbCuilleres++;
					 
				 }
			
			}
			
		System.out.println("Il y a " + nbCuilleres + " cuillères.");
		}
		
		
		
		static void afficherSurfaceAssiettes(ustensile[] us) {
		double somme = 0;
		for (int i = 0; i<us.length; i++) {
			if(us[i] instanceof assiette)
			{
				double s=((assiette)us[i]).surface();
				somme=somme+s;
				}
			
		}
		System.out.println("Surface totale des assiettes : " + somme);
		}
		
		
		static void afficherValeurTotale(ustensile[] us) {
		double somme = 0;
		for (int i = 0; i<us.length; i++) {
			somme=somme+us[i].ustensile();
		}
		
		System.out.println("Valeur totale de la collection : " + somme);
		}

}
