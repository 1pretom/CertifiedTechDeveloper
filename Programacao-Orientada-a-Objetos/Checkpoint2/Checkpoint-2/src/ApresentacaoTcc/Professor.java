package ApresentacaoTcc;

import static java.lang.System.out;

    //Classe filha de pessoa
public class Professor extends Pessoa {
  //Parametros
    private String disciplina;
    private boolean tutorDeAluno;

    //Construtores
    public Professor(String nome, String sobrenome, String disciplina, boolean tutorDeAluno) {
        super(nome, sobrenome);
        this.disciplina = disciplina;
        this.tutorDeAluno = tutorDeAluno;
    }

    //Sobrescrição
    @Override
    public void estarPresente(String presente) {
        if (presente.equals("Sim")) {
            out.println("está presente");
        }else {
            out.println("Ausente");
        }
    }

    //Métodos
    public int avaliar(int nota ){
        return nota;
    }
    public boolean aprovar(String aprovado){
        if (aprovado.equals("Sim")){
            return true;
        }else{
            return false;
        }
    }

    //Getters e Setters
    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public boolean isTutorDeAluno() {
        return tutorDeAluno;
    }

    public void setTutorDeAluno(boolean tutorDeAluno) {
        this.tutorDeAluno = tutorDeAluno;
    }
}
