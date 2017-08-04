package manegedbean;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import model.Animal;

@ManagedBean
@SessionScoped
public class AnimalMB {
	
	private Animal animal;
	private ArrayList<Animal> animais;
	
	public AnimalMB() {
	  animal = new Animal();
	  animais = geraAnimaiis();
	}

	public Animal getAnimal() {
		return animal;
	}

	public void setAnimal(Animal animal) {
		this.animal = animal;
	}
	
	public void imprime( ) {
		System.out.println(animal);
	}

	public ArrayList<Animal> getAnimais() {
		return animais;
	}

	public void setAnimais(ArrayList<Animal> animais) {
		this.animais = animais;
	}

	public ArrayList<Animal> geraAnimaiis(){
		
		ArrayList<Animal> animais = new ArrayList<>();
		animais.add(new Animal("Mamifero", "Rex", 10.5f));
		animais.add(new Animal("Mamifero", "Mimi", 20f));
		animais.add(new Animal("Mamifero", "Pipa", 5f));
		animais.add(new Animal("Mamifero", "Draco", 11f));
		animais.add(new Animal("Mamifero", "JJ", 3.7f));
		animais.add(new Animal("Mamifero", "Pipa", 2f));
		return animais;
	}
	
}
