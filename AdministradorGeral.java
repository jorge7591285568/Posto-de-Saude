package model;

import java.time.LocalDate;

public class AdministradorGeral extends Funcionario {
    private String nivel;
    private LocalDate dataAdmissao;
    private String departamento;
    private String permissoes;
    private boolean ativo;

    public AdministradorGeral() {
        super();
    }

    public AdministradorGeral(String nome, int idade, String cpf, double salario, 
                              String matricula, String nivel) {
        super(nome, idade, cpf, salario, "ADMINISTRADOR", matricula);
        this.nivel = nivel;
        this.ativo = true;
        this.dataAdmissao = LocalDate.now();
        this.departamento = "ADMINISTRAÇÃO";
    }

    public String getNivel() { return nivel; }
    public void setNivel(String nivel) { this.nivel = nivel; }
    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public String getPermissoes() { return permissoes; }
    public void setPermissoes(String permissoes) { this.permissoes = permissoes; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "AdministradorGeral{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", nivel='" + nivel + '\'' +
                ", departamento='" + departamento + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
