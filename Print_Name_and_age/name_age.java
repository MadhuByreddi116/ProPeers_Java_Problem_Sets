import java.util.* ;
import java.io.*; 
class Person 
{
	private String name;
	private int age;

   public void setName (String name)
   {
	   this.name = name;
   }   
   public void setAge(int age) 
   {
	   this.age = age;
   }	

   public String getName()
   {
	   return name;
	  
   }
   public int getAge() 
   {
	   return age;

   }
}


class Solution {
	
	public static void main(String args[]) {
		String name;
		int age;
		Scanner sc = new Scanner(System.in);
		Person obj = new Person();
		name = sc.nextLine();
		age = sc.nextInt();

		obj.setName(name);
		obj.setAge(age);

		System.out.println("The name of the person is " +obj.getName()+" and the age is "+obj.getAge()+"." );
		
	}
}