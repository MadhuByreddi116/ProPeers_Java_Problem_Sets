import java.util.Scanner;

class area {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		// Taking length and breadth as input
		int l = sc.nextInt();
		int b = sc.nextInt();
		
		int area;
		
		// Calculating area
		area = l * b;
		
		// Area as output
		System.out.println("Area is: " +area);
		
	}
}