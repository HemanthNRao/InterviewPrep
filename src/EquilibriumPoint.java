public class EquilibriumPoint {
    public static int equilibriumPoint(long a[], int n) {

        // Your code here
        // Uses extra space O(n)
        /*int left = new int[n];
        int right = new int[n];
        int sum=0;
        left[0]=0;
        right[n-1]=0;
        for(i=1;i<n;i++)
        {
            left[i]=a[i-1]+left[i-1];
        }

        for(i=n-2;i>=0;i--)
            right[i]=a[i+1]+right[i+1];
        for(i=0;i<n;i++)
        {
            if(left[i]==right[i])
                return i+1;
        }
        return -1;*/

        //using O(1) extra space
        int leftSum =0;
        int sum = 0, i;
        for(i=0;i<n;i++)
            sum+=a[i];
        for(i=0;i<n;i++)
        {
            sum-=a[i];
            if(sum==leftSum)
                return i+1;
            leftSum+=a[i];
        }
        return -1;
    }
}
