package exceptions;

public class exepction {
    static void main(String[] args) {
        int i=10, j=5,k=2;
        try{
            k = i*j+k;
            int[] arr = {1,2,3,4,5};
            System.out.println(arr[20]);
        }
        catch (ArithmeticException e){
            System.out.println("You cant divide anything by zero");
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Invalid Index!");
        }
        catch (Exception e) {
            System.out.println("Unknown Exception");
        }
        finally {
            System.out.println("This block will get executed");
        }
        System.out.println("Hello");
    }
}
