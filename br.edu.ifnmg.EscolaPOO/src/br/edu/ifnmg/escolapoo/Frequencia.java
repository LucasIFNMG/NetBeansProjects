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

public class Frequencia {
    private int idFreq;
    private Date dataFreq;

    public Frequencia(int idFreq, Date dataFreq) {
        this.idFreq = idFreq;
        this.dataFreq = dataFreq;
    }

    public int getIdFreq() {
        return idFreq;
    }

    public void setIdFreq(int idFreq) {
        this.idFreq = idFreq;
    }

    public Date getDataFreq() {
        return dataFreq;
    }

    public void setDataFreq(Date dataFreq) {
        this.dataFreq = dataFreq;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + this.idFreq;
        hash = 73 * hash + Objects.hashCode(this.dataFreq);
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
        final Frequencia other = (Frequencia) obj;
        if (this.idFreq != other.idFreq) {
            return false;
        }
        if (!Objects.equals(this.dataFreq, other.dataFreq)) {
            return false;
        }
        return true;
    }
    
    
    
}
