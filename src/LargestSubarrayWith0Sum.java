import java.util.HashMap;

public class LargestSubarrayWith0Sum {
    int maxLen(int a[], int n)
    {
        // Your code here
        HashMap<Integer, Integer> h = new HashMap();
        int sum=0;
        int i, max=0, index, start, end;
        start=end=0;
        for(i=0;i<n;i++)
        {
            sum+=a[i];
            if(sum==0)
            {
                max=i+1;
            }
            else
            {
                if(h.containsKey(sum))
                {
                    index = h.get(sum);
                    if(max <i-index)
                    {
                        max=i-index;
                    }
                }
                else
                    h.put(sum,i);
            }
        }
        return max;
    }
}
