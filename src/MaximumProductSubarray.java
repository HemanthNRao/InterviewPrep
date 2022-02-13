public class MaximumProductSubarray {
    public int maxProduct(final int[] a) {
        int n = a.length;
        int i;
        int res=a[0];
        int currMax, currMin;
        currMax = currMin = a[0];
        for(i=1;i<n;i++)
        {
            if(a[i]!=0)
            {
                int temp =currMax*a[i];
                currMax = Math.max(a[i], Math.max(temp, currMin*a[i]));
                currMin = Math.min(a[i], Math.min(temp, currMin*a[i]));
                res = Math.max(res, Math.max(currMax, currMin));
            }
            else
                currMax=currMin=0;
        }
        return res;
    }
}
