public class LargestNumberFormedFromanArray {
    String printLargest(String[] a) {
        // code here
        // Bruteforce approach
        int i, j, n;
        String x, y, res="";
        n=a.length;
        for(i=0;i<n;i++)
        {
            for(j=i+1;j<n;j++)
            {
                x=a[i]+a[j];
                y=a[j]+a[i];
                if(x.compareTo(y)<0)
                {
                    String t=a[i];
                    a[i]=a[j];
                    a[j]=t;
                }
            }
        }
        for(i=0;i<n;i++)
            res+=a[i];
        return res;
    }
}
