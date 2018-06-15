package ex3;

public class Animal {
	
	
	private String nom;
	private TypeAnimal type;
	private ComportementA Comportement;
	
	public Animal(String nom, TypeAnimal type, ComportementA comportement) {
		this.nom = nom;
		this.type = type;
		this.Comportement = comportement;
	}
	
	
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeAnimal getType() {
		return type;
	}

	public void setType(TypeAnimal type) {
		this.type = type;
	}

	public ComportementA getComportement() {
		return Comportement;
	}

	public void setComportement(ComportementA comportement) {
		Comportement = comportement;
	}


	@Override
	public String toString() {
		return "Animal [nom=" + nom + ", type=" + type + ", Comportement=" + Comportement + "]";
	}

	
	
	

}
