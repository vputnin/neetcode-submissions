class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        int[] count = new int[2];
        
        for(int i = 0; i < students.length; i++) {
            count[students[i]] += 1;
        }

        for(int i = 0; i < sandwiches.length; i++) {
            if (count[sandwiches[i]] == 0) {
                break;
            }
            count[sandwiches[i]] = count[sandwiches[i]] - 1;
        }
        return count[0] + count[1];
    }
}