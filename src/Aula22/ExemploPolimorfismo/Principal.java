package Aula22.ExemploPolimorfismo;

public class Principal {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();

        p1.setNome("Jonas");
        p1.setSobrenome("Silva");
        System.out.println(p1.obterDados());

        Aluno a1 = new Aluno();
        a1.setNome("Ana");
        a1.setSobrenome("Siva");
        a1.setMatricula("a12345");
        System.out.println(a1.obterDados());

    }
}
