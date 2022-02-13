public class FindMissingAndRepeating {
    int[] findTwoElement(int a[], int n) {
        // code here
        //Optimized approach using constant space
        int i, t;
        int res[] = new int[2];
        for(i=0;i<n;i++)
        {
            t=Math.abs(a[i])-1;
            if(a[t]<0)
                res[0]=t+1;
            else
                a[t]=-1*a[t];
        }
        for(i=0;i<n;i++)
        {
            if(a[i]>0)
                res[1]=i+1;
        }
        return res;
    }
}
