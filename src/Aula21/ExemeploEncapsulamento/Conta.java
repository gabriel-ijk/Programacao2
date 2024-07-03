package Aula21.ExemeploEncapsulamento;
import java.util.Random;

public class Conta {
    private String titular;
    private String identificador;
    private String senha;
    private float saldo;

    public Conta(String titular,String Senha){
        this.titular = titular;
        this.senha = senha;
        gerarIdentificador();
    }

    public String getTitular(){
        return titular;
    }

    public void setSenha(String senha){
        this.senha=senha;
    }

    public void setTitular(String titular){
        this.titular=titular;
    }

    public String getIdentificador(){
        return getIdentificador();
    }

    private void gerarIdentificador(){
        Random aleatorio = new Random();
        String identificador = "";
        for(int i=0;i<4;i++) {
            identificador += (char) aleatorio.nextInt(65, 90);
        }
            identificador+=aleatorio.nextInt(1000,2000);
            this.identificador = identificador;
        }
        void depositar(float valor){
        saldo+=valor;
        }

        boolean sacar(float valor){
        if(saldo>=valor){
            saldo-=valor;
            return true;
        }
        return false;
        }
        public String verificaSaldo(){
            return String.format("Seu saldo é de %.2f", saldo);
        }

        boolean validaAcesso(String identificador, String senha){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
        }
}
