package model;

import java.time.LocalDate;

public class CoordenadorSistema extends Funcionario {
    private LocalDate dataAdmissao;
    private String departamento;
    private String sistema;
    private boolean ativo;

    public CoordenadorSistema() {
        super();
    }

    public CoordenadorSistema(String nome, int idade, String cpf, double salario, 
                             String matricula, String departamento) {
        super(nome, idade, cpf, salario, "COORDENADOR_SISTEMA", matricula);
        this.departamento = departamento;
        this.ativo = true;
        this.dataAdmissao = LocalDate.now();
        this.sistema = "SISTEMA_SAUDE";
    }

    public LocalDate getDataAdmissao() { return dataAdmissao; }
    public void setDataAdmissao(LocalDate dataAdmissao) { this.dataAdmissao = dataAdmissao; }
    public String getDepartamento() { return departamento; }
    public void setDepartamento(String departamento) { this.departamento = departamento; }
    public String getSistema() { return sistema; }
    public void setSistema(String sistema) { this.sistema = sistema; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }

    @Override
    public String toString() {
        return "CoordenadorSistema{" +
                "id=" + getId() +
                ", nome='" + getNome() + '\'' +
                ", departamento='" + departamento + '\'' +
                ", sistema='" + sistema + '\'' +
                ", ativo=" + ativo +
                '}';
    }
}
