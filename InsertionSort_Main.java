package DataStructure_SortAlgorithms;

public class InsertionSort_Main {

	public static void main(String[] args) {
	
		int a[] = {89,45,68,90,17,29};
		int n = a.length;
		
		InsertionSort_Logic IL = new InsertionSort_Logic();
		IL.sorting(a, n);
		InsertionSort_Display ID = new InsertionSort_Display();
		ID.display(a, n);
	}
	
}
