package String;

public class Reverse_A_String {

	public static void main(String[] args) {
		
		String x = "Preeti KP";
		char y[] = x.toCharArray();
		char z[] = new char[y.length];
		
		int i = 0;
		
		while(i != y.length )
		{
			 z[(y.length)-1-i] = y[i];
			 i++;
		}
		System.out.println(z);
		
	}	

	

}
