class SortColors {
    public void sortColors(int[] nums) {
        int low =0,mid=0,high=nums.length-1;
        while(mid<=high){
            if(nums[mid]==0){
                int value = nums[low];
                nums[low]=nums[mid];
                nums[mid]=value;
                ++low;
                ++mid;
            }
            else if(nums[mid]==1){
                ++mid;
            }
            else{
                int value = nums[high];
                nums[high]=nums[mid];
                nums[mid]=value;
                --high;
            }
        }
    }
}
