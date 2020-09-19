import java.util.Arrays;
import java.util.Scanner;

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

        for (int i = 0; i < K; i++) {
            System.out.println(binarySearch(arr, s.nextInt()) != -1 ? "YES" : "NO");
        }

        // System.out.println(Arrays.toString(arr));
    }


    //5 1
    //1 3 5 7 9 
    //2 

    public static int binarySearch(int[] arr, int x) {
        int left = 0; //0
        int right = arr.length; //5 // 2
      
        while (left < right) {
            int middle = (left + right) / 2; // 5/2 = 2  // 1
                 // 5           // 2
            if (arr[middle] == x) {
                return middle;
                         // 1 < 2
            } else if (arr[middle] < x) {
                left = middle + 1;
                // 5 > 2
            } else if (arr[middle] > x) {
                        // 2
                right = middle;
            }

        }

        if(arr[left] > arr[left - 1]) {
           System.out.println("closer " + arr[left - 1]);
        } else {
            System.out.println("closer " + arr[left]); 
        }

        System.out.println("left " + left);
        return -1;
    }

}

