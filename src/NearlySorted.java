import java.util.ArrayList;
import java.util.PriorityQueue;

public class NearlySorted {
    ArrayList <Integer> nearlySorted(int a[], int n, int k)
    {
        // your code here
        PriorityQueue<Integer> q = new PriorityQueue<Integer>();
        int i;
        ArrayList <Integer> res = new ArrayList<Integer>();
        for(i=0;i<k+1;i++)
            q.add(a[i]);
        for(i=k+1;i<n;i++)
        {
            res.add(q.poll());
            q.add(a[i]);
        }
        while(!q.isEmpty())
            res.add(q.poll());
        return res;
    }
}
