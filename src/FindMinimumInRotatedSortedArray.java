public class FindMinimumInRotatedSortedArray {
    public int findMin(int[] a) {
        int low, high, mid, n;
        n=a.length;
        low=0;
        high=n-1;
        while(low<=high)
        {
            if(a[high]>=a[low])
                return a[low];
            mid=(low+high)/2;
            if((mid==n-1 || a[mid] < a[mid+1] ) && a[mid-1]>a[mid])
                return a[mid];
            if(a[mid]>a[high])
                low=mid+1;
            else
                high=mid-1;
        }
        return a[low];
    }
}
