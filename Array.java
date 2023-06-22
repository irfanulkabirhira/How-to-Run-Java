package How_To_Run_JAVA;

public class Array {
    public static void main(String[] args) {
        Object[] data = { "Hira", "Tyba", 100, 'T' };
        System.out.println("Items are:");
        for (Object item : data) {
            System.out.println(item);
        }
    }
}
