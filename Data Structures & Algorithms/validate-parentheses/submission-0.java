class Solution {
    public boolean isValid(String s) {
        Deque<Character> d = new ArrayDeque<>();
        Map<Character, Character> m = new HashMap<>();
        m.put(']', '[');
        m.put('}', '{');
        m.put(')', '(');

        for(int i = 0; i < s.length(); i++){
            Character c = s.charAt(i);
            if(c.equals(']') || c.equals('}') || c.equals(')')) {
                if(d.size() == 0) {
                    return false;
                }

                Character exp = m.get(c);
                Character first = d.removeLast();

                if(!first.equals(exp)) {
                    return false;
                }
            } else {
                d.addLast(c);
            }
        }
        if(d.size() > 0) {
            return false;
        }
        return true;
    }
}
