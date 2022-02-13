import java.util.HashSet;

public class IntersectionOfTwoArrays {
    public static int NumberofElementsInIntersection(int a[], int b[], int n, int m) {
        // Your code here
        HashSet<Integer> s = new HashSet<Integer>();
        int i,count=0;
        for(i=0;i<n;i++)
            s.add(a[i]);
        for(i=0;i<m;i++)
        {
            if(s.contains(b[i]))
            {
                s.remove(b[i]);
                count++;
            }
        }
        return count;
    }
}
