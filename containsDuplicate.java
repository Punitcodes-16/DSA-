import java.util.HashSet;
class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            if(!set.add(num)){
                return true;
            }
        }
        return false;
    }
    
}
public static void main(String[] args) {
    Solution solution = new Solution();
    int[] nums = {1, 2, 3, 1};
    boolean result = solution.containsDuplicate(nums);
    System.out.println("Contains duplicate: " + result);
}