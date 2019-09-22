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
public class Turma {
    private int idTurma;
    private Date dataTurma;
    private String descricao;
    private List<String> Alunos;

    public Turma(int idTurma, Date dataTurma, String descricao, List<String> Alunos) {
        this.idTurma = idTurma;
        this.dataTurma = dataTurma;
        this.descricao = descricao;
        this.Alunos = Alunos;
    }

    public int getIdTurma() {
        return idTurma;
    }

    public void setIdTurma(int idTurma) {
        this.idTurma = idTurma;
    }

    public Date getDataTurma() {
        return dataTurma;
    }

    public void setDataTurma(Date dataTurma) {
        this.dataTurma = dataTurma;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<String> getAlunos() {
        return Alunos;
    }

    public void setAlunos(List<String> Alunos) {
        this.Alunos = Alunos;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 61 * hash + this.idTurma;
        hash = 61 * hash + Objects.hashCode(this.dataTurma);
        hash = 61 * hash + Objects.hashCode(this.descricao);
        hash = 61 * hash + Objects.hashCode(this.Alunos);
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
        final Turma other = (Turma) obj;
        if (this.idTurma != other.idTurma) {
            return false;
        }
        if (!Objects.equals(this.descricao, other.descricao)) {
            return false;
        }
        if (!Objects.equals(this.dataTurma, other.dataTurma)) {
            return false;
        }
        if (!Objects.equals(this.Alunos, other.Alunos)) {
            return false;
        }
        return true;
    }
    
}
