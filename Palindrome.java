class Solution {
    private static boolean checkPalindrome(String num){
        int left=0;
        int right=num.length()-1;
        while(left<right){
            if(num.charAt(left)!=num.charAt(right)){
            return false;
        }
        left++;
        right--;
    } return true;
    
    }
   
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        String num =x+"";
        return checkPalindrome(num);
    }

    
    public static void main(String[] args) {
        Solution solution = new Solution();
        int number = 121;
        boolean result = solution.isPalindrome(number);
        System.out.println("Is " + number + " a palindrome? " + result);
    }
}