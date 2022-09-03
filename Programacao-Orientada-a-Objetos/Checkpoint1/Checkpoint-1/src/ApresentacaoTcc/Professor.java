package ApresentacaoTcc;

import static java.lang.System.out;

public class Professor extends Pessoa {
    private String disciplina;
    private boolean tutorDoAluno;

    public Professor(String nome, String sobrenome, String disciplina, boolean tutorDoAluno) {
        super(nome, sobrenome);
        this.disciplina = disciplina;
        this.tutorDoAluno = tutorDoAluno;
    }

    @Override
    public void estarPresente(String presente) {
        if (presente.equals("Sim")) {
            out.println("está presente");
        }else {
            out.println("Ausente");
        }
    }

    public int avaliar(int nota ){
        return nota;
    }
    public boolean aprovar (String aprovado){
        if (aprovado.equals("Sim")){
            return true;
        }else{
            return false;
        }
    }

}
