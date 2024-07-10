package Aula22.ExemploArquivos;
import java.io.Serializable;

public class Pessoa implements Serializable{
    String nome;
    String sobrenome;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString(){
        return "Nome: "+nome+" "+sobrenome;
    }
}
