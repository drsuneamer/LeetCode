class Solution {
    public boolean isPalindrome(int x) {
        String str = Integer.toString(x);
        StringBuffer sb = new StringBuffer(str);

        return str.equals(sb.reverse().toString());
    }
}