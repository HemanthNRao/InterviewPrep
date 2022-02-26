public class LongestCommonPrefixInAnArray {
    String longestCommonPrefix(String a[], int n){
        // code here
        int i,min;
        min=a[0].length();
        for(i=1;i<n;i++)
        {
            if(a[i].length()<min)
                min=a[i].length();
        }
        int j;
        String res="";
        for(i=0;i<min;i++)
        {
            char current=a[0].charAt(i);
            for(j=1;j<n;j++)
            {
                if(a[j].charAt(i)!=current)
                    if(res=="")
                        return "-1";
                    else return res;
            }
            res+=current;
        }
        return res;
    }
}
