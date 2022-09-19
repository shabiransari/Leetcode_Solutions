class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map=new HashMap<>();
        int start=0;
        int maxLength=0;
        for(int end=0; end<s.length(); end++){
            char rightChar=s.charAt(end);
            if(map.containsKey(rightChar)){
                start=Math.max(start, map.get(rightChar)+1);
            }
           map.put(rightChar, end);
           maxLength=Math.max(maxLength, end-start+1);
        }
        return maxLength;
    }
}