import java.util.*;
public class FindMissingAndRepeating
{
	public static void main(String[] args) {
/*
You are given an array nums of size n containing numbers from 1 to n.

Exactly one number is missing.
Exactly one number appears twice.

Find both the missing and the repeating numbers.
nums = [1, 2, 2, 4, 5]
Repeating = 2
Missing = 3
*/	 

int a[]={1,1,2,3,4};

int xor=a[0];

for(int i=1;i<a.length;i++)
{
  xor=xor^a[i];
}
 
for(int i=1;i<=a.length;i++)
{
    xor=xor^i;
}
  
  int pos=0;
  for(int i=0;i<32;i++)
  {
      if(((1<<i)&xor)==(1<<i))
      {
          pos=i;
          break;
      }
  }
  
  int miss=0,rep=0;
  
  for(int i=0;i<a.length;i++)
  {
      if(((1<<pos)&a[i])==(1<<pos))
      {
          miss=miss^a[i];
      }
      else
      {
          rep=rep^a[i];
      }
  }
  
 for(int i=1;i<=a.length;i++)
  {
      if(((1<<pos)&i)==(1<<pos))
      {
          miss=miss^i;
      }
      else
      {
          rep=rep^i;
      }
  }
  
    System.out.println("Missing: "+miss+"  repeating: "+rep);
	}
}
