class Solution {
    public String toLowerCase(String s) {
        String str="";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch>='A' && ch<='Z'){
                char lower_case=(char)('a'+ch-'A');
                str+=lower_case;
            }else{
                str+=s.charAt(i);
            }
        } 
        return str;
    }
}