package model;

import java.time.LocalTime;

public class Horario {
    private int id;
    private int medicoId;
    private int postoSaudeId;
    private String diaSemana;
    private LocalTime horaInicio;
    private LocalTime horaFim;
    private String especialidade;
    private boolean ativo;

    public Horario() {}

    public Horario(int medicoId, int postoSaudeId, String diaSemana, 
                   LocalTime horaInicio, LocalTime horaFim, String especialidade) {
        this.medicoId = medicoId;
        this.postoSaudeId = postoSaudeId;
        this.diaSemana = diaSemana;
        this.horaInicio = horaInicio;
        this.horaFim = horaFim;
        this.especialidade = especialidade;
        this.ativo = true;
    }

    // Getters e Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public int getMedicoId() { return medicoId; }
    public void setMedicoId(int medicoId) { this.medicoId = medicoId; }
    public int getPostoSaudeId() { return postoSaudeId; }
    public void setPostoSaudeId(int postoSaudeId) { this.postoSaudeId = postoSaudeId; }
    public String getDiaSemana() { return diaSemana; }
    public void setDiaSemana(String diaSemana) { this.diaSemana = diaSemana; }
    public LocalTime getHoraInicio() { return horaInicio; }
    public void setHoraInicio(LocalTime horaInicio) { this.horaInicio = horaInicio; }
    public LocalTime getHoraFim() { return horaFim; }
    public void setHoraFim(LocalTime horaFim) { this.horaFim = horaFim; }
    public String getEspecialidade() { return especialidade; }
    public void setEspecialidade(String especialidade) { this.especialidade = especialidade; }
    public boolean isAtivo() { return ativo; }
    public void setAtivo(boolean ativo) { this.ativo = ativo; }
}