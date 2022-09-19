    Aulas 7, 8 e 9

## Caixa Preta vs Caixa Branca

|Critérios de comparação|Caixa Preta (Tem muito a ver com testes funcionais)|Caixa Branca |
|-|-|-|
|Base de teste|- Requisitos de software <br> - Especificações <br> - Casos de uso <br> - Histórias de usuários|- Arquitetura de software <br> - Projeto de software detalhado <br> - Qualquer outra fonte de informação relacionada à estrutura do software|
|Uso de especificações de software|São a principal fonte de referência para o projeto desses casos de teste.|São frequentemente usados como uma fonte adicional de informações para detectar o resultado esperado dos casos te teste.|
|Cobertura|É medida com base nos itens testados na base de teste e na técnica aplicada à base de teste.|É medida com base nos elementos testados dentro da estrutura selecionada - por exemplo, o código ou as interfaces.|


## Particionamento de equivalência
Os dados são divididos em intervalos,  se por exemplo for fazer uma pesquisa entre pessoas de 16 a 60 anos de idade, esse intervalo é o particionamento de equivalência e os resto é invalidado.
## Análise de valor limite
É uma extensão da técnica anterior na qual é utilizada quando a partição é ordenada e consiste em dados numéricos ou sequenciais. Quando é testado um limite, por exemplo, entre 0 e 5, deve-se testar -1, 0, 1, 4, 5 e 6. Ou seja, pega um antes e um depois dos valores limites.

## Tabela de decisão
Existe para analisar as combinações entre as condições de um teste e assim definir qual o resultado esperado pelas regras de negócio que o sistema deve implementar. Aqui são testadas as variáveis e condições.
|Variáveis|1|2|3|4|
|-|-|-|-|-|
|Cartão válido?|Não|Sim|Sim|Sim|
|Senha válida?|X|Não|Sim|Sim|
|Valor solicitado é <= Saldo?|X|X|Não|Sim|
|Saída esperada|Cartão inválido|Senha inválida|Saldo insuficiente|Saque efetuado com sucesso|
Ela é boa para ser usada em casos de poucas variáveis, quando tem muitas, é um pouco mais complexa de se identificar onde está um problema

## Teste de transição de estado
Mostra os possíveis estados e como o software transita entre seus estados.
||Insere Cartão|Senha OK|Senha NOK|
|-|-|-|-|
|E1 - Iniciar||||
|E2 - Esperar||||
|E3 - 1ª Tentativa||E6|E4|
|E4 - 2ª Tentativa||E6|E5|
|E5 - 3ª Tentativa||E6|E7|
|E6 - Acessar||||
|E7 - Bloquear|E1|||

## Testes estáticos e dinâmicos

|Testes dinâmicos|Testes estáticos|
|-|-|
|Em execução <br> Os testes são realizados enquanto o código está em execução.|Não execução <br> Os testes não são realizados em produtos de trabalho, como documentos de requisitos, casos de teste e código.|
|Detecção<br>Estes testes se concentram na deteclçao de defeitos.|Prevenção<br>Esses testes se concentram na prevenção de defeitos|
|Testes tardios<br>Esses testes são realizados quando o código é implantado.|Testes iniciais<br>Esses testes podem ser realizados desde os primeiros estágios do ciclo de vida do software.|
|Técnicas<br>Tipos de testes são usados: funcionais e não funcionais|Técnicas<br>São utilizadas técnicas como: revisão formal, inspeção, revisão de código.|


## Processo de revisão
As revisões consistem em **examinar tudo com cuidado o produto de trabalho** buscando encontrar e remover erros e pode ser realizado por uma ou mais pessoas. Essas revisões podem ser:
- Revisões formais: Tem funções definidas, seguem um processo e devem ser documentadas. Varia de empresa pra empresa.
- Revisões informais: Não seguem um processo definido e não são formalmente documentadas. É definida por você mesmo.

## Requisitos


## Exemplo prático
