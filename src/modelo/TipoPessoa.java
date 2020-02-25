/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.Arrays;

/**
 *
 * @author gusta
 */
public enum TipoPessoa {
    PessoaComum(1),PessoaPreferencial(2);
    
    private int tipo;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    private TipoPessoa(int tipo) {
        this.tipo = tipo;
    }
    
    public static TipoPessoa getTipoPessoa(int tipo){
        return Arrays.asList(TipoPessoa.values())
                   .stream()
                   .filter(t -> t.getTipo()== tipo)
                   .findFirst()
                   .get();
      
    }
}
