class Solution {
    public int subarraySum(int[] nums, int k) {
        int sum=0;
        int ct=0;
        HashMap<Integer, Integer> hm=new HashMap<>();
        hm.put(0, 1);
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            int key=sum-k;
            if(hm.containsKey(key)){
                ct+=hm.get(key);
            }
            hm.put(sum, hm.getOrDefault(sum, 0)+1);
        }
        return ct;
    }
}