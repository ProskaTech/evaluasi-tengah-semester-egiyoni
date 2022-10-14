package com.mycompany.uts_egi;
import java.util.Scanner;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class UTS_2 {
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
         
        System.out.print("Masukan Jumlah baris :");
        int n = in.nextInt();
         
        for (int i = 1; i <=n; i++){
            for (int j = 1; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <=n; k++)
            {
                System.out.print(" #");
            }
                System.out.println(" ");
        }
        
        for (int i = n; i >=1; i--){
            for (int j = 1; j <i; j++)
            {
                System.out.print(" ");
            }
            for (int k = i; k <=n; k++)
            {
                System.out.print(" *");
            }
                System.out.println(" ");
        }
    }
    
}
