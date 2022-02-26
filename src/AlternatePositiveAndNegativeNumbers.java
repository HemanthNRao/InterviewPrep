import java.util.ArrayList;

public class AlternatePositiveAndNegativeNumbers {
    void rotate(int a[], int start, int end)
    {
        int t = a[end];
        while(end>start)
        {
            a[end]=a[end-1];
            end--;
        }
        a[start]=t;
    }
    void rearrange(int a[], int length) {
        // Solution using extra space
        /*ArrayList<Integer> p = new  ArrayList<Integer>();
        ArrayList<Integer> n = new  ArrayList<Integer>();
        int i;
        for(i=0;i<l;i++)
        {
            if(a[i]>=0)
                p.add(a[i]);
            else
                n.add(a[i]);
        }
        i=0;
        int j=0;
        while(i<l)
        {
            if(i<l && j<p.size())
                a[i++]=p.get(j);
            if(i<l && j<n.size())
            a[i++]=n.get(j);
            j++;
        }*/
        int i,j,k;
        i=j=k=0;
        while(i<length && j<length && k<length)
        {
            if(k%2==0)
            {
                if(a[k]<0)
                {
                    i=k;
                    while(i<length && a[i]<0) i++;
                    if(i<length)
                        rotate(a,k,i);
                }
            }
            else
            {
                if(a[k]>=0)
                {
                    j=k;
                    while(j<length && a[j]>=0) j++;
                    if(j<length)
                        rotate(a,k,j);
                }
            }
            k++;
        }
    }
}
