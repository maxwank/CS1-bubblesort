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
            System.out.println();
            for (int i=0; i<=8; i++){
                for (int j=0; j<=8; j++){
                    if (elements[j]>elements[j+1]){
                        int temp=elements[j];
                        elements[j]=elements[j+1];
                        elements[j+1]=temp;
                    }
                }
                for (int l = 0; l <= 9; l++) {
                    System.out.println();
                    System.out.print(elements[i]+"|");
                }
                System.out.println();
                wait(100);
            }
            wait(1000);
            clear();
            System.out.print("Done!");
            for (int i = 0; i <= 9; i++) {
                System.out.println();
                System.out.print(elements[i]+"|");
            }
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
