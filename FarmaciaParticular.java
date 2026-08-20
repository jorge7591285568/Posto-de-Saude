package model;

import java.time.LocalDate;

public class FarmaciaParticular {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String horarioFuncionamento;
    private String responsavel;
    private LocalDate dataCadastro;
    private boolean ativa;

    public FarmaciaParticular() {}

    public FarmaciaParticular(String nome, String endereco, String telefone, 
                             String horarioFuncionamento, String responsavel) {
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
        this.responsavel = responsavel;
        this.ativa = true;
        this.dataCadastro = LocalDate.now();
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getEndereco() { return endereco; }
    public void setEndereco(String endereco) { this.endereco = endereco; }
    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }
    public String getHorarioFuncionamento() { return horarioFuncionamento; }
    public void setHorarioFuncionamento(String horarioFuncionamento) { this.horarioFuncionamento = horarioFuncionamento; }
    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
    public LocalDate getDataCadastro() { return dataCadastro; }
    public void setDataCadastro(LocalDate dataCadastro) { this.dataCadastro = dataCadastro; }
    public boolean isAtiva() { return ativa; }
    public void setAtiva(boolean ativa) { this.ativa = ativa; }

    @Override
    public String toString() {
        return "FarmaciaParticular{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", endereco='" + endereco + '\'' +
                ", telefone='" + telefone + '\'' +
                ", responsavel='" + responsavel + '\'' +
                ", ativa=" + ativa +
                '}';
    }
}
