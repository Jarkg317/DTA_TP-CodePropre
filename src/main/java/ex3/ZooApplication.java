package ex3;

public class ZooApplication {

	public static void main(String[] args) {
		Zoo zoo = new Zoo("Thoiry");
		
		zoo.addAnimal(new Animal("Gazelle", TypeAnimal.Mammifère, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Zébre", TypeAnimal.Mammifère, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Lion", TypeAnimal.Mammifère, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("PanthÃ¨re", TypeAnimal.Mammifère, ComportementA.CARNIVORE));
		zoo.addAnimal(new Animal("Requin blanc", TypeAnimal.Poisson, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Truite dorÃ©e", TypeAnimal.Poisson, ComportementA.HERBIVORE));
		zoo.addAnimal(new Animal("Boa constrictor", TypeAnimal.Reptile, ComportementA.CARNIVORE));
		zoo.addAnimal(new Animal("Python", TypeAnimal.Reptile, ComportementA.CARNIVORE));
		
		zoo.afficherListeAnimaux();
		
	}

}
