class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> h1 = new HashMap<>();
        int sum =0;
        while(true){
            sum = sq(n);
            if(sum==1){
                return true;
            }
            if(h1.containsKey(sum)){
                return false;
            }
            h1.put(sum,1);
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
