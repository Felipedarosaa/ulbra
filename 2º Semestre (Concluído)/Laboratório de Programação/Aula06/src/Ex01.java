import java.util.Scanner;
public class Ex01 {
    public static void main(String[] args) {

//        1. Criar um vetor A com 5 elementos inteiros. Construir um vetor B de mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou seja, B[i] = A[i].

        Scanner scan = new Scanner(System.in);
        int[] vetorA = new int[5];
        int[] vetorB = new int[vetorA.length];

        for (int i = 0; i< vetorA.length; i++){
            System.out.printf("Entre com um valor na posicao: " + i + "\n");
            vetorA[i] = scan.nextInt();
            vetorB[i] = vetorA[i];
        }
        for (int i=0; i<vetorA.length; i++){
            vetorB[i] = vetorA[i];
        }
        System.out.printf("Vetor A = ");
        for (int i=0; i<vetorA.length; i++){
            System.out.printf(vetorA[i] + " ");
        }
        System.out.printf("\n -------------- \n");
        System.out.printf("Vetor B = ");
        for (int i=0; i<vetorB.length; i++){
            System.out.printf(vetorB[i] + " ");
        }
    }
}