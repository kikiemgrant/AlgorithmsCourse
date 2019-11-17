import java.util.*; 
import java.lang.*;
import java.io.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.File;
import java.util.Scanner;
import java.io.File;
import java.util.Scanner;


public class dijkstras {
	
	int cost[];
	int predecessor[];
	int best;
	boolean reached[];
	int estimate[];
	boolean candidate[];
	int v = -1;
	
	
	cost[0] = 0;
	
	reached[0] = true;
	
	for (i=0; i<x; i++) {
		reached[i] = false;
	}
	
	for (i=0; i<x; i++) {
		estimate[i] = graph[0,x];
		cadidate[i] = true;
	}
	
	for (z=0; z<x; z++) {
		estimate[z] = 10,000;
		candidate[z]= false;
	}
	while (sc.hasNextInt = 1) {
		best = 10,000;
		for (x) {
			if (candidate[x]== true && estimate[x]<best) {
				v=x;
				best = estimate[x];
			}
			}
		cost[v] = estimate[v];
		reached[v] = true;
		candidate[v] = false;
		
		for (y=0,y<x, y++) {
			if (graph[v,y]>0 && reached[y] == false) {
				if ((cost[v]+ graph[v,y]) < estimate[y]) {
					estimate[y]= cost[v]+ graph[v,y];
					candidate[y] = true;
					
				}
			}
		}
		
		}
	
	
	
	/*
	
	static final int V=6;
    int minDistance(int dist[], Boolean sptSet[])
    {
        // Initialize min value
        int min = Integer.MAX_VALUE, min_index=-1;

        for (int v = 0; v < V; v++)
            if (sptSet[v] == false && dist[v] <= min)
            {
                min = dist[v];
                min_index = v;
            }

        return min_index;
    }

    // A utility function to print the constructed distance array
    void printSolution(int dist[], int n)
    {
        System.out.println("Distance from starting vertex");
        for (int i = 0; i < V; i++)
            System.out.println(i+" \t\t "+dist[i]);
    }

    // Funtion that implements Dijkstra's single source shortest path
    // algorithm for a graph represented using adjacency matrix
    // representation
    public void dijkstra(int graph[][], int src)
    {
        int dist[] = new int[V]; // The output array. dist[i] will hold
                                 // the shortest distance from src to i

        // sptSet[i] will true if vertex i is included in shortest
        // path tree or shortest distance from src to i is finalized
        Boolean sptSet[] = new Boolean[V];

        // Initialize all distances as INFINITE and stpSet[] as false
        for (int i = 0; i < V; i++)
        {
            dist[i] = Integer.MAX_VALUE;
            sptSet[i] = false;
        }

        // Distance of source vertex from itself is always 0
        dist[src] = 0;

        // Find shortest path for all vertices
        for (int count = 0; count < V-1; count++)
        {
            // Pick the minimum distance vertex from the set of vertices
            // not yet processed. u is always equal to src in first
            // iteration.
            int u = minDistance(dist, sptSet);

            // Mark the picked vertex as processed
            sptSet[u] = true;

            // Update dist value of the adjacent vertices of the
            // picked vertex.
            for (int v = 0; v < V; v++)

                // Update dist[v] only if is not in sptSet, there is an
                // edge from u to v, and total weight of path from src to
                // v through u is smaller than current value of dist[v]
                if (!sptSet[v] && graph[u][v]!=0 &&
                        dist[u] != Integer.MAX_VALUE &&
                        dist[u]+graph[u][v] < dist[v])
                    dist[v] = dist[u] + graph[u][v];
        }

        // print the constructed distance array
        printSolution(dist, V);
    }
	*/
	
		 public static void main(String[] args) throws Exception {
		        File file=new File("C:\\Users\\kyrae\\Documents\\365workspace\\Assignment 1\\src\\1.txt");
		        Scanner sc=new Scanner(file);
		        sc.nextInt();
		        int graph[][] = new int[6][6];
		        for(int i = 0 ; i < 6; i++){
		            for(int j = 0 ; j < 6; j++){
		                graph[i][j] = sc.nextInt();
		            }
		        }
		        dijkstras t = new dijkstras();
		        
				t.dijkstra(graph, 0);
		    }
		
	    }

