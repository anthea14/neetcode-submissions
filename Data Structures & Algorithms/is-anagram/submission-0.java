class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();
        if(len1!=len2){
            return false;
        }
        HashMap<Character, Integer> h1 = new HashMap<>();
        for(int i=0;i<len1;i++){
            h1.put(s.charAt(i), h1.getOrDefault(s.charAt(i),0)+1);
        }
        for(int i=0;i<len2;i++){
            if(!h1.containsKey(t.charAt(i))){
                return false;
            }
            h1.put(t.charAt(i),h1.get(t.charAt(i))-1);
            if(h1.get(t.charAt(i))==0){
                h1.remove(t.charAt(i));
            }
        }
        return true;
    }
}
