package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.Mammif�re, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Z�bre", TypeAnimal.Mammif�re, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.Mammif�re, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Panthère", TypeAnimal.Mammif�re, ComportementA.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.Poisson, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorée", TypeAnimal.Poisson, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.Reptile, ComportementA.CARNIVORE));
		zoo.addAnimal(new Animal("Python", TypeAnimal.Reptile, ComportementA.CARNIVORE));
		
		zoo.afficherListeAnimaux();
		
	}

}
