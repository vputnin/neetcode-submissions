// Definition for a pair
// class Pair {
//     int key;
//     String value;
//
//     Pair(int key, String value) {
//         this.key = key;
//         this.value = value;
//     }
// }
public class Solution {
    public List<List<Pair>> insertionSort(List<Pair> pairs) {
        List<List<Pair>> res = new ArrayList<>();

        if (pairs.size() == 0) {
            return res;
        }
        
        res.add(new ArrayList<>(pairs));

        for(int i = 1; i < pairs.size(); i++) {

            int right = i;
            int left = right - 1;

            while(left >= 0 && pairs.get(left).key > pairs.get(right).key ) {
                Pair pairLeft = pairs.get(left);
                Pair pairRight = pairs.get(right);

                pairs.set(right, pairLeft);
                pairs.set(left, pairRight);
                left--;
                right--;
            }
            res.add(new ArrayList<>(pairs));
        }
        return res;
    }
}
