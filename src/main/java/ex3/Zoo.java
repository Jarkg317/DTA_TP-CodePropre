package ex3;

import java.util.List;
import java.util.ArrayList;

public class Zoo {

	private String nom;
	List<Animal> lAnimaux = new ArrayList<Animal>();
	private SavaneAfricaine savaneAfricaine = new SavaneAfricaine();
	private ZoneCarnivore zoneCarnivore = new ZoneCarnivore();
	private FermeReptile fermeReptile = new FermeReptile();
	private Aquarium aquarium = new Aquarium();
	
	public Zoo(String nom){
		this.nom = nom;
	}
	
	public void addAnimal(Animal pAnimal){
		
		this.lAnimaux.add(pAnimal);

		
		if (pAnimal.getType()==TypeAnimal.Mammifère && pAnimal.getComportement()==ComportementA.CARNIVORE){
			zoneCarnivore.ajoutalaZone(pAnimal);
		}
		else if (pAnimal.getType()==TypeAnimal.Mammifère &&  pAnimal.getComportement()==ComportementA.HERBIVORE){
			savaneAfricaine.ajoutalaZone(pAnimal);
		}
		else if (pAnimal.getType()==TypeAnimal.Reptile){
			fermeReptile.ajoutalaZone(pAnimal);
		}
		else if (pAnimal.getType()==TypeAnimal.Poisson){
			aquarium.ajoutalaZone(pAnimal);
		}
	}
	
	
	
	public void afficherListeAnimaux(){
		zoneCarnivore.afficherListeAnimaux();
		savaneAfricaine.afficherListeAnimaux();
		fermeReptile.afficherListeAnimaux();
		aquarium.afficherListeAnimaux();
	}
	
	

	/** Getter for nom
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/** Setter
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	
	
}
