package exam03;

public class Cat extends Animal{
	
	static int normalHeight = 2;
	int jumpHeight;
	
	Cat(int jumpHeight){
		this.jumpHeight = jumpHeight;
	}
	
	@Override
	public boolean IsHealthy() {
		if(jumpHeight > normalHeight) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public void Heal() {
		if(IsHealthy()) {
			System.out.println("no pro");
		}
		else{
			System.out.println("more meat");
		}
	}

}