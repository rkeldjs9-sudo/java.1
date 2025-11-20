package exam03;

public class Main {
	public static void main(String[] args) {
		String str1= new String("hi");
		String str2= new String("hi");
		Object obj = str1;
		
		if(str1 == str2)
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
		if(str1.equals(str2))
			System.out.println("Equal");
		else
			System.out.println("Not Equal");
		
	}

}
