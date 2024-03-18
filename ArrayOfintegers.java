public class ArrayOfintegers

{
    public class Main {
        public static void main(String[] args) {
            int[] arr = {1, 2, 1, 2, 1, 2};
            printTwos(arr);
        }


    }
    public static void printTwos(int[] arr) {
        for (int num : arr) {
            if (num == 2) {
                System.out.println(num);
            }
        }
    }



}
