class NextPermutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;

        // Find the rightmost position that can be increased
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        if (i >= 0) {
            int j = n - 1;

            // Find the smallest value greater than nums[i]
            while (nums[j] <= nums[i]) {
                j--;
            }

            swap(nums, i, j);
        }

        // Make the remaining part as small as possible
        reverse(nums, i + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    private void reverse(int[] nums, int left, int right) {
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }
}
