package Aula1;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exemplo3 {
    public static void main(String[] args) {
        try {
            abrirArquivo("Arquivo Beyoncé");
            abrirArquivo(null);
            abrirArquivo("");
        } catch (IllegalArgumentException |IOException e) {
            System.out.println("Erro  ao abrir o arquivo "+e.getMessage());
            
        }
    }

    public static void abrirArquivo(String caminho) throws IllegalArgumentException, IOException{
        if (caminho == null || caminho.isEmpty()) {
            throw new IllegalArgumentException("Caminho do arquivo não pode ser nulo ou vazio ");
            
        }

        File arquivo = new File(caminho);

        try(FileReader leitor = new FileReader(arquivo)){
                System.out.println("Arquivo aberto com sucesso!");
        }
    }
    
}
