package String;

public class Lowercase_to_uppercase_with_space {

	public static void main(String[] args) {
		
		String x = "preeti kumari";
		char y[] = x.toCharArray();
		int size = y.length;
		
		int i = 0;
		while (i != size) {
			if(y[i] != ' ')
			{
				y[i] = (char) (y[i]-32);
				i++;
			}
			else
			{
				i++;
				continue;
			}
		}
		System.out.println(y);

	}

}
