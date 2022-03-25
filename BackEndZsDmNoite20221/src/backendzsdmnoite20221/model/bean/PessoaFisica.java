/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmnoite20221.model.bean;

/**
 *
 * @author ProfAlexandre
 */
public class PessoaFisica extends Pessoa{
    
    String cpf;
    String rg;

    public PessoaFisica(int id) {
        super(id);
    }

    public PessoaFisica(int id, String nome) {
        super(id, nome);
    }

    public PessoaFisica( String nome,String cpf) {
        super(nome);
        this.cpf = cpf;
    }

    public PessoaFisica(String nome,String cpf, String rg) {
        super(nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    public PessoaFisica(int id, String nome, String cpf, String rg) {
        super(id, nome);
        this.cpf = cpf;
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    @Override
    public String toString() {
        String p = "Pessoa{" + "id=" + getId() + ", nome=" + getNome() + '}';
        String pf = "PessoaFisica{" + "cpf=" + cpf + ", rg=" + rg + '}';
        String msg = p + pf;
        return msg;
    }
    
    
    
}
