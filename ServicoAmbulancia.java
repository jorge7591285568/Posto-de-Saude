package model;

import java.time.LocalDate;

public class ServicoAmbulancia {
    private int id;
    private String numero;
    private String tipo;
    private String placa;
    private LocalDate dataAquisicao;
    private String status;
    private int conducaoId;
    private int postoSaudeId;

    public ServicoAmbulancia() { }

    public ServicoAmbulancia(int id, String numero, String tipo, String placa, LocalDate dataAquisicao,
                             String status, int conducaoId, int postoSaudeId) {
        this.id = id;
        this.numero = numero;
        this.tipo = tipo;
        this.placa = placa;
        this.dataAquisicao = dataAquisicao;
        this.status = status;
        this.conducaoId = conducaoId;
        this.postoSaudeId = postoSaudeId;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNumero() { return numero; }
    public void setNumero(String numero) { this.numero = numero; }

    public String getTipo() { return tipo; }
    public void setTipo(String tipo) { this.tipo = tipo; }

    public String getPlaca() { return placa; }
    public void setPlaca(String placa) { this.placa = placa; }

    public java.time.LocalDate getDataAquisicao() { return dataAquisicao; }
    public void setDataAquisicao(java.time.LocalDate dataAquisicao) { this.dataAquisicao = dataAquisicao; }

    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }

    public int getConducaoId() { return conducaoId; }
    public void setConducaoId(int conducaoId) { this.conducaoId = conducaoId; }

    public int getPostoSaudeId() { return postoSaudeId; }
    public void setPostoSaudeId(int postoSaudeId) { this.postoSaudeId = postoSaudeId; }

    @Override
    public String toString() {
        return "ServicoAmbulancia{" +
                "id=" + id +
                ", numero='" + numero + '\'' +
                ", tipo='" + tipo + '\'' +
                ", placa='" + placa + '\'' +
                ", dataAquisicao=" + dataAquisicao +
                ", status='" + status + '\'' +
                ", conducaoId=" + conducaoId +
                ", postoSaudeId=" + postoSaudeId +
                '}';
    }
}