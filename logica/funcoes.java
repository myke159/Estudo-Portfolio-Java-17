// ============================================================
// Declaração do pacote ao qual esta classe pertence.
// Pacotes são usados para organizar classes relacionadas.
// Neste caso, estamos no pacote "Funcoes_Métodos_10".
package logica;

// ============================================================
// Início da definição da classe pública chamada "funcoes".
// Classes em Java são estruturas que agrupam métodos e atributos.
// Esta classe será usada para demonstrar exemplos de funções.
public class funcoes {

    // ==================================================================
    // EXEMPLO 1 - Função que imprime uma linha de separação visual.
    // ------------------------------------------------------------------
    // A função é pública (public), não retorna valor (void),
    //		 e é estática (static), ou seja, pode ser chamada diretamente
    // 		 sem criar um objeto da classe.
    public static void linhaSeparadora() {

        // Exibe no console uma linha composta de sinais de igual (=),
        // que serve para separar visualmente blocos de saída.
        System.out.println("======================================");

    }

    // ==================================================================
    // EXEMPLO 2 - Função que repete uma mensagem várias vezes.
    // ------------------------------------------------------------------
    // Esta função é pública, estática e sem retorno (void).
    // Recebe dois parâmetros:
    // - "mensagem": texto que será exibido.
    // - "vezes": número de vezes que a mensagem será repetida.
    public static void repetirMensagem(String mensagem, int vezes) {

        // Estrutura de repetição "for" que controla o número de vezes
        // que a mensagem será exibida no console.
        // A variável "i" começa em 0 e vai até (vezes - 1).
        for (int i = 0; i < vezes; i++) {

            // Exibe a mensagem passada como argumento.
            System.out.println(mensagem);

        }
    }

    // ==================================================================
    // EXEMPLO 3 - Função que retorna o valor absoluto de um número.
    // ------------------------------------------------------------------
    // Função pública, estática, que recebe um número inteiro
    // e retorna outro número inteiro.
    public static int valorAbsoluto(int numero) {

        // Verifica se o número recebido é menor que zero (negativo).
        if (numero < 0) {

            // Retorna o número multiplicado por -1 (tornando-o positivo).
            return -numero;

        }

        // Caso o número seja zero ou positivo, retorna ele mesmo.
        return numero;

    }

    // ==================================================================
    // EXEMPLO 4 - Função que verifica se um número é múltiplo de outro.
    // ------------------------------------------------------------------
    // Recebe dois inteiros (a e b) e retorna um valor booleano (true/false).
    public static boolean ehMultiplo(int a, int b) {

        // Utiliza o operador módulo (%) para verificar se o resto da
        // divisão de "a" por "b" é igual a zero.
        // Se for, retorna true; caso contrário, false.
        return a % b == 0;

    }

    // ==================================================================
    // EXEMPLO 5 - Função que retorna a primeira letra de um nome.
    // ------------------------------------------------------------------
    // Recebe uma string (nome) como argumento e retorna um caractere (char).
    public static char primeiraLetra(String nome) {

        // Usa o método charAt(0) para acessar o primeiro caractere
        // da string passada como parâmetro.
        return nome.charAt(0);

    }

    // ========================================================
    // EXEMPLO 1 - Função sem parâmetros e sem retorno.
    // --------------------------------------------------------
    // Declaração do método "mensagemBoasVindas".
    // Palavra-chave "public" → visível em todo o projeto.
    // Palavra-chave "static" → pode ser chamada sem criar objeto.
    // Tipo "void" → não retorna nenhum valor.
    public static void mensagemBoasVindas() {

        // Exibe uma mensagem fixa de boas-vindas no console.
        System.out.println("Bem-vindo ao mundo das funções em Java!");

    }

    // ========================================================
    // EXEMPLO 2 - Função com parâmetro e sem retorno.
    // --------------------------------------------------------
    // Declaração do método "saudar", que recebe um argumento do tipo String.
    // O nome fornecido será usado para personalizar a saudação.
    public static void saudar(String nome) {

        // Exibe uma saudação personalizada, utilizando o valor do parâmetro "nome".
        System.out.println("Olá, " + nome + "! É um prazer te ver aqui!");

    }

    // ========================================================
    // EXEMPLO 3 - Função com parâmetros e com retorno.
    // --------------------------------------------------------
    // Declaração do método "somar", que recebe dois inteiros como parâmetros.
    // O método retorna a soma desses dois números.
    public static int somar(int a, int b) {

        // Retorna o resultado da soma de "a" com "b".
        return a + b;

    }

    // ========================================================
    // EXEMPLO 4 - Função que verifica se um número é par.
    // --------------------------------------------------------
    // Declaração do método "ehPar", que recebe um inteiro.
    // O retorno será booleano (true ou false).
    public static boolean ehPar(int numero) {

        // Verifica se o número é divisível por 2 (resto igual a 0).
        // Se for, retorna true (número par), senão retorna false.
        return numero % 2 == 0;

    }

    // ========================================================
    // EXEMPLO 5 - Função que calcula o quadrado de um número.
    // --------------------------------------------------------
    // Declaração do método "quadrado", que recebe um inteiro como argumento.
    // Retorna o valor multiplicado por ele mesmo.
    public static int quadrado(int numero) {

        // Retorna o número elevado ao quadrado (numero * numero).
        return numero * numero;

    }

    // ========================================================
    // Método principal da aplicação Java.
    // --------------------------------------------------------
    // É o ponto de entrada da execução do programa.
    // A execução começa automaticamente por este método.
    public static void main(String[] args) {

        // ====================================================
        // Chamada da função do Exemplo 1 (sem parâmetros/retorno).
        // A função apenas exibe uma mensagem de boas-vindas.
        mensagemBoasVindas();

        // Exibe um separador no console para organizar a saída.
        System.out.println("\n----------------------------------------\n");

        // ====================================================
        // Chamada da função do Exemplo 2 (com parâmetro, sem retorno).
        // Passa o valor "Clevison" como argumento para o parâmetro "nome".
        saudar("Clevison");

        // Exibe um separador no console para organizar a saída.
        System.out.println("\n----------------------------------------\n");

        // ====================================================
        // Chamada da função do Exemplo 3 (com parâmetros e com retorno).
        // Passa os valores 10 e 5, armazena o resultado na variável "resultadoSoma".
        int resultadoSoma = somar(10, 5);

        // Exibe o resultado da soma no console.
        System.out.println("A soma de 10 + 5 é: " + resultadoSoma);

        // Exibe um separador no console para organizar a saída.
        System.out.println("\n----------------------------------------\n");

        // ====================================================
        // Chamada da função do Exemplo 4 (verifica se número é par).
        // Define o número 8 para testar a função.
        int numeroTeste = 8;

        // Armazena o resultado do teste de paridade na variável "resultadoPar".
        boolean resultadoPar = ehPar(numeroTeste);

        // Exibe a verificação de paridade no console.
        System.out.println("O número " + numeroTeste + " é par? " + resultadoPar);

        // Exibe um separador no console para organizar a saída.
        System.out.println("\n----------------------------------------\n");

        // ====================================================
        // Chamada da função do Exemplo 5 (calcula o quadrado de um número).
        // Define o número 6 para calcular seu quadrado.
        int numeroQuadrado = 6;

        // Armazena o resultado do quadrado na variável "resultadoQuadrado".
        int resultadoQuadrado = quadrado(numeroQuadrado);

        // Exibe o valor do quadrado calculado.
        System.out.println("O quadrado de " + numeroQuadrado + " é: " + resultadoQuadrado);

    }
}