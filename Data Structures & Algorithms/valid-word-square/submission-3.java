class Solution {
    public boolean validWordSquare(List<String> words) {
        // 14.40 - 21.30 = 7 hours
        //Firstly I've skiped some requirements, then it was difficult to understand how to reflect.
        //solved it in several hours 
        for(int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            for(int j = 0; j < word.length(); j++) {
                if(j >= words.size()) {
                    return false;
                }

                if(i >= words.get(j).length()) {
                    return false;
                }



                if(word.charAt(j) != words.get(j).charAt(i)) {
                    return false;
                }
            }

        }

        return true;
    }
}
