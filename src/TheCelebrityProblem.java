import java.util.Stack;

public class TheCelebrityProblem {
    //Function to find if there is a celebrity in the party or not.
    int celebrity(int a[][], int n)
    {
        // code here
        // Brute force approach
    	/*int i,j;
    	boolean flag;
    	for(i=0;i<n;i++)
    	{
    	    flag=true;
    	    for(j=0;j<n;j++)
    	    {
    	        if(i!=j)
    	        {
    	            if(a[j][i]==0)
    	                flag=false;break;
    	        }
    	    }
    	    if(flag==true)
    	    {
    	        for(int k=0;k<n;k++)
    	        {
    	            if(a[i][k] == 1)
    	                flag=false;
    	        }
    	    }
    	    if(flag==true)
    	        return i;
    	}
    	return -1;*/
        Stack<Integer> s =new Stack<>();
        int first, second,i,k;
        for(i=0;i<n;i++)
            s.push(i);
        int count = 0;
        while(s.size()>=2)
        {
            first = s.pop();
            second = s.pop();
            if(a[first][second] == 1)
                s.push(second);
            else
                s.push(first);
        }

        k=s.pop();
        for(i=0;i<n;i++)
        {
            if(i!=k && (a[k][i] == 1 || a[i][k] == 0))
                return -1;
        }
        return k;
    }
}
