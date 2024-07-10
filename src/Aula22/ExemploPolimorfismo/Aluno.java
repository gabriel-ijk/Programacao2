package Aula22.ExemploPolimorfismo;

public class Aluno extends Pessoa{
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    @Override
    public String obterDados(){
        return "nome: "+getNome()+" "+getSobrenome()+" Matricula: "+matricula;
    }
}
