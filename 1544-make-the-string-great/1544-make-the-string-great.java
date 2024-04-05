class Solution {
    
    int check(int idx, String ss) {
        for (int i = idx; i < ss.length() - 1; i++) {
            if (Math.abs(ss.charAt(i) - ss.charAt(i + 1)) == 32) {
                // 아스키값 차이가 32인 것 -> 대소문자 인 관계 발견하면 둘 다 삭제
                return i;
            }
        }
        return -1;
    }
    
    public String makeGood(String s) {
        int idx = 0;

        while (true) {
            // 모두 없어질때까지 반복
            idx = check(idx, s);
            if (idx == -1) {
                break;
            }
            s = s.substring(0, idx) + s.substring(idx + 2);
            idx = Math.max(0, idx - 2);  // 인덱스 에러 방지

        }
        return s;
    }
}