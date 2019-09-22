/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifnmg.escolapoo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;

public class AlunoEspecial extends Aluno {
    
    private List<String> necessidadesEspeciais;

    public AlunoEspecial() {
        super();
        this.necessidadesEspeciais = new ArrayList<>();
    }

    public AlunoEspecial(int id, String nome,char sexo, String email, String cpf){
        super(id, nome, sexo, email, cpf);
        this.necessidadesEspeciais = new ArrayList<>();
    }
    
    

    public List<String> getNecessidadesEspeciais() {
        return necessidadesEspeciais;
    }

    public void setNecessidadesEspeciais(List<String> necessidadesEspeciais) {
        this.necessidadesEspeciais = necessidadesEspeciais;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 37 * hash + Objects.hashCode(this.necessidadesEspeciais);
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
        final AlunoEspecial other = (AlunoEspecial) obj;
        if (!Objects.equals(this.necessidadesEspeciais, other.necessidadesEspeciais)) {
            return false;
        }
        return true;
    }

    
}