/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmnoite20221.controller;

import backendzsdmnoite20221.model.bean.PessoaFisica;
import backendzsdmnoite20221.model.dao.DaoPessoaFisica;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class ControllerPessoaFisica {

    DaoPessoaFisica daoPesf;
    
    public ControllerPessoaFisica() {
        daoPesf = new DaoPessoaFisica();
        
    }

    public PessoaFisica inserir(PessoaFisica pesEntrada) {
        return daoPesf.inserir(pesEntrada);
    }

    public PessoaFisica alterar(PessoaFisica pesEntrada) {
        return daoPesf.alterar(pesEntrada);
    }

    public PessoaFisica excluir(PessoaFisica pesEntrada) {
        return daoPesf.excluir(pesEntrada);
    }

    public PessoaFisica buscar(PessoaFisica pesEntrada) {
        return daoPesf.buscar(pesEntrada);
    }

    public List<PessoaFisica> listar(PessoaFisica pesEntrada) {
        return daoPesf.listar(pesEntrada);
    }
    
}
