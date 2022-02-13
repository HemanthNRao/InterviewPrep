public class SmallestPositiveMissingNumber {
    static int missingNumber(int a[], int n)
    {
        // Your code here
        // Brute force approach using sorting
        /*Arrays.sort(a);
        int i, startIndex=0;
        for(i=0;i<n;i++)
        {
            if(a[i]>0)
            {
                startIndex=i;
                break;
            }
        }
        if(a[startIndex] !=1 ) return 1;
        // System.out.println(startIndex);
        for(i=startIndex+1;i<n;i++)
        {
            if(a[i-1] == a[i])
                continue;
            if(a[i-1] != a[i]-1)
                return a[i-1]+1;
            // System.out.println(a[i]);
        }
        return a[n-1]+1;*/

        //Optimized  aproach with O(N) time and O(1) space complexity
        int i,t, correctPos;
        for(i=0;i<n;i++)
        {
            correctPos = a[i]-1;
            while(a[i]>=1 && a[i]<=n && a[i]!=a[correctPos])
            {
                t=a[correctPos];
                a[correctPos]=a[i];
                a[i]=t;
                correctPos=a[i]-1;
            }
        }
        for(i=0;i<n;i++)
        {
            if( a[i]!=i+1)
                return (i+1);
        }
        return n+1;
    }
}
