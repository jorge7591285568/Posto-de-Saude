package model;

import java.time.LocalDate;

public class Medicamento {
    private int id;
    private String nome;
    private String fabricante;
    private String categoria;
    private int quantidade;
    private double precoUnitario;
    private LocalDate dataValidade;
    private int postoSaudeId;

    public Medicamento() {}

    public Medicamento(int id, String nome, String fabricante, String categoria, 
                       int quantidade, double precoUnitario, LocalDate dataValidade, int postoSaudeId) {
        this.id = id;
        this.nome = nome;
        this.fabricante = fabricante;
        this.categoria = categoria;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.dataValidade = dataValidade;
        this.postoSaudeId = postoSaudeId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getFabricante() { return fabricante; }
    public void setFabricante(String fabricante) { this.fabricante = fabricante; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }

    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }

    public double getPrecoUnitario() { return precoUnitario; }
    public void setPrecoUnitario(double precoUnitario) { this.precoUnitario = precoUnitario; }

    public LocalDate getDataValidade() { return dataValidade; }
    public void setDataValidade(LocalDate dataValidade) { this.dataValidade = dataValidade; }

    public int getPostoSaudeId() { return postoSaudeId; }
    public void setPostoSaudeId(int postoSaudeId) { this.postoSaudeId = postoSaudeId; }
}
