import java.util.Arrays;
import java.util.Scanner;

import jdk.internal.org.jline.terminal.impl.jna.win.Kernel32.FOCUS_EVENT_RECORD;

// 5 5
// 1 3 5 7 9 - N
// 2 4 8 1 6 - K

//1
//3
//7
//1
//5

// k n

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int N = s.nextInt();
        int K = s.nextInt();

        int arr[] = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = s.nextInt();
        }

        // for (int i = 0; i < K; i++) {
        //     System.out.println(binarySearch(arr, s.nextInt()));
        // }

        // System.out.println(Arrays.toString(arr));
    }


    //5 1
    //1 3 5 7 9 
    //2 
// https://www.ideserve.co.in/learn/img/merge-linked-lists-example.gif
// https://www.codesdope.com/staticroot/images/algorithm/merge.gif

    // public static int sort(int[] arr) {

    // }

    // https://informatics.mccme.ru/mod/statements/view3.php?id=33364&chapterid=111912#1
        // [3,5,6]
        // [1,2,3,7]
    public static int[] merge(int[] array1, int[] array2) {
        int newArray[] = new int[array1.length + array2.length];

        int array1Index = 0;
        int array2Index = 0;
        
        for(int i = 0; i < array1.length; i++) {
            if(array1[array1Index] >= array2[array2Index]) {
                
            }
          
        }
        
    }

}



// int left = 0; //0
// int right = arr.length; //5 // 2

// while (left < right) {
//     int middle = (left + right) / 2; //1
//          // 5           // 2
//     if (arr[middle] == x) {
//         return arr[middle];
//                  // 1 < 2
//     } else if (arr[middle] < x) {
//         left = middle + 1;
//         // 5 > 2
//     } else if (arr[middle] > x) {
//                 // 2
//         right = middle;
//     }

// }

// int b = arr[left-1] - x;
// if(0 >= b) {
//     return arr[left-1];
// } else {
//     return arr[left];
// }
// }