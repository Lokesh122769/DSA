import java.util.*;
public class SubsetWithBitmanipulation
{
	public static void main(String[] args) {
		int a[]={5,2,1,9};
		List<List<Integer>> ans=new ArrayList<>();
		for(int i=0;i<(1<<a.length);i++)
		{
		    List<Integer> list=new ArrayList<>();
		    for(int j=0;j<a.length;j++)
		    {
		        if(((1<<j)&i)==(1<<j))
		        {
		            list.add(a[j]);
		        }
		    }
		    System.out.println(list);
		    ans.add(list);
		}
		
	}
}
