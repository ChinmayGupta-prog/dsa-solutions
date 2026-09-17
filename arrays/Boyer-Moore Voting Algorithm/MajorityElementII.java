class MajorElement {
    public List<Integer> majorityElement(int[] nums) {
        int maj1 =0,maj2 =0, count1= 0, count2=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==maj1){
                count1 ++;
            }
            else if(nums[i] == maj2){
                count2++;
            }
            else if(count1 == 0){
                maj1 = nums[i];
                count1=1;
            }
            else if(count2 == 0){
                maj2 = nums[i];
                count2 = 1;
            }
            else{
                count1--;
                count2--;
            }
        }
        
        int freq1 = 0;
        int freq2 = 0;
        for(int value: nums){
            if(value == maj1)
                freq1++;
            else if(value == maj2)
                freq2++;
        }
        int n = nums.length;
        int k = n/3;
        List<Integer> majorElement =  new ArrayList<>();
        if(freq1>k)
            majorElement.add(maj1);
        if(freq2>k)
            majorElement.add(maj2);
        return majorElement;
    }
}
