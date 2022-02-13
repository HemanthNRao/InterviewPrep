import java.util.HashMap;

public class CountPairsWithGivenSum {
    int getPairsCount(int[] a, int n, int k) {
        // code here
        int i, res=0;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(i=0;i<n;i++)
        {
            int t = k-a[i];
            if(h.containsKey(t))
            {
                res+=h.get(t);
            }
            if(h.containsKey(a[i]))
            {
                h.put(a[i], h.get(a[i])+1);
            }
            else
                h.put(a[i], 1);
        }
        return res;
    }
}
