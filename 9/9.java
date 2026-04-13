class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        String number = Integer.toString(x);
        char[] nums = number.toCharArray();

        int n = nums.length;
        boolean result = false;

        if (n % 2 == 0) { // even
            for (int i = 0; i < n; i++) {
                if (nums[i] == nums[n - 1 - i]) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        } else { // odd
            int middle = n / 2 + 1;

            for (int i = 0; i < n; i++) {
                if (nums[i] == nums[n - 1 - i] && i != middle) {
                    result = true;
                } else if (i == middle) {
                    result = true;
                } else {
                    result = false;
                    break;
                }
            }
        }

        return result;

    }
}