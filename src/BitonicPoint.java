public class BitonicPoint {
    int findMaximum(int[] a, int n) {
        // code here
        int low, high, mid;
        low=0;
        high=n-1;
        if(a[low]>a[low+1])
            return a[low];
        while(low<=high)
        {
            mid=(low+high)/2;
            if((mid==0 || a[mid]>a[mid-1]) && (mid==n-1 || a[mid]>a[mid+1]))
            {
                return a[mid];
            }
            if(a[mid-1]>a[mid])
                high=mid-1;
            else
                low=mid+1;
        }
        return a[n-1];
    }
}
