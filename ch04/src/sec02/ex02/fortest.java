package sec02.ex02;

public class fortest {
	public static void main(String[] args) {
		out: for(int x= 0; x < 10; x++) {
			for (int y= 0; y < 10 ; y++) {
				System.out.println("(" + x + "," + y + ")");
				if(x == 5 && y == 5) break out;
			}
		}
	}

}
