package ApresentacaoTcc;

import java.time.LocalDateTime;

public class Apresentacao {
    private LocalDateTime horarioEData;
    private Aluno alunoAnfitriao;

    public Apresentacao(LocalDateTime horarioEData, Aluno alunoAnfitriao) {
        this.horarioEData = horarioEData;
        this.alunoAnfitriao = alunoAnfitriao;
    }
}
