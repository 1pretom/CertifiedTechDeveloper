package vacinacaoProxyPattern;

import java.util.Date;

//classe
public class ServicoVacinarProxy implements Vacinar{

    //Método obrigatório
    @Override
    public void vacinarPessoa(Pessoa pessoa) {
        if (pessoa.getDataVacina().before(new Date())){//data de hoje
            new ServicoVacinar().vacinarPessoa(pessoa);
        }else {
            System.out.println("Usuário ainda não pode ser vacinado");
        }
    }
}
