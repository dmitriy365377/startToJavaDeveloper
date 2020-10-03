import java.util.Arrays;
import java.util.Scanner;

// k n




    // https://informatics.mccme.ru/mod/statements/view3.php?id=33364&chapterid=111912#1
    // [3,5,6]
    // [1,2,3,7]
    public class Main {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
    
            int N = s.nextInt();
         
            int arr[] = new int[N];
    
            for (int i = 0; i < N; i++) {
                arr[i] = s.nextInt();
            }

            int K = s.nextInt();

            int arr2[] = new int[K];

            for (int j = 0; j < K; j++) {
                arr2[j] = s.nextInt();
            }
          
            int newArrFromFunction[] = merge(arr, arr2);

            for (int i = 0; i < newArrFromFunction.length; i++) {
                System.out.println(newArrFromFunction[i]);
            }
        }

        public static int[] merge(int[] array1, int[] array2) {
            int newArray[] = new int[array1.length + array2.length];

            int array1Index = 0;
            int array2Index = 0;
            //23
           

            int b = 0;
            while(array1Index < array1.length && array2Index < array2.length) {
                if(array2[array2Index] < array1[array1Index]) {
                    newArray[b] = array2[array2Index];
                    b++;
                    array2Index++;
                } else {
                    newArray[b] = array1[array1Index];
                    b++;
                    array1Index++;
                }
            }
            // 1 2 [2]
            // 1 1 1 1 1 1 5 [6]
            if(array1Index > array2Index) {
                
            } else {

            }
            return newArray;
            // for (int k = 0; k < newArray.length; k++) {
            //     if (k > array1.length - 1) { //3 
            //         int a = array2[array2Index];
            //         newArray[k] = a;
            //         array2Index++;
            //     } else if (array2Index > array2.length - 1) { 
            //         int a = array1[array1Index];
            //         newArray[k] = a;
            //         array1Index++;
            //     } else if (array1[array1Index] < array2[array2Index]) {
            //         int a = array1[array1Index];
            //         newArray[k] = a;
            //         array1Index++;
            //     } else {
            //         int b = array2[array2Index];
            //         newArray[k] = b;
            //         array2Index++;
            //     }
            // }
            
        }
    };

