public class NumberOfOccurrence {
    int count(int[] a, int n, int x) {
        // code here
        if(x<a[0] || x>a[n-1])
            return 0;
        int low, high, mid;
        int start, end;
        low=0;
        high=n-1;
        start=end=-1;
        // find first occurrence of x
        while(low<=high)
        {
            mid=(low+high)/2;
            if((a[mid]==x) && ( mid==0 || a[mid-1]<x ))
            {
                start=mid;
                break;
            }
            if(a[mid]>=x)
                high=mid-1;
            else
                low=mid+1;
        }
        low=start;
        high=n-1;
        // find last occurrence of x
        while(low<=high)
        {
            mid=(low+high)/2;
            if((a[mid]==x) && ( mid==n-1 || a[mid+1]>x))
            {
                end=mid;
                break;
            }
            if(a[mid]<=x)
                low=mid+1;
            else
                high=mid-1;
        }
        return end>=0 ? end-start+1 : 0;
    }
}
