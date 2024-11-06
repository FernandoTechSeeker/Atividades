package Aula1;

public class ExemploLancamentoExcecao{

    public static void main(String[] args) {
        try {
            
        } catch (Exception e) {
            
        }
    }

    public static void realizarDivisao(int numerador, int denominador) {
        if (denominador == 0) {
            throw new ArithmeticException("Divisão por zero não é permitida.");
        }
        int resultado = numerador / denominador;
        System.out.println("Resultado da divisão: "+resultado);
        
    }
    
}