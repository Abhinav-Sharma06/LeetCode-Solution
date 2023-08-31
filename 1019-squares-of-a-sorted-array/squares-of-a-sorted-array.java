class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length -1;
        int arr[] = new int[nums.length];

        for(int k = arr.length-1; k>=0; k--){

            if(Math.abs(nums[i]) >= Math.abs(nums[j])){
                arr[k] = nums[i]*nums[i];
                i++;
            }
            else{
                arr[k] = nums[j]*nums[j];
                j--;
            }
        }
        return arr;
        
    }
}