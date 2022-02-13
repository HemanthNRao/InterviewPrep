import java.util.ArrayList;
import java.util.HashSet;

public class UnionOfTwoSortedArrays {
    //Function to return a list containing the union of the two arrays.
    public static ArrayList<Integer> findUnion(int a[], int b[], int n, int m)
    {
        // add your code here
        ArrayList<Integer> res = new ArrayList<Integer>();
        HashSet<Integer> s = new HashSet<Integer>();
        int i,j;
        i=j=0;
        while(i<n && j<m)
        {
            if(a[i]<=b[j])
            {
                if(!s.contains(a[i]))
                {
                    res.add(a[i]);
                    s.add(a[i]);
                }
                i++;
            }
            else
            {
                if(!s.contains(b[j]))
                {
                    res.add(b[j]);
                    s.add(b[j]);
                }
                j++;
            }
        }
        while(i<n)
        {
            if(!s.contains(a[i]))
            {
                res.add(a[i]);
                s.add(a[i]);
            }
            i++;
        }
        while(j<m)
        {
            if(!s.contains(b[j]))
            {
                res.add(b[j]);
                s.add(b[j]);
            }
            j++;
        }
        return res;
    }
}
