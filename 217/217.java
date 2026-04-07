class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> vals = new HashSet<>();
        boolean exist = true;

        for (int i = 0; i < nums.length; i++) {
            exist = vals.add(nums[i]);
            if (exist == false) {
                return true;
            }
        }
        return false;
    }
}