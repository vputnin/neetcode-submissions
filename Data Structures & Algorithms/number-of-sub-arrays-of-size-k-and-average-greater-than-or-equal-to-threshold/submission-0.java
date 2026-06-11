class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int right = 0;
        int left = 0;
        int averageSum = 0;
        int average = 0;
        int result = 0;

        while(right < k) {
            averageSum += arr[right];
            right+=1;
        }

        average = averageSum / k;
        if (average >= threshold) {
            result += 1;
        } 

        while (right < arr.length) {
            averageSum += arr[right];
            averageSum -= arr[left];

            average = averageSum / k;
            if (average >= threshold) {
                result += 1;
            } 

            right+=1;
            left+=1;
        }
        return result;

    }
}