// ==================================================================================================
// Declara o pacote "logica". Pacotes ajudam a organizar o
//			código em módulos, evitando conflito de nomes.
// ==================================================================================================
package logica;

// ==================================================================================================
// Importa a classe HashMap, que é a implementação mais 
//			comum da interface Map em Java.
// - Estrutura interna: tabela hash (HashTable).
// - Características:
//   • Permite chaves e valores nulos (no máximo uma chave nula).
//   • NÃO garante ordem de inserção nem ordenação (ordem "aparente" pode mudar).
//   • Operações básicas (put, get, remove, containsKey) têm custo médio O(1).
// ==================================================================================================
import java.util.HashMap;

// ==================================================================================================
// Importa a interface Map. Ela define o "contrato" que toda
//			implementação de Map deve seguir.
// Um Map é uma coleção de pares (chave → valor), onde cada chave é 
//			única e mapeia exatamente um valor.
// ==================================================================================================
import java.util.Map;

// ==================================================================================================
// Declaração da classe pública ExemploMap. 
// O nome do arquivo deve ser ExemploMap.java.
// ==================================================================================================
public class Mapa {

    // ============================================================
    // Método principal "main", ponto de entrada da aplicação Java.
    // Todo programa Java começa a execução por este método.
    // "public" → significa que qualquer outra classe pode acessar esse método.
    // "static" → permite que o método seja executado sem instanciar a classe.
    // "void" → indica que o método não retorna nenhum valor.
    // "String[] args" → parâmetro que pode receber argumentos via
    //			linha de comando (não usado aqui).
    public static void main(String[] args) {

        // ==========================================================================================
        // 1 - Criar um Map
        // ------------------------------------------------------------------------------------------
        // Aqui declaramos e instanciamos um Map chamado "produtos".
        // Detalhes importantes:
        // - Usamos a interface Map<K, V>, onde K = tipo da chave, V = tipo do valor.
        // - Definimos a chave como Integer (vai representar o ID do produto).
        // - Definimos o valor como String (vai representar o nome do produto).
        // - Instanciamos com HashMap, a implementação mais comum e eficiente em média.
        //
        // SOBRE HashMap:
        // • Estrutura interna: tabela hash (usa hashCode() das chaves).
        // • Permite uma chave null e múltiplos valores null.
        // • Não mantém ordem de inserção nem ordenação natural.
        // • Operações get/put/remove.
        //
        // Estado inicial do Map: vazio.
        // ==========================================================================================
        Map<Integer, String> produtos = new HashMap<>();

        // ==========================================================================================
        // 2 - Adicionar elementos (put)
        // ------------------------------------------------------------------------------------------
        // Usamos o método put(chave, valor).
        // Regras de comportamento:
        // • Se a chave não existir, o par (chave → valor) é adicionado normalmente.
        // • Se a chave já existir, o valor antigo é substituído pelo novo.
        // • As chaves devem ser únicas, mas os valores podem se repetir.
        // ==========================================================================================
        produtos.put(1, "Teclado");   // adiciona o par (1 → "Teclado")
        produtos.put(2, "Mouse");     // adiciona o par (2 → "Mouse")
        produtos.put(3, "Monitor");   // adiciona o par (3 → "Monitor")
        produtos.put(4, "Impressora");// adiciona o par (4 → "Impressora")

        // ==========================================================================================
        // Exibe todos os produtos cadastrados.
        // Quando passamos um Map para System.out.println, ele
        //			chama toString() internamente.
        // O toString() de um HashMap mostra os pares no formato {chave=valor, chave=valor}.
        // IMPORTANTE: a ordem não é garantida (pode parecer "aleatória").
        // ==========================================================================================
        System.out.println("Produtos: " + produtos);

        // ==========================================================================================
        // 3 - Acessar um valor usando a chave.
        // ------------------------------------------------------------------------------------------
        // O método get(chave):
        // • Retorna o valor associado àquela chave.
        // • Se a chave não existir, retorna null.
        // ==========================================================================================
        String produto = produtos.get(2); // Aqui, deve retornar "Mouse" pois a chave 2 foi adicionada.
        System.out.println("Produto com ID 2: " + produto);

        // ==========================================================================================
        // 4 - Verificar se uma chave existe.
        // ------------------------------------------------------------------------------------------
        // O método containsKey(chave):
        // • Retorna true se a chave existir no Map.
        // • Retorna false caso contrário.
        // ==========================================================================================
        if (produtos.containsKey(3)) {
            System.out.println("O ID 3 existe no Map.");
        }

        // ==========================================================================================
        // 5 - Verificar se um valor existe.
        // ------------------------------------------------------------------------------------------
        // O método containsValue(valor):
        // • Verifica se ALGUMA chave está associada a este valor.
        // • Ao contrário de containsKey(), esta operação precisa percorrer todos os pares.
        // ==========================================================================================
        if (produtos.containsValue("Monitor")) {
            System.out.println("O produto 'Monitor' está cadastrado.");
        }

        // ==========================================================================================
        // 6 - Atualizar valor de uma chave existente.
        // ------------------------------------------------------------------------------------------
        // Basta chamar put() novamente com a mesma chave.
        // O valor antigo será sobrescrito pelo novo.
        // ==========================================================================================
        // Atualiza chave 4: antes era "Impressora", agora é "Impressora a Laser".
        produtos.put(4, "Impressora a Laser");
        System.out.println("Após atualização: " + produtos);

        // ==========================================================================================
        // 7 - Remover elemento pela chave.
        // ------------------------------------------------------------------------------------------
        // O método remove(chave):
        // • Remove o par chave → valor se a chave existir.
        // • Retorna o valor removido ou null se a chave não existir.
        // ==========================================================================================
        produtos.remove(1); // Remove o produto com ID 1 ("Teclado").
        System.out.println("Após remover ID 1: " + produtos);

        // ==========================================================================================
        // 8 - Percorrer todas as chaves e valores.
        // ------------------------------------------------------------------------------------------
        // O método entrySet() retorna um Set de objetos Map.Entry<K, V>.
        // Cada Map.Entry representa um par chave → valor.
        // Métodos principais de Map.Entry:
        //   • getKey()   → retorna a chave do par.
        //   • getValue() → retorna o valor associado.
        // Isso permite iterar sobre todos os pares armazenados no Map.
        // ==========================================================================================

        // ------------------------------------------------------------------------------------------
        // Imprime um título para indicar o início da listagem completa dos produtos.
        // "\n" força uma quebra de linha antes da mensagem, melhorando a formatação.
        // ------------------------------------------------------------------------------------------
        System.out.println("\nLista de produtos:");

        // ------------------------------------------------------------------------------------------
        // Laço for-each para percorrer todos os pares do Map.
        // A expressão produtos.entrySet() retorna um Set contendo todos os pares.
        // Cada elemento do Set é do tipo Map.Entry<Integer,
        //			String>, ou seja, um par formado por: chave (Integer) → valor (String).
        // A variável "entry" assumirá cada par durante a iteração.
        // ------------------------------------------------------------------------------------------
        for (Map.Entry<Integer, String> entry : produtos.entrySet()) {

            // --------------------------------------------------------------------------------------
            // Para cada Map.Entry "entry", usamos:
            // • entry.getKey()   → retorna a chave (ID do produto, tipo Integer).
            // • entry.getValue() → retorna o valor (nome do produto, tipo String).
            // Aqui concatenamos no println para exibir no formato:
            // "ID: <chave> → Produto: <valor>"
            // --------------------------------------------------------------------------------------
            System.out.println("ID: " + entry.getKey() + " → Produto: " + entry.getValue());

        }

        // ==========================================================================================
        // 9 - Apenas chaves.
        // ------------------------------------------------------------------------------------------
        // O método keySet() retorna um Set<K> contendo TODAS as
        //			chaves armazenadas no Map.
        // No caso, retorna um Set<Integer> com todos os IDs de produtos cadastrados.
        // Como é um HashMap, a ordem não é garantida (pode parecer aleatória).
        // ==========================================================================================

        // ------------------------------------------------------------------------------------------
        // Imprime todas as chaves do Map. O método toString() do Set
        //			mostra no formato: [chave1, chave2...]
        // ------------------------------------------------------------------------------------------
        System.out.println("Chaves: " + produtos.keySet());

        // ==========================================================================================
        // 10 - Apenas valores.
        // ------------------------------------------------------------------------------------------
        // O método values() retorna uma Collection<V> contendo todos os
        //			valores armazenados no Map.
        // Aqui será uma Collection<String> (nomes dos produtos).
        // Diferente das chaves (que são únicas), os valores podem se repetir.
        // A ordem também não é garantida em HashMap.
        // ==========================================================================================

        // ------------------------------------------------------------------------------------------
        // Imprime todos os valores (nomes de produtos). O formato será: [valor1, valor2...]
        // ------------------------------------------------------------------------------------------
        System.out.println("Valores: " + produtos.values());

        // ==========================================================================================
        // 11 - Limpar o Map.
        // ------------------------------------------------------------------------------------------
        // O método clear() remove absolutamente TODOS os pares chave → valor do Map.
        // Após a execução:
        //   • produtos.size() será 0.
        //   • produtos.isEmpty() retornará true.
        // O objeto Map continua existindo, apenas fica vazio.
        // ==========================================================================================

        // ------------------------------------------------------------------------------------------
        // Chama clear() para apagar todos os pares armazenados no Map "produtos".
        // ------------------------------------------------------------------------------------------
        produtos.clear();

        // ------------------------------------------------------------------------------------------
        // Imprime o estado do Map após a limpeza.
        // O HashMap vazio será exibido como "{}" pelo método toString().
        // ------------------------------------------------------------------------------------------
        System.out.println("Após limpar: " + produtos); // Saída esperada: {}


    } // <<< fim do main
} // <<< fim da classe ExemploMap