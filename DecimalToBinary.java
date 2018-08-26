/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PRACTICINGAGAIN;

/**
 *
 * @author CHUKWUDI
 */
import java.util.Scanner;
        
public class DecimalToBinary {
    
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         
         
         System.err.println("Input the decimal number you want to convert: ");
        int no = input.nextInt();
         
         if (no > 0){
             System.err.println("the binary equivalent of the decimal value " + no +" is ; ");
             convertToBinary(no);
         }
         
    }
    
    static void convertToBinary(int mainno){
    StringBuilder result  = new StringBuilder();
    
    int i = 0;
    
    while (mainno > 0){
    result.append(mainno%2);
    i++;
    
    mainno = mainno/2;
    
    }
        System.out.println(result.reverse());
    }
   
}
