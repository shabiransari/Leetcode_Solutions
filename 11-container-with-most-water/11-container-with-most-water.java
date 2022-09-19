class Solution {
    public int maxArea(int[] height) {
        int l=0, h=height.length-1;
        int max=0;
        while(l<h){
            int min=Math.min(height[l], height[h]);
            max=Math.max(max, min*(h-l));
            if(height[h]<height[l]){
                h--;
            }else{
                l++;
            }
            
        }
        return max;
    }
}