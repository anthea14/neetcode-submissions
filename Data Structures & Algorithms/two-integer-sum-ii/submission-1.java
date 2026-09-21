class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0, right=numbers.length-1;
        int[] a = new int[2];
        int sum=0;
        while(left<right){
            sum = numbers[left] + numbers[right];
            if(sum>target){
                right--;
            }
            else if(sum<target){
                left++;
            }
            else{
                a[0] = left+1;
                a[1] = right+1;
                break;
            }
        }
        return a;
    }
}
