import java.util.ArrayList;
import java.util.HashSet;

public class RemoveDuplicatesInSmallPrimeArray {
    ArrayList<Integer> removeDuplicate(int a[], int n)
    {
        // code here
        // Below code will work only if array is sorted
        /*int i;
        ArrayList<Integer> res = new ArrayList<Integer>();
        res.add(a[0]);
        for(i=1;i<n;i++)
        {
            if(a[i-1]!=a[i])
                res.add(a[i]);
        }
        return res;*/

        // Below approach works for unsorted array also
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> s = new HashSet<Integer>();
        for(int i=0;i<n;i++)
        {
            if(!s.contains(a[i]))
            {
                res.add(a[i]);
                s.add(a[i]);
            }
        }
        return res;

        // Below approach works in place
        /*ArrayList<Integer> res = new ArrayList<Integer>();
        long prod = a[0];
        int j=1;
        int i;
        for(i=1;i<n;i++)
        {
            if(prod%a[i]!=0)
            {
                a[j++]=a[i];
                prod*=a[i];
            }
        }
        for(i=0;i<j;i++)
            res.add(a[i]);
        return res;*/
    }
}
