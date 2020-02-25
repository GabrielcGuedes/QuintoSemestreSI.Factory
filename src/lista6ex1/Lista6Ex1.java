/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista6ex1;

import java.util.Scanner;
import modelo.Pessoa;
import modelo.PessoaFactory;
import modelo.TipoPessoa;

/**
 *
 * @author gusta
 */
public class Lista6Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Defina o tipo de Pessoa: ");
        System.out.println("1-Pessoa comum");
        System.out.println("2-Pessoa Preferencial");
        
        int tipo=0;
        
        Scanner sc = new Scanner(System.in);
        
        tipo = sc.nextInt();
        
        PessoaFactory factory = new PessoaFactory();
        
        
        Pessoa leitorDeArquivo = factory.criarPessoa(TipoPessoa.getTipoPessoa(tipo));
        leitorDeArquivo.imprimirDados();
    }
    
}
