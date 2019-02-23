package Main;

public class Q5 {
    public static void main(String args[]) {
        int i, j, k = 0;
        int[] arr = new int[]{1, 2, 3, 47, 8, 9, 10, 1, 0, 99};
        int[] arr1 = new int[]{7, 8, 9, 10, 1, 0, 99};
        int arr3[] = new int[10];
        for (i = 0; i < arr.length; i++) {
            for (j = 0; j < arr1.length; j++) {
                if (arr[i] == arr1[j]) {
                    arr3[k] = arr[i];

                    k++;
                }
            }


        }
        System.out.println("Common elemnts are:");
        for (i = 0; i < k; i++) {
            System.out.println(arr3[i]);
        }

    }

    }

