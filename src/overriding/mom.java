package overriding;

interface mom {
        void cook() ;
    }
    interface dad {
        void cook() ;
    }
    class child implements mom,dad {
   public void cook() {
        System.out.println("chinese");
    }
       }
       class Driver1 {
           public static void main(String[] args) {
               child c = new child();
               c.cook();
           }
       }









