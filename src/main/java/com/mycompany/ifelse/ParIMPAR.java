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


public class ParIMPAR {
    public static void main(String[] args) {
       
        String input = JOptionPane.showInputDialog("Digite um número:"); //Pede um número pro usuário
        int numero = Integer.parseInt(input); //Converte para inteiro
        
        //Verifica se é par ou ímpar
        if (numero % 2 == 0) {
            JOptionPane.showMessageDialog(null, "O número é PAR.");
            } else {
            JOptionPane.showMessageDialog(null, "O número é ÍMPAR");
        }
        //%2 == 0 quer dizer que sobra 0 na divisão, ou seja, é par
        
        
    }
    
}
