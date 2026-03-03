package String;

public class StringBufferandBuilder {
     static void stringappend() {
        StringBuilder sbf = new StringBuilder("Hello");
         System.out.println("original String is:" + sbf);
         sbf.append("World");
         System.out.println("New String is : " + sbf);
    }
    static void stringinsert(){
         StringBuilder sbf = new StringBuilder("Hello");
        System.out.println("original String is" + sbf);
        sbf.insert(2,"World");
        System.out.println("New String is : " + sbf);
    }
    static void stringReverse() {
        StringBuilder sbf = new StringBuilder("Hello");
        System.out.println("original String is" + sbf);
        sbf.insert(2, "World");
        System.out.println("New String is : " + sbf);
    }

    static void main(String[] args) {
        stringappend();
        stringinsert();
        stringReverse();
    }
}
