class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0)
        {
            return true;
        }
        int indx_s=0,indx_t=0;
       // int count=0;
        while(indx_t<t.length())
        {
            if(t.charAt(indx_t)==s.charAt(indx_s))
            {
                 indx_s++;
                if(indx_s==s.length())
                {
                    return true;
                }
            }
            indx_t++;
        }
        return false;
    }
}