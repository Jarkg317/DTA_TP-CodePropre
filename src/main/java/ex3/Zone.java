package ex3;

import java.util.List;
import java.util.ArrayList;


public abstract class Zone {
	

	protected List<Animal> listAnimaldelaZone = new ArrayList<Animal>();
	
	public void ajoutalaZone(Animal pAnimal) {

		listAnimaldelaZone.add(pAnimal);
		
	}
	
	public void afficherListeAnimaux(){
		//int i=1;i<=listAnimaldelaZone.size();i++
		for(Animal vAnimal:listAnimaldelaZone){
			System.out.println(vAnimal.toString());
		};
		System.out.println("calculerKgsNourritureParJour : "+calculerKgsNourritureParJour());
		
	};
	
	public abstract double calculerKgsNourritureParJour();

}
