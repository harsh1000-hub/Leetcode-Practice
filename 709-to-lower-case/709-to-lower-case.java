class Solution {
    public String toLowerCase(String s) {
        StringBuilder str=new StringBuilder(s);
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                char lower_case=(char)('a'+ch-'A');
                str.setCharAt(i,lower_case);
            }
        }
        return str.toString();
    }
}