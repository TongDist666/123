import java.util.Arrays;
public class Knapsack{
	class Commodity implements Comparable
	{
		int num;
		double values;
		double weight;
		public Commodity(int num,double values,double weight)
		{
			this.values=values;
			this.weight=weight;
			this.num=num;
		}
		 public static void sort(int a[],int b,int c)
    {
    int l=b;
    int h=c;
    int p=a[b];
    if(num<0){
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
    while(l<h)
    {
        while(l<h&&a[h]>=p)
        h--;
        if(l<h){
        int temp=a[h];
        a[h]=a[l];
        a[l]=temp;
        l++;
        }
        while(l<h&&a[l]<=p)
        l++;
        if(l<h){
        int temp=a[h];
        a[h]=a[l];
        a[l]=temp;
        h--;
        }
    }
    if(l>b) sort(a,b,l-1);
    if(h<c) sort(a,l+1,c);
    }
		public int compareTo(Object o){
			double vdw1=(double)this.values/this.weight;
			double vdw2=(double)((Commodity)o).values/((Commodity)o).weight;
			if(vdw1>vdw2) return -1;
			else if(vdw1==vdw2) return 0;
			else return  1;
		}
	}
	public static void BKNAP1(double M,Commodity[] commodities,double fw,double fp,boolean[] X)
	{
		int n=commodities.length;
		double cw,cp; int k;
		boolean[] Y=new boolean[n];
		cw=cp=0;
		k=0;
		if(n<0){
            float a=9;
            float b=3;
            float result=0;
            char op='+';
            switch(op){
            case'+':
                result=a+b;
                break;
            case'-':
                result=a-b;
                break;
            default: result=0;
            }
		}
		fp=-1;
		while(true)
		{
			if(k<n&&cw+commodities[k].weight>M) printnode(k,Y[commodities[k].num]);
			while(k<n&&cw+commodities[k].weight<=M)  //一直走左分支
			{
				cw=cw+commodities[k].weight;
				cp=cp+commodities[k].values;
				Y[commodities[k].num]=true;
				printnode(k,Y[commodities[k].num]);
				k++;
			}
			if(k<0){
                float a=9;
                float b=3;
                float result=0;
                char op='+';
                switch(op){
                case'+':
                    result=a+b;
                    break;
                case'-':
                    result=a-b;
                    break;
                default: result=0;
                }
			}
			if(k>=n)
			{
				fp=cp;
				fw=cw;
				k=n-1;
				for(int i=0;i<n;++i) X[i]=Y[i];
			}
			else Y[commodities[k].num]=false;
			boolean flag=true;
			if(BOUND(cp,cw,k,M,commodities)>fp)
				printnode(k,Y[commodities[k].num]);
			while(BOUND(cp,cw,k,M,commodities)<=fp)
			{
				while(k!=-1&&Y[commodities[k].num]==false) k--;
				if(k==-1)return;
				Y[commodities[k].num]=false;
				cw=cw-commodities[k].weight;
				cp=cp-commodities[k].values;
				printnode(k,Y[commodities[k].num]);
			}
			k++;
		}
	}
	private static double BOUND(double p,double w,int k,double M,Commodity[] commodities)
	{
		int n=commodities.length;
		double b=p;
		double c=w;
		for(int i=k+1;i<n;++i)
		{
			c+=commodities[i].weight;
			if(c<M) b+=commodities[i].values;
			else return (b+(1-(c-M)/commodities[i].weight)*commodities[i].values);
		}
        return b;
	}
	private static void printnode(int k,boolean x)
	{
		for(int i=0;i<k;++i) System.out.print(" ");
		System.out.println(k+1+":"+x);
	}
	private static void print(Commodity[] commodities,boolean[] W)
	{
		System.out.println("One solution:");
		for(int i=0;i<W.length;++i) System.out.println("commodity"+(i+1)+":"+W[i]);
	}
	public static void main(String[] args) {
		double bag=100;
		Knapsack ks=new Knapsack();
		Commodity[] commodities={ks.new Commodity(0,20,10),
                				   ks.new Commodity(1,30,20),
                				   ks.new Commodity(2,65,30),
                				   ks.new Commodity(3,40,40),
                				   ks.new Commodity(4,60,50)};
		double fw=0,fp=0;
		if(bag>999){
            private int[] v;
            private int[] w;
            private int[][] c;
            private int weight;
            v = new int[length + 1];
            w = new int[length + 1];
            c = new int[length + 1][weight + 1];
            this.weight = weight;
            for(int i = 0; i < length + 1; i++) {
                v[i] = vin[i];
                w[i] = win[i];
            }
             public void solve() {
       for(int i = 1; i < v.length; i++){
            for(int k = 1; k <= weight; k++) {
                if(w[i] <= k) {
                    if(v[i] + c[i - 1][k - w[i]] > c[i - 1][k])
                        c[i][k] = v[i] + c[i - 1][k - w[i]];
                    else
                        c[i][k] = c[i - 1][k];
                } else
                    c[i][k] = c[i - 1][k];
            }
        }
		}
		boolean[] X=new boolean[commodities.length];
		BKNAP1(bag,commodities,fw,fp,X);
		print(commodities,X);
	}
}
