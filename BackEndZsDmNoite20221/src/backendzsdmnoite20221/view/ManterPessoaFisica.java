/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backendzsdmnoite20221.view;

import backendzsdmnoite20221.controller.ControllerPessoaFisica;
import backendzsdmnoite20221.model.bean.PessoaFisica;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author ProfAlexandre
 */
public class ManterPessoaFisica {
    
        public static void menu() {
        int operacao = Integer.parseInt(JOptionPane.showInputDialog("0 - Sair \n 1 - Inserir \n 2 - Alterar \n 3 - Excluir \n 4 - Buscar \n 5 - Listar"));
        switch (operacao) {
            case 0:
               int sair = JOptionPane.showConfirmDialog(null,"Deseja Sair");
               System.out.println("Valor de Sair = " + sair);
               if(sair > 0) menu();
               break;
            case 1:
               inserir();
               break;
           case 2:
               alterar();
               break;
           case 3:
               excluir();
               break;
           case 4:
               buscar();
               break;
           case 5:
               listar();
               break;
           default:
               JOptionPane.showMessageDialog(null,"Erro opcao invalida");
               menu();
               break;
        }
    }

    private static void inserir() {
        String nome = JOptionPane.showInputDialog("Nome");
        String rg = JOptionPane.showInputDialog("Rg");
        String cpf = JOptionPane.showInputDialog("Cpf");
        PessoaFisica pesEntrada = new PessoaFisica(nome, cpf, rg);
        ControllerPessoaFisica contPes = new ControllerPessoaFisica();
        PessoaFisica pesSaida = contPes.inserir(pesEntrada);
        JOptionPane.showMessageDialog(null,"" + pesSaida.toString());
    }

    private static void alterar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
        String nome = JOptionPane.showInputDialog("Nome");
        String rg = JOptionPane.showInputDialog("Rg");
        String cpf = JOptionPane.showInputDialog("Cpf");
        PessoaFisica pesEntrada = new PessoaFisica(id,nome, cpf, rg);
        ControllerPessoaFisica contPes = new ControllerPessoaFisica();
        PessoaFisica pesSaida = contPes.alterar(pesEntrada);
        JOptionPane.showMessageDialog(null,"" + pesSaida.toString());
    }

    private static void excluir() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
        PessoaFisica pesEntrada = new PessoaFisica(id);
        ControllerPessoaFisica contPes = new ControllerPessoaFisica();
        PessoaFisica pesSaida = contPes.excluir(pesEntrada);
        JOptionPane.showMessageDialog(null,"" + pesSaida.toString());
     }

    private static void buscar() {
        int id = Integer.parseInt(JOptionPane.showInputDialog("Id"));
        PessoaFisica pesEntrada = new PessoaFisica(id);
        ControllerPessoaFisica contPes = new ControllerPessoaFisica();
        PessoaFisica pesSaida = contPes.buscar(pesEntrada);
        JOptionPane.showMessageDialog(null,"" + pesSaida.toString());
 
    }

    private static void listar() {
        String nome = JOptionPane.showInputDialog("Nome");
        String cpf = JOptionPane.showInputDialog("Cpf");
        PessoaFisica pesEntrada = new PessoaFisica(nome, cpf);
        ControllerPessoaFisica contPes = new ControllerPessoaFisica();
        List<PessoaFisica> listapesSaida = contPes.listar(pesEntrada);
        for (PessoaFisica pf : listapesSaida) {
           JOptionPane.showMessageDialog(null,"" + pf.toString());
        }
    
    }

    
}
