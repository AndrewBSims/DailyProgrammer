import java.util.*;
import java.io.*;

public class IDGAF {
   public static void main(String[] args) {
      concatenate("17 32 91 7 46");
   }
   
   public static void concatenate(String input) {
      String[] numbers = input.split(" ");
      int[] numberList = new int[numbers.length];
      for (int i = 0; i < numbers.length; i++) {
         numberList[i] = Integer.parseInt(numbers[i]);
      }
      for (int j = 0; j < numberList.length - 1; j++) {
         if (!biggerFirst(numberList[j], numberList[j + 1])) {
            int num = numberList[j];
            numberList[j] = numberList[j + 1];
            numberList[j + 1] = num;
            if (j > 0) {
               j -= 2;
            }
         }
      }
      for (int m = numberList.length - 1; m >= 0; m--) {
         System.out.print(numberList[m]);
      }
      System.out.print(" ");
      for (int k = 0; k < numberList.length; k++) {
         System.out.print(numberList[k]);
      }
   }
   
   public static boolean biggerFirst(int n1, int n2) {
      return n2 + n1 * Math.pow(10, power(n2)) > n1 + n2 * Math.pow(10, power(n1));
   }
   
   public static int power(int n) {
      int power = 0;
      for (int i = 0; i < 1; i++) {
         if (n > 0) {
            n = n / 10;
            power++;
            i--;
         }
      }
      return power;
   }
}