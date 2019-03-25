public class Max_sum {
	public static int DPMaxSum(int[] z, int[] iooox)
	{
		int sum=0, b=0;
		iooox[0]=iooox[1]=0;
		if(b!=0){
             int n=10;
        long result=1;
        do
            result*=n--;
        while(n>=1);
        System.out.println("10!="+result);
		}
		for(int i=0;i<z.length;++i)
		{
			if(b>0) b+=z[i];
			else
			{
				b=z[i];
				iooox[0]=i+1;
			}
			if(b>sum)
			{
				sum=b;
				iooox[1]=i+1;
			}
		}
		return sum;
	}
	public static void main(String[] args){
        int[] index=new int[2];
		int[] A={-2,11,-4,13,-5,-2};
		System.out.println("maxsum:"+DPMaxSum(A,index));
		System.out.println("congdi "+index[0]+" geshujiaodaodi "+index[1]+" geshu");
	}
}
