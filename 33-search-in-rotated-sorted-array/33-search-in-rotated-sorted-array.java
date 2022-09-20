class Solution {
    public int search(int[] nums, int target) {
         int l=0;
        int h=nums.length-1;
        while(l<=h){
            int m=(l+(h-l)/2);
            if(nums[m]==target){
                return m;
            }
            if(nums[m]>=nums[0]){
                if(nums[m]>=target && nums[l]<=target){
                    h=m-1;
                }else{
                    l=m+1;
                }
            }else{
                if(nums[m]<=target && nums[h]>=target){
                    l=m+1;
                }else{
                    h=m-1;
                }
            }
        }
        return -1;
    }
 }