import java.util.*;
 class graph1 
{
    ArrayList<ArrayList<Integer>> graphData;
    int V;
    graph1(int v)
    {
        V=v;
        graphData=new ArrayList<ArrayList<Integer>>();
        for(int i=0;i<V;i++)
        {
            graphData.add(new ArrayList<>());
        }
    }
    public void addEdge(int u,int v)
    {
        graphData.get(u).add(v);
        graphData.get(v).add(u);
    }
    void printGraph()
    {
        for(int i=0;i<graphData.size();i++)
        {   System.out.print("node "+i+" -->");
            for(int j=0;j<graphData.get(i).size();j++)
            {
                System.out.print(graphData.get(i).get(j)+" --> ");
            }
            System.out.println();
        }
    }
}
public class graph
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of the vertices ");
        int v=sc.nextInt();
      graph1 g = new graph1(v);
       g.addEdge(0,1);
       g.addEdge(2,3);
       g.addEdge(3,4);
       g.addEdge(2,4);
       g.printGraph();
    }
}