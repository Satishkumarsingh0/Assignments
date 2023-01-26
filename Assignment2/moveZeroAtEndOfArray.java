/*
1. Move all zero’s to end of array
Input : 1 2 0 3 0 4 0 0 6
Output : 1 2 3 4 6 0 0 0
 */
import java.util.Scanner;
public class moveZeroAtEndOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.print("Array Input: ");
        for(int i = 0; i<size; i++){
            array[i]=sc.nextInt();
        }

        int count = 0;
        for(int i = 0; i < size; i++) {
            if(array[i] != 0) {
                array[count++] = array[i];
            }
        }
        while(count < size) {
            array[count++] = 0;
        }

        System.out.print("Output: ");
        for(int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
        sc.close();
    }   
}
