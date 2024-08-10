public class Solution 
{
    public static int search(int []nums, int target) 
    {
      
      int n = nums.length;
      int l ,r,mid;
      l =0;
      r = n-1;
      while (l<=r)
      {
          mid = (l+r)/2;

          if(target == nums[mid])
          {
             return mid;  // returns the index if element is found...
          }
          else if (target>nums[mid])
          {
              l = mid+1;
          }
          else
          {
              r = mid-1;
          }
         
      }
      
      return -1; // If Element is not Found.

    }
}