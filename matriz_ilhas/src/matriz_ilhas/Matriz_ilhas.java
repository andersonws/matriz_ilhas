/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz_ilhas;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Maicon Moretto
 */
public class Matriz_ilhas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        String nome = "C:/Users/Maicon Moretto/Documents/NetBeansProjects/matriz_ilhas/files/example_4(1).txt";

        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);
            String linha = lerArq.readLine(); // lê a primeira linha
            System.out.printf("Matriz esparsa...\n\n Matriz original\n");
            int contadorIlha = 0;
            //lista todas  linhas
            while (linha != null) {
                System.out.printf("%s\n", linha);
                //busca  caracter por caracter
                char anterior = 0;
                int r;
                while ((r = lerArq.read()) != -1) {
                    char ch = (char) r;
                    char atual = (char) r;
                    if (atual == anterior) {
                        if ((int) atual != 48) {
                            contadorIlha++;
                        }
                    }
                    anterior = atual;
                }
                System.out.printf("%s\n", linha);
                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            System.out.println("\nNumero de  Ilha(s) :" + contadorIlha);
            arq.close();
        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n",
                    e.getMessage());
        }
        System.out.println("nao gostou segue o link =========== http://stackoverflow.com/questions/8232826/why-doesnt-my-compare-work-between-char-and-int-in-java   ======");
        System.out.println();
    }
}
