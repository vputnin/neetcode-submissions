class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();

        int leftL = 0;
        int leftR = 0;

        while(leftL < word1.length() && leftR < word2.length()) {
            sb.append(word1.charAt(leftL));
            sb.append(word2.charAt(leftR));
            leftL+=1;
            leftR+=1;
        }

        while(leftL < word1.length()) {
            sb.append(word1.charAt(leftL));
            leftL+=1;
        }

        while(leftR < word2.length()) {
            sb.append(word2.charAt(leftR));
            leftR+=1;
        }
        return sb.toString();
    }
}