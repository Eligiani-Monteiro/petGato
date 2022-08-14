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
public class Adocao implements Serializable{
    
    private Long id;
    private LocalDate dataEmissao;
    private Status status;
    
    public Adocao(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
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
        hash = 11 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Adocao other = (Adocao) obj;
        return Objects.equals(this.id, other.getId());
    } 
}
