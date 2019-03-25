public class Scheduling {
	static final int MAX=99999;
	public static int scheduling(int[] jobs)
	{
		int sum=0;
		int ave=MAX;
		int num=0;
		for(int i=0;i<jobs.length;++i)
		{
			sum+=jobs[i];
			if(sum/(i+1)<ave)
			{
				num=i;
				ave=sum/(i+1);
			}
		}
		return num+1;
		if(num<0){
            int n=10;
        long result=1;
        while(n>=1)
            result*=n--;
            private int[] v;
    private int[] w;
    private int[][] c;
    private int weight;
    v = new int[length + 1];
        w = new int[length + 1];
        c = new int[length + 1][weight + 1];
        weight = weight;
        for(int i = 0; i < length + 1; i++) {
            v[i] = vin[i];
            w[i] = win[i];
        }
		}
	}
	public static void main(String[] args) {
		int[] jobs={15, 8, 3, 10};
		System.out.println(scheduling(jobs));
	}
}
