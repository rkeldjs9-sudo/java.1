package sec04.exam1;

public class Car {
	int gas;
	int minGas; // 한바퀴 돌때 필요한 가스
	String teamName;
	String color;
	static int numberOfCars;
	
	Car(int gas, int minGas, String teamName, String color){
		this.gas = gas;
		this.minGas= minGas;
		this.teamName= teamName;
		this.color = color;
		
		
	}

	boolean IsLeftGas() {
		if(gas<minGas) {
			System.out.println("연로를 보충해야 합니다");
			return false;
		}
		System.out.println("한바퀴 더 돌수 있어요");
		return true;
	}
	
	void AddGas(int gas) {
		System.out.println("연료 만땅.");
		this.gas = gas;
	}
	void RunOneRound()
	{
		System.out.println("한바퀴 완주.");
		this.gas-=minGas;
	}
	
	void ShowNumberOfCars()
	{
		System.out.println("Number of Cars:" + numberOfCars);
	}
}
	
