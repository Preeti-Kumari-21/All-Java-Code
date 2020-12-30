package String;

public class Finding_a_Pallindrom {

	public static void main(String[] args) {
		
		String x = "PREETI";
		char y[] = x.toCharArray();
		int size = y.length;
		
		char z[] = new char[size];
		int i = 0;
		
		while (i != size) {
			
			z[size-i-1] = y[i];
			++i;
			
		}
		
		i=0;
		
		while( i != size )
		{
			if(z[i] != y[i])
			{
				
				System.out.println("Not a pallindrom");
				System.exit(0);
			}
			else
			{
				++i;
				continue;
				
			}
			
		}
		
		System.out.println("Its a pallindrom");
	}

}
