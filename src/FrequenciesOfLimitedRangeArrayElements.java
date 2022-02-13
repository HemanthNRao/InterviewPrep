public class FrequenciesOfLimitedRangeArrayElements {
    public static void frequencyCount(int a[], int n, int p)
    {
        // Uses extra space
        int res[] = new int[n];
        int i;
        for(i=0;i<n;i++)
        {
            if(a[i]-1<n)
            {
                res[a[i]-1]=res[a[i]-1]+1;
            }
        }
        for(i=0;i<n;i++)
        {
            a[i]=res[i];
        }

    }
}
