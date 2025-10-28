package exam02;

public class animal {
	public static void main(String[] args) {
		animal h = new animal();
		
		Dog dog = new Dog(100); 
		
		h.CheckPatient(dog);
		h.HealPatient(dog);
		
		Cat cat = new Cat(1);
		
		h.CheckPatient(cat);
		h.HealPatient(cat);
	}
	
	void CheckPatient(Dog dog) {
		if(dog.Ishealthy()) {
			System.out.println("Dog is Healthy");
		}
		else {
			System.out.println("Dog is Sick");
		}
	}
	
	void HealPatient(Dog dog) {
		dog.Heal();
	}
	
	void CheckPatient(Cat cat) {
		if(cat.IsHealthy()) {
			System.out.println("Cat is Healthy");
		}
		else {
			System.out.println("Cat is Sick");
		}
	}
	
	void HealPatient(Cat cat) {
		cat.Heal();
	}
}