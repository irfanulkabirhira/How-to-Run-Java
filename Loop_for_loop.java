package How_To_Run_JAVA;

public class Loop_for_loop {
    public static void main(String[] args) {
        for (int hira = 1; hira <= 8; hira++) {
            System.out.println("step : " + hira);
        }

        System.out.println();

        for (int hira = 8; hira >= 1; hira--) {
            System.out.println("step : " + hira);
        }

        System.out.println("Odd Numbers from 1 to 10:");
        for (int number = 1; number <= 10; number++) {
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }
}
