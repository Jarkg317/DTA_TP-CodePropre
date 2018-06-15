package ex2;

/** Représente un compte bancaire
 * @author DIGINAMIC
 */

public class CompteBancaire {

	/** solde : solde du compte */
	protected double solde;
	
	/** decouvert : un découvert est autorisé seulement pour les comptes courants */
	private double decouvert;		
	
	/**
	 * Constructeur d'un Compte courante
	 * @param solde
	 * @param decouvert
	 */
	public CompteBancaire(double solde, double decouvert) {
		this.solde = solde;
		this.decouvert = decouvert;
	}
	
	/**
	 * Constructeur d'une Compte remunéré
	 * @param solde
	 */
	public CompteBancaire(double solde) {
		this.solde = solde;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void ajouterMontant(double montant){
		this.solde += montant;
	}
	
	/** Ajoute un montant au solde
	 * @param montant
	 */
	public void debiterMontant(double montant){
			if (this.solde - montant > decouvert){
				this.solde = solde - montant;
			}	
		}
		
	
	
	/** Getter 
	 ** @return solde
	 */
	public double getSolde() {
		return solde;
	}
	
	/** Setter
	 * @param solde the solde to set
	 */
	public void setSolde(double solde) {
		this.solde = solde;
	}
	/** Getter for decouvert
	 * @return decouvert
	 */
	public double getDecouvert() {
		return decouvert;
	}
	/** Setter
	 * @param decouvert the decouvert to set
	 */
	public void setDecouvert(double decouvert) {
		this.decouvert = decouvert;
	}


}
