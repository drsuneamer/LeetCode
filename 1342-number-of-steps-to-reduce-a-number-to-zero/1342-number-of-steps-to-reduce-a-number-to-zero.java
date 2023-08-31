class Solution {
    public int numberOfSteps(int num) {
        int answer = 0;
        
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                answer++;
            } else {
                num--;
                answer++;
            }
        }
        
        return answer;
    }
}