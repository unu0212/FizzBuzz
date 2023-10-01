/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        int i = 1;
        while (i < 100) {

            // Find out which numbers divide i.
            i = dofizzbuz(i);
        }
    }

    static int dofizzbuz(int i) {
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        if (divisibleBy3 && divisibleBy5) {

            System.out.println("Fizz Buzz");
            i += 1;

        } else if (divisibleBy3) {

            System.out.println("Fizz");
            i += 1;
        } else if (divisibleBy5) {

            System.out.println("Buzz");
            i += 1;
        } else {

            System.out.println(i);


        }
        return i;
    }
}
