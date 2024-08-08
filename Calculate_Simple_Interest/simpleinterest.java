import java.util.* ;
import java.io.*; 
class simpleinterest {
	
	public static void main(String args[]) {
		
	float pa,r,t,si;
	Scanner sc = new Scanner(System.in);

	pa = sc.nextFloat();
	r = sc.nextFloat();
	t = sc.nextFloat();

	 si = (pa*r*t)/100;
    System.out.println((int)Math.floor(si));
		
	}
}