package model;

public class Laboratorio {
    private int id;
    private String nome;
    private String endereco;
    private String telefone;
    private String horarioFuncionamento;
    private String responsavel;
    private String tipoExames;
    private int postoSaudeId;

    public Laboratorio() {}

    public Laboratorio(int id, String nome, String endereco, String telefone, 
                       String horarioFuncionamento, String responsavel, String tipoExames, int postoSaudeId) {
        this.id = id;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
        this.horarioFuncionamento = horarioFuncionamento;
        this.responsavel = responsavel;
        this.tipoExames = tipoExames;
        this.postoSaudeId = postoSaudeId;
    }

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

    public String getTipoExames() { return tipoExames; }
    public void setTipoExames(String tipoExames) { this.tipoExames = tipoExames; }

    public int getPostoSaudeId() { return postoSaudeId; }
    public void setPostoSaudeId(int postoSaudeId) { this.postoSaudeId = postoSaudeId; }
}
