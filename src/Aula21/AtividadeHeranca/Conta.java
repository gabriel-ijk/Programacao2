package Aula21.AtividadeHeranca;

import java.util.Random;

public class Conta {
    private String titular;
    private String identificador;
    private String senha;
    protected float saldo;

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public void depositar (float valor) {
        saldo += valor;
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

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public boolean validaAcesso(String identificador, String senha){
        return this.identificador.equals(identificador) && this.senha.equals(senha);
    }





}
