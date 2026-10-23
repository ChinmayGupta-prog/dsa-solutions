class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0, ans = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            if (count == 0) {
                ans = nums[i];
                count++;
            }
            else if (nums[i] == ans) {
                count++;
            }
            else {
                count--;
            }
        }

        return ans;
    }
}
