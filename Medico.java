package model;

public class Medico extends Funcionario {
    private String crm;
    private String especialidade;
    private int postoSaudeId;
    private boolean ativo;

    public Medico() {
        super();
    }

    public Medico(String nome, int idade, String cpf, double salario, String cargo,
                  String matricula, String crm, String especialidade, int postoSaudeId) {
        super(nome, idade, cpf, salario, cargo, matricula);
        this.crm = crm;
        this.especialidade = especialidade;
        this.postoSaudeId = postoSaudeId;
        this.ativo = true;
    }

    public String getCrm() { return crm; }
    public void setCrm(String crm) { this.crm = crm; }
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public int getPostoSaudeId() { return postoSaudeId; }
    public void setPostoSaudeId(int postoSaudeId) { this.postoSaudeId = postoSaudeId; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "Medico{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", especialidade='" + especialidade + '\'' +
                ", crm='" + crm + '\'' +
                ", postoSaudeId=" + postoSaudeId +
                ", ativo=" + ativo +
                '}';
    }
}