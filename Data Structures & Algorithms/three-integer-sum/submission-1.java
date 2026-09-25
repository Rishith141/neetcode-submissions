class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();

        Arrays.sort(nums);

        for (int i = 0; i < n - 2; i++) {

            // Skip duplicate first elements
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            // Since array is sorted, no triplet is possible
            if (nums[i] > 0) {
                break;
            }

            int l = i + 1;
            int r = n - 1;

            while (l < r) {

                int sum = nums[i] + nums[l] + nums[r];

                if (sum > 0) {
                    r--;
                } 
                else if (sum < 0) {
                    l++;
                } 
                else {
                    ans.add(Arrays.asList(nums[i], nums[l], nums[r]));

                    // Skip duplicates
                    while (l < r && nums[l] == nums[l + 1]) {
                        l++;
                    }

                    while (l < r && nums[r] == nums[r - 1]) {
                        r--;
                    }

                    l++;
                    r--;
                }
            }
        }

        return ans;
    }
}