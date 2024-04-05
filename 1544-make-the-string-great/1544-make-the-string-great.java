class Solution {
    String check(String ss) {
        for (int i = 0; i < ss.length() - 1; i++) {
            if (Math.abs(ss.charAt(i) - ss.charAt(i + 1)) == 32) {
                return ss.substring(0, i) + ss.substring(i + 2);
            }
        }
        return "end";
    }
    
    public String makeGood(String s) {
        while (true) {
            String re = check(s);
            if (re == "end") {
                break;
            }
            s = re;
        }
        return s;
    }
}