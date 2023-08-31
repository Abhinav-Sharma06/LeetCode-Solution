class Solution {

    public void sortColors(int[] nums) {
        int zeroIndex = 0, i = 0, twoIndex = nums.length - 1;
        while (i<= twoIndex) {
            if (nums[i] == 0) {
                int temp = nums[zeroIndex];
                nums [zeroIndex] = nums[i];
                nums[i] = temp;
                zeroIndex++;
                i++;
            } 
            else if (nums[i] == 1){
                i++;

            } 
            else {
                int swap = nums[i];
                nums[i] = nums[twoIndex];
                nums[twoIndex] = swap;
                twoIndex--;
            }
        }
    }
}