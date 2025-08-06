/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.ifelse;
/**Matheus Sampaio Moreira 06/08/2025 atividade de TPA sobre IF e ELSE
 *
 * @author FATEC ZONA LESTE
 */


import javax.swing.JOptionPane;

public class AlturaParque {

  
    public static void main(String[] args) {
       String input = JOptionPane.showInputDialog("Digite sua altura"); // Pede a altura da pessoa
        double altura = Double.parseDouble(input);
        
        //Verifica a altura 
        if (altura >1.39) { 
            JOptionPane.showMessageDialog(null, "Aceito!");
        } else { 
            JOptionPane.showMessageDialog(null, "Não foi aceito no parque");
        }
        
       //O algoritmo verifica a altura e toma a decisão
       
    }
    
}
