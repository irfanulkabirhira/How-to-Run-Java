package How_To_Run_JAVA;

public class Loop_Do_while_loop {
    public static void main(String[] args) {
        int hira = 1;
        do {
            System.out.println("step : " + hira);
            hira++;
        } while (hira <= 8);

        System.out.println();

        hira = 8;
        do {
            System.out.println("step : " + hira);
            hira--;
        } while (hira >= 1);

        System.out.println("Odd Numbers from 1 to 10:");
        int number = 1;
        do {
            if (number % 2 != 0) {
                System.out.println(number);
            }
            number++;
        } while (number <= 10);
    }
}
