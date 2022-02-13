import java.util.Arrays;

public class FindTripletsWithZeroSum {
    public boolean findTriplets(int a[] , int n)
    {
        //add code here.
        int i,l,h;
        if(n<3)
            return false;
        Arrays.sort(a);
        for(i=0;i<n-1;i++)
        {
            l=i+1;
            h=n-1;
            while(l<h)
            {
                int res = a[i]+a[l]+a[h];
                if(res==0)
                {
                    return true;
                }
                if(res>0)
                    h--;
                else
                    l++;
            }
        }
        return false;

    }
}
