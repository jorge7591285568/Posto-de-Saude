package model;

import java.time.LocalDate;
import java.time.LocalTime;

public class Consulta {
    private int id;
    private int pacienteId;
    private int medicoId;
    private LocalDate dataConsulta;
    private LocalTime hora;
    private String observacoes;
    private String status;
    private int postoSaudeId;

    public Consulta() {}

    public Consulta(int pacienteId, int medicoId, LocalDate dataConsulta, LocalTime hora, String status) {
        this.pacienteId = pacienteId;
        this.medicoId = medicoId;
        this.dataConsulta = dataConsulta;
        this.hora = hora;
        this.status = status;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getPacienteId() { return pacienteId; }
    public void setPacienteId(int pacienteId) { this.pacienteId = pacienteId; }
    public int getMedicoId() { return medicoId; }
    public void setMedicoId(int medicoId) { this.medicoId = medicoId; }
    public LocalDate getDataConsulta() { return dataConsulta; }
    public void setDataConsulta(LocalDate dataConsulta) { this.dataConsulta = dataConsulta; }
    public LocalTime getHora() { return hora; }
    public void setHora(LocalTime hora) { this.hora = hora; }
    public String getObservacoes() { return observacoes; }
    public void setObservacoes(String observacoes) { this.observacoes = observacoes; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public int getPostoSaudeId() { return postoSaudeId; }
    public void setPostoSaudeId(int postoSaudeId) { this.postoSaudeId = postoSaudeId; }

    @Override
    public String toString() {
        return "Consulta{" +
                "id=" + id +
                ", pacienteId=" + pacienteId +
                ", medicoId=" + medicoId +
                ", dataConsulta=" + dataConsulta +
                ", hora=" + hora +
                ", status='" + status + '\'' +
                '}';
    }
}
