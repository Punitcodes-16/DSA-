class Solution {
    public int lengthOfLastWord(String s) {
        String words [] = s.split(" ");
        String lastWord = words[words.length-1];
        int length = lastWord.length();
        return length;
   }

}
public static void main(String[] args) {
    Solution solution = new Solution();
    String s = "Hello World";
    int result = solution.lengthOfLastWord(s);
    System.out.println("Length of last word: " + result);
}