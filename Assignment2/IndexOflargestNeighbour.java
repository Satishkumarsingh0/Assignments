/*
4. Write a program to find index of number which is larger than its neighbour values
Input : 10 5 30 11
Output: 2
*/
import java.util.Scanner;
public class IndexOflargestNeighbour{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();

        int[] array = new int[size];
        System.out.print("Array Input: ");
        for(int i = 0; i<size; i++){
            array[i]=sc.nextInt();
        }

        int index = 0;
        for(int i=0; i<size-1; i++) {
            if(array[i] < array[i+1])
                index = i+1;
        }

        System.out.println("Index Output: "+ index);
        sc.close();
    }
}