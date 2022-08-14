/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petgato.materUsuario.model;

import com.petgato.padrao.model.Pessoa;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

/**
 *
 * @author alessandra
 */

@Entity
public class Usuario extends Pessoa{
    
    private String username;
    private String senha;
    private boolean bloqueado;
    private String situacao;
    
    @ManyToOne
    private GrupoUsuario grupoUsuario;

    public Usuario() {
    }

    public Usuario(Long id, String username, String senha) {
        this.username = username;
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public GrupoUsuario getGrupoUsuario() {
        return grupoUsuario;
    }

    public void setGrupoUsuario(GrupoUsuario grupoUsuario) {
        this.grupoUsuario = grupoUsuario;
    }

    public boolean isBloqueado() {
        return bloqueado;
    }

    public void setBloqueado(boolean bloqueado) {
        this.bloqueado = bloqueado;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Objects.hashCode(this.getUsername());
        hash = 31 * hash + Objects.hashCode(this.getSenha());
        hash = 31 * hash + (this.isBloqueado() ? 1 : 0);
        hash = 31 * hash + Objects.hashCode(this.getSituacao());
        hash = 31 * hash + Objects.hashCode(this.getGrupoUsuario());
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        final Usuario other = (Usuario) obj;
        if (this.bloqueado != other.isBloqueado()) {
            return false;
        }
        if (!Objects.equals(this.username, other.getUsername())) {
            return false;
        }
        if (!Objects.equals(this.senha, other.getSenha())) {
            return false;
        }
        if (!Objects.equals(this.situacao, other.getSenha())) {
            return false;
        }
        return Objects.equals(this.grupoUsuario, other.getGrupoUsuario());
    }   
}
