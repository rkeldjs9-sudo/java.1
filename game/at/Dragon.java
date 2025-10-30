package game.at;

import java.util.Random;

public class Dragon extends Enemy {
	int power;
	int reward;
	int winratio;
	
	Dragon(int power, int reward, int winratio){
		this.power = power;
		this.reward = reward;
		this.winratio = winratio;
		
	}
	
	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val <50) {
			System.out.println("Dragon win");
			Damage(player);
		}
		else {
			System.out.println("player win");
			Reward(player);
		}
	}
	
	void Damage(Player player) {
		player.power -= power;
	}
	void Reward(Player player){
		player.money += reward;
	}
}
