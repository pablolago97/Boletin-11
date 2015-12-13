/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin11;

import javax.swing.JOptionPane;

/**
 *
 * @author Pablo
 */
public class Boletin11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        long start, finish;
        
        JOptionPane.showMessageDialog(null, "Escribe esta frase:");
        start = System.currentTimeMillis();
        JOptionPane.showInputDialog("\nA documentación é todo aquel conxunto de manuais impresos ou en formato dixital que explique unha aplicación informática ");
        finish = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "PREME ENTER PARA REMATAR");
        JOptionPane.showMessageDialog(null, "Tardaste"+" "+(finish - start) / 1000 +" "+"SEGUNDOS EN ESCRIBIR A FRASE");
    }
}
   
    

