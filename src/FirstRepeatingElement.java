import java.util.HashMap;

public class FirstRepeatingElement {
    public static int firstRepeated(int[] a, int n) {
        // Your code here
        int i;
        HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();
        for(i=0;i<n;i++)
        {
            if(! h.containsKey(a[i]))
            {
                h.put(a[i], 1);
            }
            else
            {
                h.put(a[i], h.get(a[i])+1);
            }
        }
        for(i=0;i<n;i++)
        {
            if(h.get(a[i])>1)
            {
                return i+1;
            }
        }
        return -1;
    }
}
