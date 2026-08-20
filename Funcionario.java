package model;

public class Funcionario extends Pessoa {
    private double salario;
    private String cargo;
    private String matricula;

    public Funcionario() {
        super();
    }

    public Funcionario(String nome, int idade, String cpf, double salario, String cargo, String matricula) {
        super(nome, idade, cpf, "FUNCIONARIO");
        this.salario = salario;
        this.cargo = cargo;
        this.matricula = matricula;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
