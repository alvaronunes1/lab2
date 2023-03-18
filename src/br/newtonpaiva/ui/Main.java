package br.newtonpaiva.ui;

import br.newtonpaiva.dominio.*;

public class Main {
    public static void main(String[] args) {
      Conta c = new Conta(10);
//      c.setNumero(10);
      c.setSaldo(100.0);

      c.depositar(50.0);
//      c.depositar(-20.0);

      Conta c2 = new Conta();
      c2.setNumero(10);
      c2.setSaldo(500.0);

      Conta c3 = new Conta();

      if (c.equals(c2)) {
          System.out.println("Mesma Conta");
      } else {
          System.out.println("Contas diferentes");
      }


        System.out.println(c.getSaldo());

        ContaEspecial ce = new ContaEspecial();
        ce.setNumero(20);
        ce.setSaldo(100.0);
        ce.setLimite(100.0);
        ce.sacar(200.0);

        //Pessoa p = new Pessoa();

        Pessoa pessoas[] = new Pessoa[4];
        pessoas[0] = new PessoaFisica();
        pessoas[1] = new PessoaJuridica();
        pessoas[2] = new PessoaJuridica();
        pessoas[3] = new PessoaFisica();

        for (Pessoa p : pessoas)
          p.validarDocumento();



    }
}
