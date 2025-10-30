package game.at;

import java.util.Random;

public class Mouse extends Enemy {
	int food;
	int reward;
	int winratio;
	
	Mouse(int food, int reward, int winratio){
		this.food = food;
		this.reward = reward;
		this.winratio = winratio;
		
	}
	
	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val <50) {
			System.out.println("mouse win");
			Damage(player);
		}
		else {
			System.out.println("player win");
			Reward(player);
		}
	}
	
	void Damage(Player player) {
		player.food -= food;
	}
	void Reward(Player player){
		player.food += reward;
	}

}
