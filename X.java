package Interview;

public class X {

	void calculate(int a, int b) 
	{ 
		System.out.println("Class X"); 
} 
} 

class Y extends X 
{ 
@Override 
void calculate(int a, int b) 
{ 
System.out.println("Class Y"); 
} 
} 
 
class Z extends Y 
{ 
@Override 
void calculate(int a, int b)  
{ 
System.out.println("Class Z"); 
} 

}
