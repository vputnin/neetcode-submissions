class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> hmap = new LinkedHashMap<>();


        for(int i = 0; i < s.length(); i++) {
            char val = s.charAt(i);

            if(hmap.containsKey(val)) {
                hmap.put(val, -1);
            } else {
                hmap.put(val, i);
            }
        }

        for(Map.Entry<Character, Integer> entry : hmap.entrySet()) {
            if(entry.getValue() >= 0) {
                return entry.getValue();
            }
        }

        return -1;
    }
}