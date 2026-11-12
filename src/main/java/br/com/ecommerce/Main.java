package br.com.ecommerce;

import br.com.ecommerce.model.Produto;

public class Main {
    public static void main(String[] args) {

        Produto produto1 = new Produto();
        produto1.codigo = "SKU97979797";
        produto1.nome = "Nike Air Jordan 1";
        produto1.descricao = "Inspirado no original que estreou em 1985, o Air Jordan 1 Low oferece um visual clássico e limpo, mas sempre atual";
        produto1.tamanho = "40.5";
        produto1.precoUnitario = 999.99;
        produto1.quantidadeEstoque = 30;
        produto1.ativo = true;


        Produto produto2 = new Produto();
        produto2.codigo = "SKU87878787";
        produto2.nome = "Adidas ADI2000";
        produto2.descricao = "Tênis de modelagem padrão com cabedal em couro maleável para conforto o dia todo.";
        produto2.tamanho = "39.0";
        produto2.precoUnitario = 799.99;
        produto2.quantidadeEstoque = 15;
        produto2.ativo = true;


        System.out.println(produto1.id);
        System.out.println("Código: " + produto1.codigo);
        System.out.println("Nome: " + produto1.nome);
        System.out.println("Descrição: " + produto1.descricao);
        System.out.println("Tamanho: " + produto1.tamanho);
        System.out.println("Preço: " + produto1.precoUnitario);
        System.out.println("Quantidade: " + produto1.quantidadeEstoque);
        System.out.println("Nota: " + produto1.notaMedia);
        System.out.println("Ativo: " + produto1.ativo);

        System.out.println("-----------------------------------------");

        System.out.println(produto2.id);
        System.out.println("Código: " + produto2.codigo);
        System.out.println("Nome: " + produto2.nome);
        System.out.println("Descrição: " + produto2.descricao);
        System.out.println("Tamanho: " + produto2.tamanho);
        System.out.println("Preço: " + produto2.precoUnitario);
        System.out.println("Quantidade: " + produto2.quantidadeEstoque);
        System.out.println("Nota: " + produto2.notaMedia);
        System.out.println("Ativo: " + produto2.ativo);
    }
}