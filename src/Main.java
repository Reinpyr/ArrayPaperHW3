//The purpose of this algorithm is to check that whether values inside the array are in increasing order.

public class Main {
    public static void main(String[] args) {
        boolean result = true;
        int n = 1;
        int values[] = {-3, 2, 5, 4, 7};

        while (result == true && n < 5) {
            if (values[n] < values[n - 1]) {
                result = false;
            }
            n = n + 1;
        }
        System.out.println(result);
    }
}