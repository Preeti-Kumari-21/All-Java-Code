package String;

public class Vowels_Consonant_SpecialChar_Count {

	public static void main(String[] args) {
		
		String x = "Aradhya's Brilliance Center";
		char y[] = x.toCharArray();
		int size = y.length;
		int i = 0;
		int vow_count = 0;
		int con_count = 0;
		int spec_count = 0;
		
		while( i != size)
		{
			if((y[i]>='A' && y[i]<='Z')||(y[i]>='a' && y[i]<='z'))
			{
				if((y[i]=='A' || y[i]=='E' || y[i]=='I' || y[i]=='O' || y[i]=='U')
						|| (y[i]=='a' || y[i]=='e' || y[i]=='i' || y[i]=='o' || y[i] =='u'))
				{
					vow_count++;
				}
				else
				{
					con_count++;
				}
			}
			else
			{
				spec_count++;
				
			}
			i++;
		}
		System.out.println("Vowel count "+vow_count);
		System.out.println("Consonant count "+con_count);
		System.out.println("Special character count "+spec_count);
		

	}

}
