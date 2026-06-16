class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> stack = new ArrayDeque<>();

        for(int i = 0; i < operations.length; i++) {
            if(operations[i].equals("+")) {
                int rightV = stack.removeLast();
                int leftV = stack.removeLast();
                int res = rightV + leftV; 
                stack.addLast(leftV);
                stack.addLast(rightV);
                stack.addLast(res);
            } else if(operations[i].equals("D")) {
                int rightV = stack.peekLast();
                int res = rightV * 2; 
                stack.addLast(res);
            } else if(operations[i].equals("C")) {
                int rightV = stack.removeLast();
            } else {
                stack.addLast(Integer.parseInt(operations[i]));
            }
        }
        int res = 0;
        while(stack.size() > 0) {
            int val = stack.removeLast();
            res += val;
        }
        return res;

    }
}