package model;

import java.time.LocalDate;

public class CoordenadorPosto extends Funcionario {
    private int postoSaudeId;
    private LocalDate dataAdmissao;
    private String especialidade;
    private boolean ativo;

    public CoordenadorPosto() {
        super();
    }

    public CoordenadorPosto(String nome, int idade, String cpf, double salario, 
                           String matricula, int postoSaudeId) {
        super(nome, idade, cpf, salario, "COORDENADOR_POSTO", matricula);
        this.postoSaudeId = postoSaudeId;
        this.ativo = true;
        this.dataAdmissao = LocalDate.now();
    }

    public int getPostoSaudeId() { return postoSaudeId; }
    public void setPostoSaudeId(int postoSaudeId) { this.postoSaudeId = postoSaudeId; }
    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "CoordenadorPosto{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", postoSaudeId=" + postoSaudeId +
                ", ativo=" + ativo +
                '}';
    }
}
