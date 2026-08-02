class Solution {
    public boolean isPalindrome(String s) {
        // 15 
        //left right if not char move, else compare while left < right + to Low Character 

        int left = 0;
        int right = s.length() - 1;

        while(left < right) {
            char leftC = Character.toLowerCase(s.charAt(left));
            char rightC = Character.toLowerCase(s.charAt(right));

            boolean lt = Character.isLetterOrDigit(leftC);
            boolean rt = Character.isLetterOrDigit(rightC);

            if(!lt) {
                left++;
                continue;
            }
            if(!rt) {
                right--;
                continue;
            }

            if(leftC != rightC) {
                return false;
            }
            left++;
            right--;
        }

        return true;
        






























        // int left = 0;
        // int right = s.length() - 1;

        // while(left <= right) {
        //     if(!Character.isLetterOrDigit(s.charAt(left))) {
        //         left++;
        //     } else if(!Character.isLetterOrDigit(s.charAt(right))) {
        //         right--;
        //     } else if(Character.toLowerCase(s.charAt(left)) == Character.toLowerCase(s.charAt(right))) {
        //         left++;
        //         right--;
        //     } else {
        //         return false;
        //     }
        // }
        // return true;
    }
}
