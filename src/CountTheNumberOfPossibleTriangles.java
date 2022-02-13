import java.util.Arrays;

public class CountTheNumberOfPossibleTriangles {
    static int findNumberOfTriangles(int a[], int n)
    {
        // code here
        // Time complexity is O(n^2)
        if(n<3)
            return 0;
        int i, left, right, count=0;
        Arrays.sort(a);
        for(i=n-1;i>=2;i--)
        {
            left=0;
            right=i-1;
            while(left<right)
            {
                if((a[left]+a[right])>a[i])
                {
                    count+=(right-left);
                    right--;
                }
                else
                    left++;
            }
        }
        return count;
    }
}
