import java.util.ArrayList;

public class SortedSubsequenceOfSize3a {
    ArrayList<Integer> find3Numbers(ArrayList<Integer> a, int n) {
        // add code here.
        ArrayList<Integer> res = new ArrayList<Integer>();
        int smaller[]=new int[n];
        int greater[]=new int[n];
        int i,min=0;
        int max=n-1;
        smaller[min]=-1;
        greater[max]=-1;
        for(i=1;i<n;i++)
        {
            if(a.get(i)<=a.get(min))
            {
                min=i;
                smaller[i]=-1;
            }
            else
                smaller[i]=min;
        }
        for(i=n-2;i>=0;i--)
        {
            if(a.get(i)>=a.get(max))
            {
                max=i;
                greater[i]=-1;
            }
            else
                greater[i]=max;
        }
        for(i=0;i<n;i++)
        {
            if(smaller[i]!=-1 && greater[i]!=-1)
            {
                res.add(a.get(smaller[i]));
                res.add(a.get(i));
                res.add(a.get(greater[i]));
                return res;
            }
        }
        return res;
    }
}
