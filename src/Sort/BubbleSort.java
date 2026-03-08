package Sort;

public class BubbleSort {
    static void BubbleSort(int [] arr) {
        for (int i =0; i<arr.length; i++){
            for (int j=0; j< arr.length; j++){
                if(arr[i] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};
        BubbleSort(arr);
        for(int i=0; i< arr.length; i++){
            System.out.println("Output" + arr[i]);
        }
    }
}
