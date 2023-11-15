class Solution {
    public boolean halvesAreAlike(String s) {
        char[] vowels = {'a', 'e', 'i', 'o', 'u'};
        int a1 = 0;
        int a2 = 0;
        String s1 = s.substring(0, s.length() / 2).toLowerCase();
        String s2 = s.substring(s.length() / 2, s.length()).toLowerCase();

        for (char v : vowels) {
            a1 += s1.chars().filter(c -> c == v).count();
            a2 += s2.chars().filter(c -> c == v).count();
        }
        
        return a1 == a2;
    }
}