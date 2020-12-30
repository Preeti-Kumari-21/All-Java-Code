package String;

public class Uppercase_to_Lowercase {

	public static void main(String[] args) {
		
		String x = "PR E ETI K P";
		x = x.replace(" ", "");
		char y[] = x.toCharArray();
		int size = y.length;
		char z[] = new char[size];
		
		int i = 0;
		
		while(i != size)
		{
			z[i] = (char) (y[i] + 32);
			i++;
		}
		System.out.println(y);
		System.out.println(z);

	}

}
