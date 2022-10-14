package com.mycompany.uts_egi;
import javax.swing.JOptionPane;

/**
 *
 * @author 21343005_EGI YONI SANDRA
 */

public class UTS_3 {
    
    public static void main(String args[]){
        int bilangan;
        String z;
        
        z = JOptionPane.showInputDialog("Masukkan Angka : ");
        bilangan = Integer.parseInt(z);
        
        if(bilangan > 0){
            JOptionPane.showMessageDialog(null, "Angka " +bilangan+ " Merupakan Bernilai Positif");
        }
        else if(bilangan < 0){
            JOptionPane.showMessageDialog(null, "Angka " +bilangan+ " Merupakan Bernilai Negatif");
        }
        else{
            JOptionPane.showMessageDialog(null, "Angka " +bilangan+ " Merupakan Tidak Bernilai Positif / Negatif");
        }
    }
    
}
