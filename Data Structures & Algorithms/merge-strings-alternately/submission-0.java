class Solution {
    public String mergeAlternately(String word1, String word2) {
        int len1 = word1.length();
        int len2 = word2.length();
        StringBuilder sb = new StringBuilder();
        int small = Math.min(len1, len2);
        for(int i=0;i<small;i++){
            sb.append(word1.charAt(i));
            sb.append(word2.charAt(i));
        }
        if(len1>len2){
            for(int i = small;i<len1;i++){
                sb.append(word1.charAt(i));
            }
        }
        else{
            for(int i = small;i<len2;i++){
                sb.append(word2.charAt(i));
            }
        }
        return sb.toString();
    }
}