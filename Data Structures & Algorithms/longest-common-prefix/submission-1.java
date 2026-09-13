class Solution {
    public String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        int wlen = strs[0].length();
        if(len==1){
            return strs[0];
        }
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        for(int i=0;i<wlen;i++){
            char ch = strs[0].charAt(i);
            for(int j=0;j<len;j++){
                if(i >= strs[j].length() || ch!=strs[j].charAt(i)){
                    flag=false;
                    break;
                }
            }
            if(flag){
                sb.append(ch);
            }
            else{
                break;
            }
        }
        return sb.toString();
    }
}