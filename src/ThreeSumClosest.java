import java.util.Arrays;

public class ThreeSumClosest {
    static int threeSumClosest(int[] a, int target)
    {
        // code here
        int i,n;
        n=a.length;
        int sum, currSum;
        Arrays.sort(a);
        sum=0;
        int left, right;
        for(i=0;i<n;i++)
        {
            left=i+1;
            right=n-1;
            while(left<right)
            {
                currSum=a[i]+a[left]+a[right];
                if(currSum==target)
                    sum=currSum;
                else if(Math.abs(target-sum)>Math.abs(target-currSum))
                    sum = currSum;
                else if(Math.abs(target-sum)==Math.abs(target-currSum))
                    sum = Math.max(currSum, sum);
                if(currSum>target)
                    right--;
                else
                    left++;
            }
        }
        return sum;
    }
}
