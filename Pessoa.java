package model;

import java.time.LocalDateTime;

public class Pessoa {
    protected int id;
    protected String nome;
    protected int idade;
    protected String cpf;
    protected String tipo;
    protected LocalDateTime dataCadastro;

    // Construtores, getters e setters
    public Pessoa() {}

    public Pessoa(String nome, int idade, String cpf, String tipo) {
        this.nome = nome;
        this.idade = idade;
        this.cpf = cpf;
        this.tipo = tipo;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public int getIdade() { return idade; }
    public void setIdade(int idade) { this.idade = idade; }
    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }
    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }
    public LocalDateTime getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(LocalDateTime dataCadastro) { this.dataCadastro = dataCadastro; }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}