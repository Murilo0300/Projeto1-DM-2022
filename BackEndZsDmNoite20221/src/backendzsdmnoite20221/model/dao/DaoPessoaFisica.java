/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmnoite20221.model.dao;

import backendzsdmnoite20221.model.bean.PessoaFisica;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ProfAlexandre
 */
public class DaoPessoaFisica {

    public PessoaFisica inserir(PessoaFisica pesEntrada) {
        pesEntrada.setId(1000);
        pesEntrada.setNome("Jefferson");
        return pesEntrada;
    }

    public PessoaFisica alterar(PessoaFisica pesEntrada) {
        pesEntrada.setId(1000);
        pesEntrada.setNome("Jefferson");
        return pesEntrada;
    }

    public PessoaFisica excluir(PessoaFisica pesEntrada) {
        pesEntrada.setId(1000);
        pesEntrada.setNome("Jefferson");
        return pesEntrada;
    }

    public PessoaFisica buscar(PessoaFisica pesEntrada) {
        pesEntrada.setId(1000);
        pesEntrada.setNome("Jefferson");
        return pesEntrada;
    }

    public List<PessoaFisica> listar(PessoaFisica pesEntrada) {
        List<PessoaFisica> listaPessoa = new ArrayList<>();
        pesEntrada.setId(1000);
        pesEntrada.setNome("Jefferson");
        listaPessoa.add(pesEntrada);
        PessoaFisica pes2 = new PessoaFisica(2000,"xxx","rgrg","cpf");
        listaPessoa.add(pes2);
        return listaPessoa;
    }
    
}
