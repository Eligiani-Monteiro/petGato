/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petgato.manterAdotante.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alessandra
 */
public class Telefone implements Serializable{
    
    private Long id;
    private String numero;
    
    public Telefone(){
    
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 97 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Telefone other = (Telefone) obj;
        return Objects.equals(this.id, other.getId());
    }    
}
