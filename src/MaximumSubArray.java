import java.util.ArrayList;

public class MaximumSubArray {
    ArrayList<Integer> findSubarray(int a[], int n) {
        // code here
        int i, sum, currSum, start, end, aStart, aEnd;
        sum=currSum=start=end=aStart=aEnd=0;
        for(i=0;i<n;i++)
        {
            if(a[i]<0)
            {
                currSum=0;
                start=i+1;
            }
            else
                currSum+=a[i];
            if(currSum>=sum)
            {
                sum=currSum;
                aStart=start;
                aEnd=i;
            }

        }

        ArrayList<Integer> res = new ArrayList<Integer>();
        for(i=aStart;i<=aEnd;i++)
        {
            if(a[i]>-1)
                res.add(a[i]);
        }

        if(res.isEmpty())
            res.add(-1);
        return res;
    }
}
