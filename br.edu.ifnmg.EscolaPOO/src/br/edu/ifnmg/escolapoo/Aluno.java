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

public class Aluno {
    private int id;
    private String nome;
    private Date dataNasc;
    private Date dataIngresso;
    private char sexo;
    private String email;
    private List<String> telefones;
    private String cpf;
 
    public Aluno(){
        this.id = 0;
        this.nome = "";
        this.telefones = new ArrayList<String>();
    }

    public Aluno(int id, String nome, char sexo, String email, String cpf) {
        this.id = id;
        this.nome = nome;
        //this.dataNasc = new Date();
        //this.dataIngresso = new Date();
        this.sexo = sexo;
        this.email = email;
        this.telefones = new ArrayList<String>();
        this.cpf = cpf;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(){
        if(nome.length()>3)
            this.nome=nome;    
    }
    
    public void addTelefone(String telefone){
        if(telefone != null && telefone.length()==11)
            this.telefones.add(telefone);
    }
    
    public void removeTelefone(String telefone){
        if(this.telefones.contains(telefone))
            this.telefones.remove(telefone);
    }

    public List<String> getTelefones() {
        return telefones;
    }
/*
        public Date getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Date dataNasc) {
        this.dataNasc = dataNasc;
    }

    public Date getDataIngresso() {
        return dataIngresso;
    }

    public void setDataIngresso(Date dataIngresso) {
        this.dataIngresso = dataIngresso;
    }
*/
    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString() { // retorna informacoes dos dados salvos 
        return "Aluno{" + "id=" + id + ", nome=" + nome + '}';
    }

    @Override
    public int hashCode() { // gera um numero para cada alteracao que foi feita no atributo
        int hash = 3;
        hash = 29 * hash + this.id;
        hash = 29 * hash + Objects.hashCode(this.nome);
        hash = 29 * hash + Objects.hashCode(this.telefones);
        hash = 29 * hash + Objects.hashCode(this.cpf);
        return hash;
    }

    @Override
    public boolean equals(Object obj) { // compara a identidade do produto
        if (this == obj) { // compara objetos
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) { // compara as classes do objeto
            return false;
        }
        final Aluno other = (Aluno) obj; 
        if (this.id != other.id) { // compara os IDs dos objetos
            return false;
        }
        if (!Objects.equals(this.cpf, other.cpf)) { // compara os CPFs dos objetos
            return false;
        }
        return true;
    }
   
    
}