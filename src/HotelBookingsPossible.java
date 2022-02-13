import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingsPossible {
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int i,j,n,t=0;
        n=arrive.size();
        Collections.sort(arrive);
        Collections.sort(depart);
        i=j=0;

        while(i<n && j<n && t<=K)
        {
            if(arrive.get(i)<depart.get(j))
            {
                i++;
                t++;
            }
            else
            {
                j++;
                t--;
            }
        }
        if(t<=K)
            return true;
        else
            return false;

    }
}
