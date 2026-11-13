package br.com.ecommerce.model;

import java.math.BigDecimal;

public class Produto {
    public Long id;
    public String codigo;
    public String nome;
    public String descricao;
    public String tamanho;
    public BigDecimal precoUnitario;
    public int quantidadeEstoque;
    public Double notaMedia;
    public boolean ativo;
}