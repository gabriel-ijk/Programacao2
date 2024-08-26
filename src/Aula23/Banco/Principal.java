package Aula23.Banco;
import java.util.ArrayList;
import java.util.List;

public class Principal {
    public static void main(String[] args) {
        String fileName = "contas.ser";

        // Criar algumas contas
        List<Conta> contas = new ArrayList<>();
        contas.add(new Conta("João", "senha123", 1000.0f));
        contas.add(new Conta("Maria", "senha456", 2000.0f));
    }
}
