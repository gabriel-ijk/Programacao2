package Aula22.ExemploFinal;

public class Teste {
    public static void main(String[] args) {
        //acesso a uma constante
        System.out.println(Operacoes.PI);
        Operacoes op = new Operacoes();
        //acessar um atributo final
        System.out.println(op.pi);
        //nao é possivel alterar o valor de um atributo final
    }



}
