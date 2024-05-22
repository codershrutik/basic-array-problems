public class MaxRange {
    public static void main(String[] args) {

        int[] arr = { 1, 33, 55, 76, 88, 92, 8 };

        System.out.println(maxRange(arr));
    }

    static int maxRange(int[] arr, int start, int end){
        int max = arr[start];
        for(int i=start; i<= end; i++){
            if(arr[i]>max){
                max = arr[i]
            }
        }
        return max;
    }
}
