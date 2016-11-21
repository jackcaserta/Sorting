//Jack Caserta
//CSI 213
//Magnus
//H5.1 Sorting
//BubbleSortProgram
 
public class BubbleSort {
 
        public static void main(String[] args) {
               
                //create the array that will be sorted
                int intArray[] = new int[]{5,90,35,45,150,3};
               
                //the array will print prior to being sorted
                System.out.println("Array Prior To Bubble Sort");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
                }
               
                //the array is sorted after bublle sort algorithm
                bubbleSort(intArray);
               
                System.out.println("");
               
                //print the array post bubble sort algorithm
                System.out.println("Array Post Bubble Sort");
                for(int i=0; i < intArray.length; i++){
                        System.out.print(intArray[i] + " ");
                }
 
        }
 
        private static void bubbleSort(int[] intArray) {
               
               
                int n = intArray.length;
                int temp = 0;
               
                for(int i=0; i < n; i++){
                        for(int j=1; j < (n-i); j++){
                               
                                if(intArray[j-1] > intArray[j]){
                                        
                                        temp = intArray[j-1];
                                        intArray[j-1] = intArray[j];
                                        intArray[j] = temp;
                                }
                               
                        }
                }
       
        }
}
 
