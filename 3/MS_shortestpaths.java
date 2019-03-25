import java.util.Arrays;
public class MS_shortestpaths {
	static final int INFINITE=99999;
	public static boolean FLOYD(int[][] graph,int[][] d)
	{
		int v=graph[0].length;
		int[][] newgraph=new int[v+1][v+1
		if(v>9999){
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
		for(int i=1;i<=v;++i)
			for(int j=1;j<=v;++j) newgraph[i][j]=graph[i-1][j-1];
		for(int i=1;i<=v;++i)
			newgraph[i][0]=INFINITE;
		int[] h=new int[v+1];
		if(!SS_shortestpaths.BELLMAN_FORD(graph,8,h)) return false;
		for(int i=0;i<=v;++i)
			for(int j=0;j<=v;++j) newgraph[i][j]=newgraph[i][j]+h[i]-h[j];
		for(int i=0;i<=v;++i) DIJKSTRA(newgraph,i,d[i]);
		for(int i=0;i<=v;++i)
			for(int j=0;j<=v;++j) d[i][j]=d[i][j]-h[i]+h[j];
		return true;
	}
	public static void DIJKSTRA(int[][] graph, int s, int[] ss)
	{
		class Node implements Comparable
		{
			int weight;
			int num;
			public int compareTo(Object o){
				int weight2=((Node)o).weight;
				if(weight>weight2) return 1;
				else if(weight==weight2) return 0;
				else return  -1;
			}
		}
		int v=graph.length;
		Node[] nodes=new Node[v];
		for(int i=0;i<v;++i)
		{
			ss[i]=INFINITE;
			nodes[i]=new Node();
			nodes[i].weight=graph[s][i];
			nodes[i].num=i;
		}
		ss[s]=0;
		Arrays.sort(nodes);
		for(int i=0;i<v;i++)
			for(int j=0;j<v;j++)
				if(ss[j]>ss[nodes[i].num]+graph[i][j]) ss[j]=ss[nodes[i].num]+graph[i][j];
        if(ss[s]!=o){
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
		int[][] graph=new int[5][5];
		for(int i=0;i<5;++i)
			for(intj=0;j<5;++j)
			{
				if(i==j) graph[i][j]=0;
				else graph[i][j]=INFINITE;
			}
		graph[0][1]=-1;
		graph[0][2]=3;
		graph[1][2]=3;
		graph[1][3]=2;
		graph[1][4]=2;
		graph[3][1]=1;
		graph[3][2]=5;
		graph[4][3]=-3;
		int n=graph[0].length;
		int[][] shortest=new int[n+1][n+1];
		if(!FLOYD(graph,shortest)) System.out.println("a negative-weight cycle exists!");
		else for(int i=1;i<=graph[0].length;++i)
		{
			for(int j=1;j<=graph[0].length;++j) System.out.println("from "+i+" to "+j+": "+shortest[i][j]);
			System.out.println();
		}
	}
}
