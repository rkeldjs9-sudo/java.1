package exam02;

public class Dog {
	static int normalSpeed=50;
	int runSpeed;
	
	Dog(int runSpeed){
		this.runSpeed = runSpeed;
		
	}
	
	boolean Ishealthy() {
		if(runSpeed > normalSpeed)
			return true;
		else
			return false;
		
	}
	
	void Heal() {
		if(Ishealthy()) {
			System.out.println("no problem");
		}
		else {
			System.out.println("Do Exercise");
		}
	}
	

}
