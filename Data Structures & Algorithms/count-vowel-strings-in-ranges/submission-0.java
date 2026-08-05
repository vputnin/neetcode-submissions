class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        List<Integer> res = new ArrayList<>();

        for(int i = 0; i < queries.length; i++) {
            int sum = 0;
            int left = queries[i][0];
            int right = queries[i][1];

            while(left <= right) {
                String word = words[left];
                if(vowels.contains(word.charAt(0)) && 
                 vowels.contains(word.charAt(word.length() - 1))) {
                    sum+=1;
                }
                left++;
            }
            res.add(sum);
        }
        return res.stream()
                  .mapToInt(Integer::intValue)
                  .toArray();
    }
}