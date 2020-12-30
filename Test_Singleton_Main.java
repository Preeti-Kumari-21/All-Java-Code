package Core_Java_Examples;

public class Test_Singleton_Main {

	public static void main(String[] args) {
		
		Test_Singleton_Approach2 t = Test_Singleton_Approach2.getT();
		System.out.println(t);
		
		Test_Singleton_Approach2 t1 = Test_Singleton_Approach2.getT();
		System.out.println(t1);
		
		Test_Singleton_Approach2 t2 = Test_Singleton_Approach2.getT();
		System.out.println(t2);
		
		

	}

}
