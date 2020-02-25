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
public class PessoaFactory {
    public Pessoa criarPessoa(TipoPessoa tipoPessoa){
        Pessoa pessoa = null;
        if(tipoPessoa.PessoaComum.equals(tipoPessoa)){
            pessoa = new PessoaComum();
            pessoa.setIdade(30);
            pessoa.setNome("Anderson");
        }else if(tipoPessoa.PessoaPreferencial.equals(tipoPessoa)){
            pessoa = new PessoaPreferencial();
            pessoa.setIdade(40);
            pessoa.setNome("Larissa");
        }
        return pessoa;
    }
}
