package String;

public class StringMethods {
    static void main(String[] args) {
        String s1 = "Java Programming";
        String s2 = new String ("Java Programming");

        System.out.println("Original String" +  s1);

        //length method
        System.out.println("Length:" +  s1.length());

        //charAT()
        System.out.println("Character at  index 2" + s1.charAt(2));

        //toUpperCase() and toLowerCase()
        System.out.println("UpperCase: " + s1.toUpperCase());
        System.out.println("LowerCase: " + s1.toLowerCase());

        //equals() and ==
        System.out.println("using ==" + (s1 == s2));
        System.out.println("using equals()" + s1.equals(s2));

        //compareto() >> lexicographical comparision(ASCII compare)
        System.out.println("compareTo() " + s1.compareTo(s2));

        //substring()
        System.out.println("Substring 0 to 4: " + s1.substring(0,4));

        //contain()
        System.out.println("Contains program > " + s1.contains("Program"));

        //IndexOf()
        System.out.println("Index of 'a" + s1.indexOf('a'));

        //replace()
        System.out.println("replace java to python" + s1.replace("Java" ,"Python"));

        //concut()
        System.out.println("concat:" + s1.concat("Language"));

        //isEMpty()
        String s4 = "";
        System.out.println("IsEmpty: " +s4.isEmpty());

        //split()
        String sentence = "Java is a programming Language:";
String[] arr = sentence.split(" ");

for (String i : arr){
    System.out.println(i);
}
    }
}
