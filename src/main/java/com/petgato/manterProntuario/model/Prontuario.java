/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.petgato.manterProntuario.model;

import java.io.Serializable;
import java.time.LocalDate;

/**
 *
 * @author alessandra
 */
public class Prontuario implements Serializable {
    
    private Long id;
    private LocalDate data;
    private String vacina;
    private String medicacao;
    private String observacao;
    private String condutaTomada;
    
    public Prontuario (){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getVacina() {
        return vacina;
    }

    public void setVacina(String vacina) {
        this.vacina = vacina;
    }

    public String getMedicacao() {
        return medicacao;
    }

    public void setMedicacao(String medicacao) {
        this.medicacao = medicacao;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getCondutaTomada() {
        return condutaTomada;
    }

    public void setCondutaTomada(String condutaTomada) {
        this.condutaTomada = condutaTomada;
    } 
}
