import java.util.Stack;

public class StockSpanProblem {
    public static int[] calculateSpan(int price[], int n)
    {
        // Your code here
        int span[] = new int[n];
        Stack<Integer> s = new Stack<Integer>();
        s.push(0);
        span[0]=1;
        for(int i=1;i<n;i++)
        {
            while(!s.isEmpty() && price[s.peek()]<=price[i])
                s.pop();
            if(s.isEmpty())
                span[i]=i+1;
            else
                span[i]=i-s.peek();
            s.push(i);
        }
        return span;
    }
}
