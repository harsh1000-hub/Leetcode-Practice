class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int []temp=new int[salary.length];
        for(int i=0;i<salary.length;i++){
            temp[i]=salary[i];
        }
        int average=0;
        int len=0;
        for(int i=1;i<temp.length-1;i++){
            average+=temp[i];
            len++;
        }
        double ans = (double)average/len;
        return ans;
    }
}