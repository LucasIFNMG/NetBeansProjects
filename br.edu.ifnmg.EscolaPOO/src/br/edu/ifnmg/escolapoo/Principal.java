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

public class Principal{

    public static void main(String[] args) {

            Aluno a1 = new Aluno();
            //     public Aluno(int id, String nome, char sexo, String email, String cpf) {
            Aluno a2 = new Aluno(1,"teste",  'M', "email", "12345678901" );
            System.out.println("Hello World!");
            a2.addTelefone("38999124145");
        }
    
}
