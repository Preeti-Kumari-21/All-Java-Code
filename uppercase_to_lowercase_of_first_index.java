package String;

public class uppercase_to_lowercase_of_first_index {

	public static void main(String[] args) {
		
		String x = "my name is preeti kumar prashant";
		char y[] = x.toCharArray();
		int size = y.length;
		
		y[0] = (char) (y[0] - 32);
		int i = 1;
		
		while (i != size) {
			
			if(y[i] == ' ')
			{
				y[i+1] = (char) (y[i+1]-32);
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
