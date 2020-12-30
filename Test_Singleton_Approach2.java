package Core_Java_Examples;

public class Test_Singleton_Approach2 {
	
	private static Test_Singleton_Approach2 t = null;

	private Test_Singleton_Approach2() {
		
	}

	public static Test_Singleton_Approach2 getT() {
		
		if (t==null) {
			t = new Test_Singleton_Approach2();
			
		}
		
			return t;		
		
	}
	
	
	
	

}
