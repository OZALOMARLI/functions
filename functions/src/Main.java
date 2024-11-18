////In this working file we will meet the methods and see how they are used.

public class Main {
    public static void main(String[] args) {
    numberFounding(); // In this section, we call the method we created below.
    }
    // On line 8 we create a new method, we create this method to call it later.
    public static void numberFounding ()  {
        int[] numbers = new int[]{1, 2, 5, 7, 9, 0};
        int searchingNumber = 6;
        boolean found = false;

        for (int number : numbers) {
            if (
                number == searchingNumber
            ) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println(" Number Found! ");
        } else {
            System.out.println(" Number Not Found! ");
        }
    }

}
