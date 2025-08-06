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

public class NotaDeAlunos {
    public static void main(String[] args) {
        
       String input = JOptionPane.showInputDialog("Digite sua nota(0 a 10):");
       double nota = Double.parseDouble(input); // Recebe a nota
       
       //Verifica a situação do aluno 
       if (nota >5) {
           JOptionPane.showMessageDialog(null, "Aprovado!"); 
       } else if (nota <=5) {
           JOptionPane.showMessageDialog(null, "Reprovado"); 
       }
       //A lógica usa as faixas de nota pra definir a situação
       
    }
    
}
