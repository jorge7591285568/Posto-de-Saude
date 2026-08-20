package model;

import java.time.LocalDate;

public class Paciente extends Pessoa {
    private LocalDate dataCadastroPaciente;
    private boolean ativo;

    public Paciente() {
        super();
    }

    public Paciente(String nome, int idade, String cpf) {
        super(nome, idade, cpf, "PACIENTE");
        this.ativo = true;
        this.dataCadastroPaciente = LocalDate.now();
    }

    public LocalDate getDataCadastroPaciente() { return dataCadastroPaciente; }
    public void setDataCadastroPaciente(LocalDate dataCadastroPaciente) { this.dataCadastroPaciente = dataCadastroPaciente; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "Paciente{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", idade=" + idade +
                ", cpf='" + cpf + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
