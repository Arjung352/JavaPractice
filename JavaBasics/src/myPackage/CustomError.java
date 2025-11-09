package myPackage;

public class CustomError {
    public static class InvalidAgeException extends Exception {
        public InvalidAgeException(String message) {
            super(message);
        }
    }

    public void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Not eligible to vote age must be 18 or above.");
        } else {
            System.out.println("You are eligible to vote!");
        }
    }
}
