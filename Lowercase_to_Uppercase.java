package String;

public class Lowercase_to_Uppercase {

	public static void main(String[] args) {
		
		String x = "preetikp";
		char y[] = x.toCharArray();
		int size = y.length;
		char z[] = new char[size];
		
		int i = 0;
		
		while(i != size)
		{
			z[i] = (char) (y[i] - 32);
			i++;
		}
		System.out.println(y);
		System.out.println(z);

	}

}
