public class bubbleSort {

        public static void main(String[] args) {
            //create array   0  1    2  3  4  5  6   7   8
            int[] elements = {1, 661, 8, 2, 4556, 4, 22, 66, 20, 122, 65, 1224, 234, 123, 436};
            //print the unsorted array
            clear();
            System.out.println("Entered Values:");
            for (int i = 0; i <= 14; i++) {
                System.out.print(elements[i] + "|");
            }
            wait(1000);
            System.out.println();
            System.out.println("Sorting...");
            wait(1000);
            System.out.println();
            for (int i = 0; i <= 14; i ++ ) {
                for (int j = 0; j <= 13; j++ ) {
                    if (elements[j] > elements[j + 1]) {
                        int temp = elements[j];
                        elements[j] = elements[j + 1];
                        elements[j + 1] = temp;
                    }
                }
                for (int k = 0; k <= 14; k++ ) {
                    System.out.print(elements[k] + "|");
                }
                System.out.println();
                wait(1000);
            }
            clear();
            System.out.println("Done!");
            wait(500);
            for (int j = 0; j <= 14; j ++ ) {
                System.out.print(elements[j]+"|");
            }
            wait(1000);
            clear();
            wait(400);
        }

    public static void clear() {

        System.out.print("\033[H\033[2J");
    }
    public static void wait(int ms) {
        try
        {
            Thread.sleep(ms);
        }
        catch(InterruptedException ex)
        {
            Thread.currentThread().interrupt();
        }
    }
}
