package String;

public class Finding_a_pallindrom_with_spaces_and_cases {

	public static void main(String[] args) {
		
		String x = "too hot to HOOT";
		x=x.replace(" ", "");
		x=x.toLowerCase();
		
		char y[] = x.toCharArray();
		int size = y.length;
		
		char z[] = new char[size];
		int i = 0;
		
		while( i != size)
		{
			z[size-1-i] = y[i];
			i++;
		}
		
		i = 0;
		while(i != size)
		{
			if(z[i] != y[i])
			{
				System.out.println("This is not a pallindrom");
				System.exit(0);
			}
			else
			{
				i++;
				continue;
			}
		}
		System.out.println("This is a pallindrom");
	}

}
