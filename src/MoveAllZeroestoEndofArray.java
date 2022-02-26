public class MoveAllZeroestoEndofArray {
    void pushZerosToEnd(int[] a, int n) {
        // code here
        int i,j;
        j=0;
        for(i=0;i<n;i++)
        {
            if(a[i]!=0)
                a[j++]=a[i];
        }
        for(i=j;i<n;i++)
            a[i]=0;
    }
}
