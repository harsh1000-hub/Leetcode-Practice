class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> set=new HashSet<>();
        //here set.contains(n) -> means to store the value that is not equal to 1
        while(n!=1 && !set.contains(n)){
            set.add(n);
            int square=0;
            while(n!=0){
                int ld=n%10;
                square+=(ld*ld);
                n/=10;
            }
                n=square;
              // System.out.println(n);
            
        }
        return n==1;
    }
}