/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author gusta
 */
public class PessoaComum extends Pessoa{

    @Override
    public void imprimirDados() {
        System.out.println("Nome: " + super.getNome());
        System.out.println("Idade: " + super.getIdade());
    }
    
}
