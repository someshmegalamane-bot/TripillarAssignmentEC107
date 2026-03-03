public class animal {
        void eat() {
            System.out.println(" Eating....");
        }
    }
    class Dog extends animal{
        void bark() {
            System.out.println("Barking....");
        }
    }
    class Puppy extends Dog{
    void sleep(){
        System.out.println("Napping....");
    }
}
class Snake extends Puppy{
    void hiss(){
        System.out.println("Hissing....");
    }
}

    class Driver{
        public static void main(String[] args) {
            animal a = new animal();
            a.eat();

            Dog d = new Dog ();
            d.bark();
            d.eat();

            Puppy p = new Puppy();
            p.sleep();
            p.eat();
            p.bark();

            Snake s = new Snake();
            s.hiss();
            s.eat();
            s.bark();

        }
    }


