/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ifelse;

/**Matheus Sampaio Moreira 06/08/2025 atividade de TPA sobre IF e ELSE
 *
 * @author FATEC ZONA LESTE
 */


import javax.swing.JOptionPane;
import java.util.Random;


public class IfELSE {

    public static void main(String[] args) {
        String[] opcoes = {"Pedra", "Papel", "Tesoura"};
        
        // Escolha do jogador
        String escolhaJogador = (String) JOptionPane.showInputDialog(
                null,
                "Escolha uma opção:",
                "Pedra, Papel ou Tesoura",
                JOptionPane.PLAIN_MESSAGE,
                null,
                opcoes,
                "Pedra");

        // Geração da jogada aleatória do PC
        Random rand = new Random();
        String jogador2 = opcoes[rand.nextInt(3)];

        // Exibe a jogada do PC
        JOptionPane.showMessageDialog(null, "O jogador2 escolheu: " + jogador2);

        // Verifica o resultado
        if (escolhaJogador.equals(jogador2)) {
            JOptionPane.showMessageDialog(null, "Empate!");
        } else if ((escolhaJogador.equals("Pedra") && jogador2.equals("Tesoura")) ||
                   (escolhaJogador.equals("Papel") && jogador2.equals("Pedra")) ||
                   (escolhaJogador.equals("Tesoura") && jogador2.equals("Papel"))) {
            JOptionPane.showMessageDialog(null, "Você venceu!");
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu!");
        }
        // Estrutura if-else analisa todas as combinações possíveis
    
        
        
        
    }
}
