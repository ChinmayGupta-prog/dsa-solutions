class PartitionArrayAccordingToGivenPivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int resultArray[] = new int[nums.length];
        int i=0;
        for(int j=0;j<nums.length;j++){
            if(nums[j]<pivot){
                resultArray[i++]=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]==pivot){
                resultArray[i++]=nums[j];
            }
        }
        for(int j=0;j<nums.length;j++){
            if(nums[j]>pivot){
                resultArray[i++]=nums[j];
            }
        }
        return resultArray;
    }
}
