/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package stronglyconnected;
import java.io.*;
import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

public class StronglyConnected {

   private int V; // No. of vertices
 int count=1;
	// Array of lists for Adjacency List Representation
	private LinkedList<Integer> adj[];

        //stack for operations
        private Stack<Integer> stack=new Stack<Integer>();

        //map for checking if the node is already visited or not
        Map<Integer,Integer> map=new HashMap<Integer,Integer>();

	// Constructor
	StronglyConnected(int v)
	{
		V = v;
		adj = new LinkedList[v];
		for (int i=0; i<v; ++i){
                    //System.out.println("i :"+i);
			adj[i] = new LinkedList();
	}}

	//Function to add an edge into the graph
	void addEdge(int v, int w)
	{
		adj[v].add(w); // Add w to v's list.
	}
Queue<Integer> queue=new LinkedList<Integer>();


	int BFS(int v)
	{

            if(map.containsKey(v)==false){
              map.put(v, v);
            Iterator<Integer> i = adj[v].listIterator();
		while (i.hasNext())
		{
			int n = i.next();
                        queue.add(n);
		}
            BFS(queue.remove());


            }
            else{
            if(queue.isEmpty()==false){

            BFS(queue.remove());
            }
            else{
               if(map.size()==10){System.out.println("The graphs is strongly connected");}
               else{System.out.println("The graphs is not strongly connected");}
            }




            }
                return 0;
	}

	public static void main(String args[])
	{
		StronglyConnected g = new StronglyConnected(11);

		g.addEdge(4, 2);
		g.addEdge(4, 10);
		g.addEdge(2, 1);
		g.addEdge(2, 5);
		g.addEdge(1, 3);
		g.addEdge(3, 6);
                g.addEdge(3, 7);
                g.addEdge(7, 8);
                g.addEdge(9, 7);
                g.addEdge(6, 5);
                g.addEdge(4, 10);
               
		System.out.println("Following is Depth First Traversal "+
						"(starting from vertex 4)");

		g.BFS(4);
	}

}
