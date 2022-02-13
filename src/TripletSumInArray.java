import java.util.Arrays;

public class TripletSumInArray {
    public static boolean find3Numbers(int a[], int n, int sum) {

        // Your code Here
        // Use 3 loops and find the elements
        // Optimized approach
        // Sort the array, then use left and right pointer
        Arrays.sort(a);
        int i, left, right;
        for(i=0;i<n-2;i++)
        {
            left=i+1; right=n-1;
            while(left<right)
            {
                if((a[i]+a[left]+a[right]) == sum)
                    return true;
                if((a[i]+a[left]+a[right])>sum)
                    right--;
                else
                    left++;
            }
        }
        return false;
    }
}
