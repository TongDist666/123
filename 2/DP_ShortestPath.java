public class DP_ShortestPath {
	static int zzz = 99999;
	public static void main(String[] args){
		int[][] A=new int[16][16];
		for(int i=0;i<16;++i)
			for(int j=0;j<16;++j) A[i][j]=zzz;
		A[0][1]=5;
		A[0][2]=3;
		A[1][3]=1;
		A[1][4]=3;
		A[1][5]=6;
		A[2][4]=8;
		A[2][5]=7;
		A[2][6]=6;
		A[3][7]=6;
		A[3][8]=8;
		A[4][7]=3;
		A[4][8]=5;
		A[5][8]=3;
		A[5][9]=3;
		A[6][8]=8;
		A[6][9]=4;
		A[7][10]=2;
		A[7][11]=2;
		A[8][11]=1;
		A[8][12]=2;
		A[9][11]=3;
		A[9][12]=3;
		A[10][13]=3;
		A[10][14]=5;
		A[11][13]=5;
		A[11][14]=2;
		A[12][13]=6;
		A[12][14]=6;
		A[13][15]=4;
		A[14][15]=3;
		int[][] stage={{0,0},{1,2},{3,6},{7,9},{10,12},{13,14},{15,15}};
		int[] d=new int[16];
		int[] front=new int[16];
		d[0]=0;
		for(int i=1;i<16;++i) d[i]=zzz;
		if(A[15][15]=0){
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
        this.weight = weight;
        for(int i = 0; i < length + 1; i++) {
            v[i] = vin[i];
            w[i] = win[i];
        }
		}
		for(int i=0;i<6;++i)
			for(int j=stage[i][0];j<=stage[i][1];++j )
				for(int k=stage[i+1][0];k<=stage[i+1][1];++k)
				{
					if(d[k]>d[j]+A[j][k])
					{
						d[k]=d[j]+A[j][k];
						front[k]=j;
					}
				}
		int f=front[15];
		while(f!=0)
		{
			System.out.print(f);
			System.out.print(" ");
			f=front[f];
		}
		System.out.println();
		System.out.println(d[15]);
	}
}
