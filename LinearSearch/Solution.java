import java.util.Scanner;

public class Solution{



    public static int lsearch(int [] arr,int k) // function definition
    {
    int l = arr.length;
    int index , j=0;

    while(j<l)
    {
     if(k==arr[j])
     {
        return index =j;
     }
     else
     {
        j++;
     }

    }
    return -1;
    }

  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter element to search:");
    int k = sc.nextInt();
    System.out.print("Enter Size:");
    int n = sc.nextInt();
    int [] arr = new int[n];
    for (int i =0;i<n;i++)
    {
        arr[i]= sc.nextInt();
    }
      int result =lsearch( arr ,  k);  // function calling
     System.out.println("found at "+result);
    }

}