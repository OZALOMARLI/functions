public class voidOperations {
    public static void main(String[] args) {
        String message = "Today weather is good. ";
        String newMessage = city();
        String newMessage2 =message.substring(0,5);
        System.out.println(newMessage);
        int number = sum(9,7);
        System.out.println(number);
        System.out.println (newMessage2);
    }

    public static void adding() {
        System.out.println("Number added"); /* Adding Void Operation */
    }

    public static void deleting() {
        System.out.println("Number deleted"); /* Deleting Void Operation */
    }

    public static void updating() {
        System.out.println("Number updated"); /* Updating Void Operation */
    }
    public static int sum( int number1, int number2 ) {
        return number1+number2; /* Finish but turn sum of 9 and 7 */
    }

    public static String city(){
        return "Baku";
    }
}
