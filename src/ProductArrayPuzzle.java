public class ProductArrayPuzzle {
    public static long[] productExceptSelf(int a[], int n)
    {
        // code here
        int i;
        long left[]=new long[n];
        long right[] = new long[n];
        long res[] = new long[n];
        left[0]=1;
        right[n-1]=1;
        for(i=1;i<n;i++)
        {
            left[i]=a[i-1]*left[i-1];
        }
        for(i=n-2;i>=0;i--)
            right[i]=a[i+1]*right[i+1];
        for(i=0;i<n;i++)
            res[i]=left[i]*right[i];
        return res;
    }
}
