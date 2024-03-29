package Graph;

import java.util.*;
import java.lang.*;

class Dijkstra {

    static int V;
    int minDistance(int dist[], Boolean sptSet[])
    {
        int min = Integer.MAX_VALUE, min_index = -1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min) {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    void printSolution(int dist[])
    {
        System.out.println("Vertex \t\t Distance from Source");
        for (int i = 0; i < V; i++) {

            if (dist[i] == Integer.MAX_VALUE) {
                System.out.println(i+1 + " \t\t\t " + "not reachable");
            }
            else
            System.out.println(i+1 + " \t\t\t " + dist[i]);
        }
    }

    void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V];

        Boolean sptSet[] = new Boolean[V];

        for (int i = 0; i < V; i++) {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        dist[src] = 0;

        for (int count = 0; count < V - 1; count++) {

            int u = minDistance(dist, sptSet);

            sptSet[u] = true;

            for (int v = 0; v < V; v++)

                if (!sptSet[v] && graph[u][v] != 0 && dist[u] != Integer.MAX_VALUE && dist[u] + graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        printSolution(dist);
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int v, e, r,c,val;
        v = scanner.nextInt();
        e = scanner.nextInt();

        int graph[][]  = new int[v][v];

        for(int i =0;i<e;i++){

            r = scanner.nextInt();
            c = scanner.nextInt();
            val = scanner.nextInt();
            graph[r-1][c-1] = val;
            graph[c-1][r-1] = val;
        }
        V = v;

        Dijkstra t = new Dijkstra();
        t.dijkstra(graph, 0);
    }
}