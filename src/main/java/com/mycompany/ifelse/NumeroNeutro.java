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


public class NumeroNeutro {

    public static void main(String[] args) {
      
        String input = JOptionPane.showInputDialog("Digite um número"); //Pede um número ao usuário
        int numero = Integer.parseInt(input); // Converte para inteiro
        
        //Verifica se o número é neutro
        if (numero != 0) { 
            JOptionPane.showMessageDialog(null, "O número não é neutro");
        } else { 
            JOptionPane.showMessageDialog(null, "O número é neutro");
        }
        
        //O algoritmo verifica o número e decide se ele é neutro ou não
        
    }
    
}
