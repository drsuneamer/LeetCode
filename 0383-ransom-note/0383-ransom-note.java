class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<String, Integer> magHash = new HashMap<>();
        
        for (char r : magazine.toCharArray()) {
            String rr = Character.toString(r);
            if (magHash.get(rr) == null) {
                magHash.put(rr, 1);
            } else {
                magHash.put(rr, magHash.get(rr) + 1);
            }
        }
        
        for (char r : ransomNote.toCharArray()) {
            String rr = Character.toString(r);
            if (magHash.get(rr) == null) {  // 아예 없던 문자인 경우
                return false;
            } else {
                if (magHash.get(rr) == 0) { // 모두 소진한 경우
                    return false;
                } else {
                    magHash.put(rr, magHash.get(rr) - 1);   // 하나 차감
                }
            }
        }
        
        
        return true;
    }
}