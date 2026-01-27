class Solution {
    public int searchInsert(int[] nums, int target) {
        int mid;
        int left = 0 ;
        int right = nums.length-1;
        while(left <= right){
            mid = left + (right-left)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(target<nums[mid]){
                right=mid-1;
            }
            else{
                left= mid+1;
            }
        }
        return left;
    
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = {1, 3, 5, 6};
        int target = 5;
        int result = solution.searchInsert(nums, target);
        System.out.println("Insert position for target " + target + " is: " + result);

        // You can test with additional examples:
        target = 2;
        result = solution.searchInsert(nums, target);
        System.out.println("Insert position for target " + target + " is: " + result);

        target = 7;
        result = solution.searchInsert(nums, target);
        System.out.println("Insert position for target " + target + " is: " + result);

        target = 0;
        result = solution.searchInsert(nums, target);
        System.out.println("Insert position for target " + target + " is: " + result);
    }

