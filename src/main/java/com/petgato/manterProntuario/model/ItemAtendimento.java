/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petgato.manterProntuario.model;

import java.io.Serializable;
import java.util.Objects;

/**
 *
 * @author alessandra
 */
public class ItemAtendimento implements Serializable {
    
    private Long id;
    private int quantidade;
    
    public ItemAtendimento(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final ItemAtendimento other = (ItemAtendimento) obj;
        return Objects.equals(this.id, other.getId());
    }
     
}
