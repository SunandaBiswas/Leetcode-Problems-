class Solution {
    public int[] getConcatenation(int[] nums) {
        int x = nums.length;
        int ans[] = new int[2*x];
        for(int i=0; i<ans.length/2; i++){
            ans[i] = nums[i];
            ans[i+x] = nums[i];
        }
        return ans;                
    }
}
