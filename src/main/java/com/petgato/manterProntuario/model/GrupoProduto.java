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
public class GrupoProduto implements Serializable{
    
    private Long id;
    private String nome;
    
    public GrupoProduto(){
    } 

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final GrupoProduto other = (GrupoProduto) obj;
        return Objects.equals(this.id, other.getId());
    }
}
