/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petgato.manterAnimal.model;

import com.petgato.manterAnimal.model.enums.Status;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;

/**
 *
 * @author alessandra
 */
public class Visita implements Serializable {
    
    private Long id;
    private LocalDate dataVisita;
    private String observacao;
    private Status status;

    public Visita() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataVisita() {
        return dataVisita;
    }

    public void setDataVisita(LocalDate dataVisita) {
        this.dataVisita = dataVisita;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 67 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Visita other = (Visita) obj;
        return Objects.equals(this.id, other.getId());
    }   
}
