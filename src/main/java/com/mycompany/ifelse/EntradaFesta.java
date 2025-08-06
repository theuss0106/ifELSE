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



public class EntradaFesta {

    public static void main(String[] args) {
        
        String input = JOptionPane.showInputDialog("Quantos anos você tem?"); // Pede a idade
        int idade = Integer.parseInt(input);
        
        // Verifica se pode entrar na festa
        if (idade >= 18) {
            JOptionPane.showMessageDialog(null, "Pode entrar, seja bem-vindo à festa!");
           } else { 
            JOptionPane.showMessageDialog(null, "Entrada proibida para menores de idade.");
           }
        //Idade maior ou igual a 18 já libera a entrada
        
    }
    
}
