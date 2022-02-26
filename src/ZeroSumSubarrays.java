import java.util.HashMap;

public class ZeroSumSubarrays {
    public static long findSubarray(long[] a ,int n)
    {
        //Your code here
        int i;
        long sum=0;
        HashMap<Long, Integer> h = new HashMap<Long, Integer>();
        int start=0;
        int count=0;
        for(i=0;i<n;i++)
        {
            sum+=a[i];
            if(sum==0)
                count++;
            if(h.containsKey(sum))
            {
                count+=h.get(sum);
                h.put(sum, h.get(sum)+1);
            }
            else h.put(sum, 1);
        }
        return count;
    }
}
