package ApresentacaoTcc;

public abstract class Pessoa {
    private String nome;
    private String sobrenome;

    public Pessoa(String nome, String sobrenome) {
        this.nome = nome;
        this.sobrenome = sobrenome;
    }

    abstract public void estarPresente( String presente );

}
