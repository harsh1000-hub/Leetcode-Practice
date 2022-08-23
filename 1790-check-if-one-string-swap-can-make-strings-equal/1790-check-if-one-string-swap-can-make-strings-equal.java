class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
       int []first=new int[26];
        int []second=new int[26];
        int counter=0;
        for(int i=0;i<s1.length();i++){
            char s_1=s1.charAt(i);
            char s_2=s2.charAt(i);
            if(s_1!=s_2){
                counter++;
            }
            if(counter>2){
                return false;
            }
            first[s_1-'a']++;
            second[s_2-'a']++;
        }
        return Arrays.equals(first,second);
    }
}