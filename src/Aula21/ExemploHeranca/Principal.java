package Aula21.ExemploHeranca;

public class Principal {
    public static void main(String[] args) {
        Motorista m1 = new Motorista("Jonas","Silva");
        m1.setNome("Jonas");
        m1.setSobrenome("Souza");
        m1.setSalario(1000);
        m1.setCnh("1234567");

        Engenheiro e1 = new Engenheiro("Carlos","Hobson");
        e1.setNome("Carlos");
        e1.setSobrenome("Hilson");
        e1.setSalario(2000);
        e1.setCrea("123456789");
    }
}
