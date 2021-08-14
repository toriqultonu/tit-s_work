package Graph;

import java.util.*;

class Kruskal
{

    static int V ;
    static int[] parent;
    static int INF = Integer.MAX_VALUE;

    static int find(int i)
    {
        while (parent[i] != i)
            i = parent[i];
        return i;
    }

    static void union1(int i, int j)
    {
        int a = find(i);
        int b = find(j);
        parent[a] = b;
    }

    static void kruskalMST(int cost[][])
    {
        int mincost = 0;

        for (int i = 0; i < V; i++)
            parent[i] = i;

        int edge_count = 0;
        while (edge_count < V - 1)
        {
            int min = INF, a = -1, b = -1;
            for (int i = 0; i < V; i++)
            {
                for (int j = 0; j < V; j++)
                {
                    if (find(i) != find(j) && cost[i][j] < min)
                    {
                        min = cost[i][j];
                        a = i;
                        b = j;
                    }
                }
            }

            union1(a, b);
            System.out.printf("Edge %d:(%d, %d) cost:%d \n",
                    edge_count++, a+1, b+1, min);
            mincost += min;
        }
        System.out.printf("\n Minimum cost= %d \n", mincost);
    }

    public static void main(String[] args)
    {

        Scanner scanner = new Scanner(System.in);
        int v, e, r,c,val;
        v = scanner.nextInt();
        e = scanner.nextInt();

        int cost[][]  = new int[v][v];
        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                cost[i][j] = INF;
            }
        }

        for(int i =0;i<e;i++){

            r = scanner.nextInt();
            c = scanner.nextInt();
            val = scanner.nextInt();
            cost[r-1][c-1] = val;
            cost[c-1][r-1] = val;
        }
        V = v;
         parent = new int[V];
        kruskalMST(cost);
    }
}