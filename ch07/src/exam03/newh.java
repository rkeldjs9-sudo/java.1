package exam03;



public class newh {
	public static void main(String[] args) {
		animal h = new animal();
		
		Dog dog = new Dog(100); 
		
		h.CheckPatient(dog);
		h.HealPatient(dog);
		
		Cat cat = new Cat(1);
		
		h.CheckPatient(cat);
		h.HealPatient(cat);
	}
	
	void CheckPatient(Animal animal) {
		if(animal.Ishealthy()) {
			System.out.println("Dog is Healthy");
		}
		else {
			System.out.println("Dog is Sick");
		}
	}
	
	void HealPatient(Animal animal) {
		animal.Heal();
	}

}
