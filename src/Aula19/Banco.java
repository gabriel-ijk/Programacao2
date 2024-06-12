package Aula19;

import java.util.Scanner;
public class Banco {
    public static Conta cadstraConta(){
        System.out.println("Cadastro de conta");
        System.out.println("Qual o titular?");
        String titular = new Scanner(System.in).next();
        String
        System.out.println("Qual o deposito inicial?");
        float valor = new Scanner(System.in).nextFloat();
        return new Conta(titular,valor);
    }

    public static Conta acessaConta(Conta c1){
        System.out.println("Acessando a conta "+c1.identificador);
        char opc;
        do{
            System.out.println("Selecione uma opção:");
            System.out.println("D- DEPOSITAR");
            System.out.println("S- SACAR");
            System.out.println("V- VERIFICAR SALDO");
            System.out.println("E- SAIR");
            opc = new Scanner(System.in).next().toLowerCase(Locale.ROOT);
        }
    }
    public static void main(String[] args) {
        Conta c1 = new Conta("Ana", 300);
        c1.gerarIdentificador();
        System.out.println("A nova conta tem o identificador "+c1.identificador);
        c1.depositar(1000);
        if(c1.sacar(1500)){
            System.out.println("Saque realizado");
        }
        else {
            System.out.println("Saldo insuficiente");
        }
    }
}
