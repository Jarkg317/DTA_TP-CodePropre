package ex3;


public class Aquarium extends Zone{


	public double calculerKgsNourritureParJour(){
		return listAnimaldelaZone.size()  * 0.2;
	}
}
