package game.at;

import java.util.Random;

public class Thief {
	int money;
	int reward;
	int winratio;
	
	Thief(int power, int reward, int winratio){
		this.money = money;
		this.reward = reward;
		this.winratio = winratio;
		
	}
	
	void Attack(Player player) {
		Random rand = new Random();
		int val = rand.nextInt(100);
		
		if(val <50) {
			System.out.println("thief win");
			Damage(player);
		}
		else {
			System.out.println("player win");
			Reward(player);
		}
	}
	
	void Damage(Player player) {
		player.health -= money;
	}
	void Reward(Player player){
		player.health += reward;
	}

}
