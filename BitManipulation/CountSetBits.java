
public class CountSetBits
{
	public static void main(String[] args) {
		long n=(1L << 20) - 1;
		
		long t=n;
	n++;
		long pos=0;
		while(t>0)
		{
		    pos++;
		    t=t>>1;
		}
		long sum=0;
		for(long i=0;i<pos;i++)
		{
		    long r=1L << (i+1);
		    
		    sum+=(n/r)*(1L << i);
		    
		    sum+=Math.max(0,(n%r)-(1L<<i));
		}
		System.out.println(sum);
		
	}
}
