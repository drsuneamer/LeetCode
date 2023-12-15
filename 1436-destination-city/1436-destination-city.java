class Solution {
    public String destCity(List<List<String>> paths) {
        List<String> from = new ArrayList<String>();
        List<String> to = new ArrayList<String>();
        
        for (List<String> l : paths) {
            from.add(l.get(0));
            to.add(l.get(1));
        }
        
        for (String s : to) {
            if (from.contains(s) == false) {
                return s;
            }
        }
        return "";
    }
}