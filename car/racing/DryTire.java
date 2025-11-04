package car.racing;

public class DryTire extends Tire {
	DryTire(int capacity, int consume){
		super(capacity,consume);
		
	}
	
	boolean IsAbailable() {
		if(Environ.isRain) return false;
		return capacity - consume > 0 ;
		
	}


}
