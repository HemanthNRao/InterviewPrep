public class SortedSubsequenceOfSize3 {
    public boolean increasingTriplet(int[] a) {
        int left,right, mid;
        int n = a.length;
        if(n<3)
            return false;
        left=mid=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            if(a[i]<left)
                left=a[i];
            else if(a[i]<mid && a[i]>left)
                mid=a[i];
            else if(a[i]>mid)
                return true;
        }
        return false;
    }
}
