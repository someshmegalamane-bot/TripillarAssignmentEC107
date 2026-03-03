package OOPSNDSA;

public class Student {
    String name;
    int usn;
    Student(String n, int u){
        this.name = n;
        this.usn = u;
}
void printDetails(){
    System.out.println("Stdent name is" + name);
    System.out.println("Student usn is " + usn);
}
}

class Driver {
    public static void main(String[] args) {
       Student s1 = new Student("thomz",107);
       s1.printDetails();
    }
}

