package BitManupulations;

public class LsbMsb {

    // Print bit

    public static void printBit(int num) {
        for (int i = 7; i >= 0; i--) {
            System.out.print((num >> i) & 1);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        printBit(53);

    }
}
