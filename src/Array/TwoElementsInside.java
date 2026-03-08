package Array;

public class TwoElementsInside {
    public static void main(String[] args) {
        int[] arr = {4,9,14,19};
        int target = 16;

        for(int i=0;i<arr.length;i++){
            for(int j=0; j<arr.length;j++){
                if(arr[i] + arr[j] == target) {
                    System.out.println("Pair if Found:" + arr[i] + " " + arr[j]);
                    System.out.println("Index are " +i+" "+j);
                }
            }
        }
    }
}
