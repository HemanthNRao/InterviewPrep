import java.util.ArrayList;

public class PlusOne {
    static ArrayList<Integer> increment(ArrayList<Integer> a , int n) {
        // code here
        int i, sum, carry, rem;
        carry=1;
        i=n-1;
        while(carry>0 && i>=0)
        {
            sum=a.get(i)+carry;
            carry=sum/10;
            rem=sum%10;
            a.set(i, rem);
            i--;
        }
        if(carry>0)
            a.add(0, carry);
        return a;
    }
}
