/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petgato.manterAdotante.model;

import com.petgato.padrao.model.Pessoa;
import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alessandra
 */
public class Adotante extends Pessoa implements Serializable {
    
    private Long id;
    private String rg;
    private String cpf;
    
    public Adotante(){
    
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Adotante other = (Adotante) obj;
        return Objects.equals(this.id, other.getId());
    }  
}
