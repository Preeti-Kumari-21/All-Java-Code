package String;

public class CopyStringtoAnotherArray {

	public static void main(String[] args) {
		
		String x = "Preeti KP";
		char y[] = x.toCharArray();
		char z[] = new char[y.length];
		
		int i = 0;
		while(i != y.length)
		{
			z[i] = y[i];
			i++;
		}
		
		System.out.println(z);

	}

}
