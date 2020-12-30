package Core_Java_Examples;

public class Test_Singleton_Approach1 {
	private static Test_Singleton_Approach1 t = new Test_Singleton_Approach1();

	private Test_Singleton_Approach1() {
		
	}

	public static Test_Singleton_Approach1 getT() {
		return t;
	}
	
	
	
	

}
