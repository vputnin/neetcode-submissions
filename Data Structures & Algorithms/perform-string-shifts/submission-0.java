class Solution {
    public String stringShift(String s, int[][] shift) {
        //00
        Deque<Character> deq = new ArrayDeque<>();
        for(Character c : s.toCharArray()) {
            deq.addLast(c);
        }

        for(int[] pair : shift) {
            if(pair[0] == 0) {
                int counter = pair[1];
                while(counter > 0) {
                    char c = deq.pollFirst();
                    deq.addLast(c);
                    counter -=1;
                }
            } else {
                int counter = pair[1];
                while(counter > 0) {
                    char c = deq.pollLast();
                    deq.addFirst(c);
                    counter -=1;
                }
            }
        }

        StringBuilder sb = new StringBuilder();
        for(Character c : deq) {
            sb.append(c);
        }

        return sb.toString();
    }
}
