class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> h1 = new HashSet<>();
        int sum =0;
        while(true){
            sum = sq(n);
            if(sum==1){
                return true;
            }
            if(h1.contains(sum)){
                return false;
            }
            h1.add(sum);
            n = sum;
        }
    }
    public int sq(int n){
        int sum = 0;
        while(n>0){
            int t = n % 10;
            sum = sum + (t*t);
            n = n/10;
        }
        return sum;
    }
}
