public class MaximumIndex {
    static int maxIndexDiff(int a[], int n) {

        // Your code here
        //Optimized approach using DP
        int i,j;
        int left[] = new int[n];
        int right[] = new int[n];
        left[0]=a[0];
        right[n-1]=a[n-1];
        for(i=1;i<n;i++)  left[i]=Math.min(a[i], left[i-1]);
        for(i=n-2;i>=0;i--) right[i]=Math.max(a[i], right[i+1]);
        i=j=0;
        int max_diff = -1;
        while(i<n && j<n)
        {
            if(right[i]>=left[j])
            {
                max_diff = Math.max(max_diff, i-j);
                i++;
            }
            else
                j++;
        }
        return max_diff;
    }
}
