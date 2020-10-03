import java.util.Arrays;
import java.util.Scanner;

// k n


 // public static void main(String[] args) {
    //     Scanner s = new Scanner(System.in);

    //     int N = s.nextInt();
    //     int K = s.nextInt();

    //     int arr[] = new int[N];

    //     for (int i = 0; i < N; i++) {
    //         arr[i] = s.nextInt();
    //     }

    //     for (int i = 0; i < K; i++) {
    //     System.out.println(merge(arr, s.nextInt()));
    //     }

    //     System.out.println(Arrays.toString(arr));
    // }

    // https://informatics.mccme.ru/mod/statements/view3.php?id=33364&chapterid=111912#1
    // [3,5,6]
    // [1,2,3,7]
    public class Main {

        public static int[] merge(int[] array1, int[] array2) {
            int newArray[] = new int[array1.length + array2.length];

            int array1Index = 0;
            int array2Index = 0;

            for (int k = 0; k < newArray.length; k++) {
                if (k > array1.length - 1) {
                    int a = array2[array2Index];
                    newArray[k] = a;
                    array2Index++;
                } else if (array2Index > array2.length - 1) {
                    int a = array1[array1Index];
                    newArray[k] = a;
                    array1Index++;
                } else if (array1[array1Index] < array2[array2Index]) {
                    int a = array1[array1Index];
                    newArray[k] = a;
                    array1Index++;
                } else {
                    int b = array2[array2Index];
                    newArray[k] = b;
                    array2Index++;
                }
            }
            return newArray;
        }

        public static void main(String[] args) {
            int[] array1 = { 1, 2 };
            int[] array2 = { 6, 7 };
    
            int[] rezult = merge(array1, array2);
            System.out.println(Arrays.toString(rezult));
        }

    };

