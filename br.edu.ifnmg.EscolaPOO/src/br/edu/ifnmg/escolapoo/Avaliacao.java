/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.escolapoo;

/**
 *
 * @author Lucas Pimenta
 */

import java.util.List;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Date;

public class Avaliacao {
    private int idAva;
    private String descricao;
    private Date dataAva;
    private float notaTotal;
    private float notaObtida;

    public Avaliacao(int idAva, String descricao, Date dataAva, float notaTotal, float notaObtida) {
        this.idAva = idAva;
        this.descricao = descricao;
        this.dataAva = dataAva;
        this.notaTotal = notaTotal;
        this.notaObtida = notaObtida;
    }

    public int getIdAva() {
        return idAva;
    }

    public void setIdAva(int idAva) {
        this.idAva = idAva;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataAva() {
        return dataAva;
    }

    public void setDataAva(Date dataAva) {
        this.dataAva = dataAva;
    }

    public float getNotaTotal() {
        return notaTotal;
    }

    public void setNotaTotal(float notaTotal) {
        this.notaTotal = notaTotal;
    }

    public float getNotaObtida() {
        return notaObtida;
    }

    public void setNotaObtida(float notaObtida) {
        this.notaObtida = notaObtida;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + this.idAva;
        hash = 83 * hash + Objects.hashCode(this.descricao);
        hash = 83 * hash + Objects.hashCode(this.dataAva);
        hash = 83 * hash + Float.floatToIntBits(this.notaTotal);
        hash = 83 * hash + Float.floatToIntBits(this.notaObtida);
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
        final Avaliacao other = (Avaliacao) obj;
        if (this.idAva != other.idAva) {
            return false;
        }
        if (Float.floatToIntBits(this.notaTotal) != Float.floatToIntBits(other.notaTotal)) {
            return false;
        }
        if (Float.floatToIntBits(this.notaObtida) != Float.floatToIntBits(other.notaObtida)) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataAva, other.dataAva)) {
            return false;
        }
        return true;
    }
    
    
    
}
