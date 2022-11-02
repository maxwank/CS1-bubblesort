public class bubbleSort {

        public static void main(String[] args) {
            //create array   0  1    2  3  4  5  6   7   8   9
            int[] elements = {1, 661, 8, 2, 4, 1, 22, 66, 20, 122};
            //print the unsorted array
            clear();
            for (int i = 0; i <= 9; i++) {
                System.out.println();
                System.out.print(elements[i]+"|");
            }
        }

    public static void clear() {

        System.out.print("\033[H\033[2J");
    }
}
