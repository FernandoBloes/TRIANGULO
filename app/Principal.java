package app;

import utilidades.FuncoesGerais;

public class Principal {

    public static void main(String[] args) {
        // Criação de uma instância da classe FuncoesGerais
        FuncoesGerais util = new FuncoesGerais();

        // Utilizando o método de adição
        int somaResultado = util.adicionar(5, 7);
        System.out.println("Resultado da adição: " + somaResultado);

        // Utilizando o método para desenhar um triângulo
        System.out.println("Triângulo com altura 5:");
        util.desenharTriangulo(5);

        // Utilizando o método para exibir o conteúdo de um arquivo
        System.out.println("Conteúdo do arquivo:");
        util.exibirArquivo("caminho/para/seu/arquivo.txt");
    }
}
