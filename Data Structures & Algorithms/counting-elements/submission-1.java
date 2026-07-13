class Solution {
    public int countElements(int[] arr) {
        //34 38 start 
        //59 figured out that I understood requirements wrong 
        //05 solved it. I thought the indices should be counted as the length of the longest consecutive sequence without gaps.
        Set<Integer> set = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        int counter = 0;
        for(Integer val : arr) {
            if(set.contains(val + 1)) {
                counter+=1;
            }
        }
        return counter;


    }
}
