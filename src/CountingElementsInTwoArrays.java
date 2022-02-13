import java.util.ArrayList;
import java.util.Arrays;

public class CountingElementsInTwoArrays {
    public static ArrayList<Integer> countEleLessThanOrEqual(int a[], int b[], int m, int n)
    {
        // add your code here
        // Bruteforce approach
       /*int i, j, count;
       ArrayList<Integer> res = new ArrayList<Integer>();
       for(i=0;i<m;i++)
       {
           count=0;
           for(j=0;j<n;j++)
           {
               if(b[j]<=a[i])
               {
                   count++;
               }
           }
           res.add(count);
       }
       return res;*/

        //Optimizeed solution
        Arrays.sort(b);
        int i, count=0, low, high, mid;
        ArrayList<Integer> res = new ArrayList<Integer>();
        for(i=0;i<m;i++)
        {
            if(b[0]>a[i])
            {
                res.add(0);
                continue;
            }
            low=0;
            high=n-1;
            while(low<=high)
            {
                mid=(low+high)/2;
                if(b[mid]<=a[i])
                    low=mid+1;
                else if(b[mid]>a[i])
                    high=mid-1;
            }
            res.add(high+1);
        }
        return res;
    }
}
