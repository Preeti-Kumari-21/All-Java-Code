package String;

public class LengthOfString {

	public static void main(String[] args) {
		
		String x = "Preeti KP";
		x =  x.concat("\0");
		char y[] = x.toCharArray();
		int i = 0,count = 0;
		
		while(y[i] != '\0')
		{
			++count;
			++i;
			
		}
		
		System.out.println(count);
	}

}
