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

public class Disciplina {
    private int idDisc;
    private String descricao;
    private String profMinistrante;
    private List<String> Avaliacao;
    private List<String> Frequencia;

    public Disciplina(int idDisc, String descricao, String profMinistrante, List<String> Avaliacao, List<String> Frequencia) {
        this.idDisc = idDisc;
        this.descricao = descricao;
        this.profMinistrante = profMinistrante;
        this.Avaliacao = Avaliacao;
        this.Frequencia = Frequencia;
    }

    public int getIdDisc() {
        return idDisc;
    }

    public void setIdDisc(int idDisc) {
        this.idDisc = idDisc;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getProfMinistrante() {
        return profMinistrante;
    }

    public void setProfMinistrante(String profMinistrante) {
        this.profMinistrante = profMinistrante;
    }

    public List<String> getAvaliacao() {
        return Avaliacao;
    }

    public void setAvaliacao(List<String> Avaliacao) {
        this.Avaliacao = Avaliacao;
    }

    public List<String> getFrequencia() {
        return Frequencia;
    }

    public void setFrequencia(List<String> Frequencia) {
        this.Frequencia = Frequencia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + this.idDisc;
        hash = 97 * hash + Objects.hashCode(this.descricao);
        hash = 97 * hash + Objects.hashCode(this.profMinistrante);
        hash = 97 * hash + Objects.hashCode(this.Avaliacao);
        hash = 97 * hash + Objects.hashCode(this.Frequencia);
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
        final Disciplina other = (Disciplina) obj;
        if (this.idDisc != other.idDisc) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.profMinistrante, other.profMinistrante)) {
            return false;
        }
        if (!Objects.equals(this.Avaliacao, other.Avaliacao)) {
            return false;
        }
        if (!Objects.equals(this.Frequencia, other.Frequencia)) {
            return false;
        }
        return true;
    }
    
    
    
}
