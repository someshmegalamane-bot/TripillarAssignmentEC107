package Array;

public class HalfTheSize {
    public static void main(String[] args) {
        int[] arr = {2, 2, 1, 1, 3, 3, 4, 4};
        int length = 8;

        for (int i = 0; i < 2; i++) {
                if (arr[i] == arr.length) {
                    System.out.println("the length is : " + arr[i]);
                    System.out.println("the half of length is :" + arr[i]/2);
                }
            }

        }
    }
