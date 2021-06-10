
import java.util.InputMismatchException;
import java.util.Scanner;

public class Aula_Java {
    
    static int tamanhoX, tamanhoY, quantidadeDeNavios, limiteMaximoDeNavios;
    static int tabuleiroJogador1[][], tabuleiroJogador2[][];
    
public static void obtertTamanhoDosTabuleiros () {
        Scanner input = null;
        for (;;) {
            boolean tudoOK = false;
            try {
                input = new Scanner(System.in);
                System.out.println("Digite a altura do tabuleiro: ");
                tamanhoX = input.nextInt();
                System.out.println("Digite o comprimento do tabuleiro: ");
                tamanhoY = input.nextInt();
                tudoOK = true;
                } catch (InputMismatchException erro) {
                System.out.println("Digite um valor numérico");
                }
            if(tudoOK) {
                input.close();
                break;
            }
            }
}

public static void calcularQuantidadeMaximaDeNaviosNoJogo(){
    limiteMaximoDeNavios = (tamanhoX * tamanhoY) / 3;
    
}

public static void iniciandoOsTamanhosDosTabuleiros (){
    tabuleiroJogador1 = new int [tamanhoX][tamanhoY];
    tabuleiroJogador2 = new int [tamanhoX][tamanhoY];
    
}

public static void main(String[] args) {

        obtertTamanhoDosTabuleiros (); 
        calcularQuantidadeMaximaDeNaviosNoJogo();
        iniciandoOsTamanhosDosTabuleiros ();
        Scanner input = new Scanner(System.in);
        System.out.println("Digite a quantidade de navios do jogo:");
        System.out.println("Max: " + limiteMaximoDeNavios + "navio");
        quantidadeDeNavios = input.nextInt();
        
        
        
}   
}
