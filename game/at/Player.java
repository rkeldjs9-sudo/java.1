package game.at;

public class Player {
	int health;
	int money;
	int food;
	public int power;
	
	Player(int health, int money, int food){
		this.health = health;
		this.money= money;
		this.food= food;
	}
	
	boolean IsAlive() {
		
		if (health > 0 && money > 0 && food>0)
			return true;
		else
			return false;
	}

}
