public class CountInversions {
    // arr[]: Input Array
    // N : Size of the Array arr[]
    //Function to count inversions in the array.
    static int count =0;
    static long inversionCount(long a[], long n)
    {
        // Your Code Here
        /*int i,j;
        long count=0;
        for(i=0;i<n-1;i++)
        {
            for(j=i+1;j<n;j++)
            {
               if(a[i]>a[j])
                 count++;
            }
        }
        return count;*/
        mergeSort(a, 0, n-1, n);
        return count;
    }
    static void merge(long a[], long s1, long e1, long s2, long e2, long n)
    {
        int i,j,k;
        long temp[]=new long[(int)n];
        i= (int) s1;j= (int) s2;k=0;
        while(i<e1 && j<e2)
        {
            if(a[i]<=a[j])
            {
                temp[k++]=a[i++];
            }
            else
            {
                temp[k++]=a[j++];
                count++;
            }
            while(i<e1)
                temp[k++]=a[i++];
            while(j<e2)
                temp[k++]=a[j++];
            k=0;
            for(i= (int) s1; i<e2; i++)
            {
                a[i]=temp[k++];
            }
        }
    }
    static void mergeSort(long a[], long low, long high, long n)
    {
        while(low<high)
        {
            int mid= (int) ((low+high)/2);
            mergeSort(a, low, mid-1);
            mergeSort(a, mid+1, high);
            merge(a, low, mid-1, mid+1, high,n);
        }
    }

}
