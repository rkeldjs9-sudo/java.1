package exam03;

public class Main {
	public static void main(String[] args) {
		Button callbtn = new Button();
			callbtn.SetOnClickListener(
					new Button.OnClickListener() {
						
						@Override
						public void OnClick() {
							System.out.println("make a Phone call");
							
						}
					}
				);
			callbtn.Touch();
		}
		
	}

