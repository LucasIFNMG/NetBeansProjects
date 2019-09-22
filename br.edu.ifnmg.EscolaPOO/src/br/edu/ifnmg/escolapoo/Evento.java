/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.escolapoo;

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Date;

/**
 *
 * @author Lucas Pimenta
 */
public class Evento {
    private int idEvento;
    private String descricao;
    private Date dataEvento;
    private String participantes;

    public Evento(int idEvento, String descricao, Date dataEvento, String participantes) {
        this.idEvento = idEvento;
        this.descricao = descricao;
        this.dataEvento = dataEvento;
        this.participantes = participantes;
    }

    public int getIdEvento() {
        return idEvento;
    }

    public void setIdEvento(int idEvento) {
        this.idEvento = idEvento;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataEvento() {
        return dataEvento;
    }

    public void setDataEvento(Date dataEvento) {
        this.dataEvento = dataEvento;
    }

    public String getParticipantes() {
        return participantes;
    }

    public void setParticipantes(String participantes) {
        this.participantes = participantes;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idEvento;
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.dataEvento);
        hash = 97 * hash + Objects.hashCode(this.participantes);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Evento other = (Evento) obj;
        if (this.idEvento != other.idEvento) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.participantes, other.participantes)) {
            return false;
        }
        if (!Objects.equals(this.dataEvento, other.dataEvento)) {
            return false;
        }
        return true;
    }
    
    
}

