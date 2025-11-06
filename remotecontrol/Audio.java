package remotecontrol;

public class Audio {
	int volume;
	
	public void TurnOn() {
		System.out.println("Turn on audio");
	}
	
	public void SetVolume(int volume) {
		this.volume= volume ;
		System.out.println("audio volume:" + volume);
		
	}

}
