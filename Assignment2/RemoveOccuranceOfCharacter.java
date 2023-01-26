/*
3. Write a program to remove occurrence of a particular character mentioned by user
Input: divija
i
ouput: dvja
*/
import java.util.Scanner;
public class RemoveOccuranceOfCharacter{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("String Input: ");
        String str = sc.nextLine();

        int size = str.length(); 

        System.out.print("character to remove: ");
        char ch = sc.next().charAt(0);  
        String finalString = "";
        for (int i = 0; i < size; i++) {
           if (str.charAt(i) != ch) {
              finalString += str.charAt(i);
           }
        }
        System.out.println("Output: " + finalString);
        sc.close();
    }
}