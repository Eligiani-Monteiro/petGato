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
public class Endereco implements Serializable{
    
    private Long id;
    private Long numero;
    private String referencia;
    private String complemeno;
    
    public Endereco(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getNumero() {
        return numero;
    }

    public void setNumero(Long numero) {
        this.numero = numero;
    }

    public String getReferencia() {
        return referencia;
    }

    public void setReferencia(String referencia) {
        this.referencia = referencia;
    }

    public String getComplemeno() {
        return complemeno;
    }

    public void setComplemeno(String complemeno) {
        this.complemeno = complemeno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Endereco other = (Endereco) obj;
        return Objects.equals(this.id, other.id);
    } 
}
