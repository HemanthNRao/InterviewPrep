public class EquilibriumIndexOfAnArray {
    public static int findEquilibrium(int a[], int n)
    {
        int leftSum, rightSum, i;
        leftSum=rightSum=0;
        for(i=0;i<n;i++)
            rightSum+=a[i];

        for(i=0;i<n;i++)
        {
            rightSum-=a[i];
            if(leftSum==rightSum)
                return i;
            leftSum+=a[i];
        }
        return -1;
    }
}
