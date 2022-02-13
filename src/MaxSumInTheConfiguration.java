public class MaxSumInTheConfiguration {
    int MissingNumber(int a[],int n)
    {
        // Your Code Here
        int i,t;
        for(i=0;i<n-1;i++)
        {
            t=Math.abs(a[i])-1;
            if(t<n-1)
                a[t]=a[t]*-1;
        }
        for(i=0;i<n-1;i++)
        {
            if(a[i]>0)
                return i+1;
        }
        return n;
    }
}
