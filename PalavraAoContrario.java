package ProjetosPessoais;

import java.util.Scanner;

public class PalavraAoContrario {

    public static void main(String[] args) {
                System.out.println("Escreva a palavra que você deseja ler ao contrário:");
                Scanner input = new Scanner(System.in);
                String palavra = input.next();

                char[] arrayPalavra = palavra.toCharArray();

                for(int i = arrayPalavra.length - 1; i > 0; i--) {
                    System.out.print(arrayPalavra[i]);
                }
            }
        }
