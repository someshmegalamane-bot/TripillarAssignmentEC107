package exceptions;

    public class InvalidAgeException extends RuntimeException {
        InvalidAgeException(String msg) {
            super(msg);
        }
    }

    class Driver {
        static void checkAge(int age) {
            if (age < 18) {
                throw new InvalidAgeException("Age must be over 18");
            }
            System.out.println("you are eligible");
        }

        public static void main(String[] args) {
            checkAge(15);

        }
    }

