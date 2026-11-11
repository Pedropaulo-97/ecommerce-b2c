package br.com.pedro.ecommerce.experimentos;


public class ExperimentoTipos {
    public static void main(String[] args) {

        Long id = null;  // IDs são vazios e recebem valores quando criados no Banco de Dados.
        String codigo = "SKU97979797";  // A escolha de String será por iniciar com identificador SKU e quando for numeros evita perder zeros a esquerda.
        String nome = "Nike Air Jordan 1"; // String por se referir a texto, como nome do produto.
        String descricao = "Inspirado no original que estreou em 1985, o Air Jordan 1 Low oferece um visual clássico e limpo, mas sempre atual"; // Da mesma forma de nome, carrega valores de textos.
        String tamanho = "40.5"; // Tamanhos de produtos podem ser 40.5 para calçados e "M" ou "GG" para roupas, ou seja rótulos e não medidas para calcular.
        int estoqueInicial = 50; // Para controle de estoque o int atende pois leva valores inteiros.
        int unidadesVendidas = 20; // Int para controle de quantidade de vendas em inteiros.
        double precoUnitario = 999.99; // O double por enquanto vai ser a escolha para numeros decimais. Depois vem o padrão do mercado com BigDecimal.
        boolean ativo = true; // O boolean sera utilizado pois carregam valores verdadeiro ou falso para controlar se produtos estão ativo ou não.
        Double notaMedia = null; // Double com D maiusculo para receber nota vazia por ainda não ter avaliação.


        System.out.println("Nome: " + nome + " | " + "Codigo: " + codigo + " | " + "Tamanho: " + tamanho + " | " + "ativo: " + ativo);

        double resultadoPasso3 = (estoqueInicial - unidadesVendidas) * precoUnitario;
        double resultadoComErroPasso4 = unidadesVendidas / estoqueInicial * 100;
        double resultadoSemErroPasso4 = (double) unidadesVendidas / estoqueInicial * 100;
        double resultadoPasso5 = 0.1 + 0.2; // Double para preço é um problema pois gera resultado binarios, e dinheiro opera com resultado decimais reais.

        // Aqui o Java acusa um erro que não é possivel mostrar um valor pois notaMedia é vazio.
        // double nota = notaMedia;
        // System.out.println("Nota: " + nota);

        System.out.println();
        System.out.println("Resultado Passo 3: " + resultadoPasso3);
        System.out.println("Resultado Com Erro Passo 4: " + resultadoComErroPasso4);
        System.out.println("Resultado Sem Erro Passo 4: " + resultadoSemErroPasso4);
        System.out.println("Resultado Passo 5: " + resultadoPasso5);
    }
}