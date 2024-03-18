public class Main {
    public static void main(String[] args) {

        int arr [] = {1,2,1,2,1,2,1,2,};
        int num [] = {2,2,2,2,2,2,};
        int number[] = {1,2,3,4,5,};
        printTwos(arr);
        printOnlytwos(num);
        int summ = sumOfArrays(number);
        System.out.println("calculate the sum of the array "+ summ);



        //System.out.println("Hello world!");
    }

    public static void printTwos( int [] arr){

        for ( int num : arr){
             if (  num == 2){
                 System.out.println("please print the values of twos "+ num);
            }
        }
    }

    public static void printOnlytwos( int [] num){

        for( int i = 0; i < num.length; i++){
            if( i ==2){
                System.out.println(num[i]);
            }

        }
    }
// Create a method that takes an array of integers and returns the sum of all numbers.
    public static int sumOfArrays( int[] number){

        int summ = 0;

        for ( int num: number){

            summ=+ num;
        }

        return summ;

    }
}