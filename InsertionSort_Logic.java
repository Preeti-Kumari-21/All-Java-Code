package DataStructure_SortAlgorithms;

public class InsertionSort_Logic {
	
	public void sorting(int a[],int n)
	{
		//System.out.println(a);
		//System.out.println(n)
		
		int i,j,item;
		for(i=1;i<=n-1;i++)
		{
			item = a[i];
			for(j=i-1;j>=0 && a[j]>item ;j--)
			{
				a[j+1] = a[j];				
			}
			a[j+1] = item;
		}
	}

}
