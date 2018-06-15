package ex2;

public class LivretA extends CompteBancaire {
	
	/** tauxRemuneration : taux de rémunération dans le cas d'un livret A */
	private double tauxRemuneration;

	public LivretA(double solde, double tauxRemuneration) {
		super(solde);
		this.tauxRemuneration =  tauxRemuneration ;
	}

	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
			if (this.solde - montant > 0){
				this.solde = solde - montant;
			}	
		}

	
	/** Ajoute un montant au solde par le taux de remuneration
	 */
	public void appliquerRemuAnnuelle(){
			super.solde =+ solde*tauxRemuneration/100;

	}
	
	/** Getter for tauxRemuneration
	 * @return the tauxRemuneration
	 */
	public double getTauxRemuneration() {
		return tauxRemuneration;
	}
	/** Setter
	 * @param tauxRemuneration the tauxRemuneration to set
	 */
	public void setTauxRemuneration(double tauxRemuneration) {
		this.tauxRemuneration = tauxRemuneration;
	}
	
}
