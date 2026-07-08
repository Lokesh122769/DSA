import java.util.*;
public class SingleNumber2
{
	public static void main(String[] args) {
	   /*
Bit Manipulation Question #2: Single Number II

You are given an integer array nums.

Every element appears exactly three times except for one element, which appears exactly once.

Return that single element.

Example 1

Input

nums = [2,2,3,2]

Output

3
Example 2

Input

nums = [0,1,0,1,0,1,99]

Output

99
Example 3

Input

nums = [-2,-2,-2,-7]

Output

-7
Constraints
1 <= nums.length <= 3 * 10^4
-2^31 <= nums[i] <= 2^31 - 1
Exactly one element appears once.
Every other element appears exactly three times.

	   */
	   
	 int a[]={2,2,4,3,3};
	 int ans=0;
	 for(int i=0;i<32;i++)
	 {
	     int count=0;
	     for(int j=0;j<a.length;j++)
	     {
	         if(((a[j]>>i)&1)==1)
	         {
	             count++;
	         }
	     }
	    
	      int r=count%2;
	      if(r==1)
	      ans=((1<<i)|ans);
	       
	 }
	 System.out.println(ans);
	 
	}
}
