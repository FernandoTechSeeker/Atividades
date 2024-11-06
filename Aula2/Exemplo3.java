package Aula2;

import java.util.Scanner;

public class Exemplo3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Digite o tamanho do array: ");
            int tamanhoArray = scanner.nextInt();

            int[] array = new int[tamanhoArray];
            preencherArray(array);

            System.out.println("Digite o indice que deseja consultar: ");
            int indice = scanner.nextInt();

            int valor = acessarArray(array, indice);
            System.out.println("Valor no indice: "+indice+": "+valor);
        } catch (ArrayIndexOutOfBoundsException e) {
           System.out.println("Erro: Indice inválido: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Ocorreu um erro inesperado!");
            if (e.getMessage() != null) {
                System.out.println("Erro: "+e.getMessage());
            }
        } finally {
            scanner.close();
        }
    }
    
    public static void preencherArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = i *2;
        }
    }
    public static int acessarArray(int[] array, int indice){
        return array[indice];
    }
    
}
