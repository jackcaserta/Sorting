//CompSci210
//H5.0 Sorting
//Jack Caserta
import java.util.Random;
import java.util.Arrays;

      class BubbleSort{
        public static void main(String [] args){
    Random g = new Random();

    int [] number = new int [10];

    System.out.print("Random Numbers:");
    for (int d = 0 ; d<number.length ; d++){
        int RandomG = g.nextInt(100)+1;
        System.out.print("\t" + RandomG);
        }

  System.out.print("\nSorted Numbers:"+Arrays.toString(BubbleSortAsceMethod(number)));

                     }
     public static int [] BubbleSortAsceMethod(int[] x){
    int temp;

    for(int i = 0 ; i < x.length-1 ; i++){
        for ( int j = 1 ; j < x.length-1 ; j++){
            if ( x[j-1] < x[j]){
                temp = x[j-1];
                x[j-1] = x[j];
                x[j] = temp;
            }

            }
                }
        return x;   
                }
                          }