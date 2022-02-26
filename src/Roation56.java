public class Roation56 {
    int findKRotation(int a[], int n) {
        // code here
        int low, high, mid;
        low=0;
        high=n-1;
        if(a[low]<=a[high])
            return 0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if((mid==0 || a[mid-1]<a[mid]) && (mid==n-1 || a[mid+1]<a[mid]))
                return mid+1;
            if(a[mid]>a[n-1])
                low=mid+1;
            else
                high=mid-1;
        }
        return 0;
    }
}
