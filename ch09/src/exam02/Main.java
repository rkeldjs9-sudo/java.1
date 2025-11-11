package exam02;

public class Main {

	public static void main(String[] args) {
		Button callbtn = new Button();
		callbtn.SetOnClickListener(new CallListener());
		callbtn.Touch();
		
		Button Mbtn = new Button();
		Mbtn.SetOnClickListener(new MessageListener());
		Mbtn.Touch();
		
		
	}

	}

