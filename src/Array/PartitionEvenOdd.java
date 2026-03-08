//package Array;
//
//public class PartitionEvenOdd {
//    static void main(String[] args) {
//        int[] arr = {5,2,8,7,1,6};
//        int left = 0 ;
//        int right = arr.length-1;
//
//        while(left<right) {
//            while(arr[left] %2==0 && left<right) {
//                left++;
//            }
//            while (arr[right]%2 ! = 0 && left<right){
//                right--;
//            }
//            if(left<right){
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//                left++;
//                    right--;
//            }
//            if (left>right){
//                int temp = arr[right];
//                arr[right]=arr[left];
//                arr[left] = temp;
//                right++;
//                left--;
//            }
//        }
//    }
//}
