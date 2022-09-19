class Solution {
    public int[] twoSum(int[] nums, int target) {
        int a[]=new int[2];
        HashMap<Integer, Integer> hm=new HashMap<>();
        for(int i=0; i<nums.length; i++){
            
                int x=target-nums[i];
                if(hm.containsKey(x)){
                    a[0]=hm.get(x);
                    a[1]=i;
                }else{
                    hm.put(nums[i], i);
                }
            
        }
        return a;
    }
}