package utilidades;

import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;

public class FuncoesGerais {

    // Método responsável por realizar a soma de dois inteiros
    public int adicionar(int num1, int num2) {
        return num1 + num2;
    }

    // Método que desenha a forma de um triângulo com base na altura fornecida
    public void desenharTriangulo(int altura) {
        for (int i = 1; i <= altura; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    // Método que exibe o conteúdo de um arquivo texto
    public void exibirArquivo(String caminhoDoArquivo) {
        try (BufferedReader leitor = new BufferedReader(new FileReader(caminhoDoArquivo))) {
            String linha;
            while ((linha = leitor.readLine()) != null) {
                System.out.println(linha);
            }
        } catch (IOException e) {
            System.out.println("Falha ao tentar ler o arquivo: " + e.getMessage());
        }
    }

    public int soma(int i, int j) {
        // TODO Auto-generated method stub (foi gerado este comentário após corrigir um
        // problema na parte do Int)
        throw new UnsupportedOperationException("Unimplemented method 'soma'");
    }

    public void printArquivo(String string) {
        // TODO Auto-generated method stub (foi gerado este comentário após corrigir um
        // problema na parte da String)
        throw new UnsupportedOperationException("Unimplemented method 'printArquivo'");
    }
}
