class Solution {
    public boolean isPalindrome(String s) {
        int right = s.length() - 1;
        int left = 0;
        s = s.toLowerCase();
        while(left<right){
            if(!Character.isLetterOrDigit(s.charAt(left))){
                left++;
                continue;
            }
            else if(!Character.isLetterOrDigit(s.charAt(right))){
                right--;
                continue;
            }
            else if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            else{
                left++;
                right--;
            }
        }
        return true;
    }
}
