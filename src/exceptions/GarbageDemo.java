package exceptions;

public class GarbageDemo { // This Finalize Function will only get called when System.gc() is called
                            // But that too it depends on JVM when to collect garbage and when to leave
                            // so we cant predict that how many times the garbage is collected
    public void finalize(){
        System.out.println("Garbage Collected");
    }
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            GarbageDemo obj1 = new GarbageDemo();
            obj1 = null;
        } // addinng gc before the closing bracket gets the gc collection of its wish
            System.gc(); //call gc(Garbage Collector)
         // adding this after the closing bracket gets the typed no of time manually
    }
}
