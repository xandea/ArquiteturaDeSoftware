# ArquiteturaDeSoftware
Avaliação do código já criado utilizando cloc:
<pre>
15 text files.
15 unique files.
18 files ignored.

github.com/AlDanial/cloc v 1.88  T=0.06 s (235.6 files/s, 10132.0 lines/s)
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             8             71             63            339
XML                              2              0              0             78
Maven                            1              6              4             65
INI                              4              0              0             19
-------------------------------------------------------------------------------
SUM:                            15             77             67            501
-------------------------------------------------------------------------------
</pre>
Quantidade de linhas por arquivo:
<pre>
-------------------------------------------------------------------------------------------------------------------
File                                                                            blank        comment           code
-------------------------------------------------------------------------------------------------------------------
correcao-de-solos\src\main\java\com\gustavo\correcaop.java                         11             12            122
correcao-de-solos\pom.xml                                                           6              4             65
correcao-de-solos\src\main\java\com\gustavo\amostradosolo.java                     16              0             55
correcao-de-solos\src\main\java\com\gustavo\correcaok.java                         13             10             54
correcao-de-solos\src\main\java\com\gustavo\fontedecorrecao.java                    9              0             46
correcao-de-solos\.classpath                                                        0              0             44
correcao-de-solos\src\main\java\com\gustavo\correcaomgca.java                      13             12             35
correcao-de-solos\.project                                                          0              0             34
correcao-de-solos\src\test\java\com\gustavo\apptest.java                            3              6             11
correcao-de-solos\.settings\org.eclipse.jdt.core.prefs                              0              0              9
correcao-de-solos\src\main\java\com\gustavo\app.java                                4             17              8
correcao-de-solos\src\main\java\com\gustavo\cabecalho.java                          2              6              8
correcao-de-solos\.settings\org.eclipse.core.resources.prefs                        0              0              4
correcao-de-solos\.settings\org.eclipse.m2e.core.prefs                              0              0              4
correcao-de-solos\.settings\org.eclipse.jdt.apt.core.prefs                          0              0              2
-------------------------------------------------------------------------------------------------------------------
SUM:                                                                               77             67            501
-------------------------------------------------------------------------------------------------------------------
</pre>

Commit 1: NOMES DE VARIÁVEIS E CLASSES
    Afim de melhorar o entendimento do código, os nomes das classes e de algumas variáveis foram trocados para serem mais descritivos e retirar algumas abreviações.

Commit 2: Refatoração da classe CorrecaoDeFosforo:
    link para o commit antigo: https://github.com/gustavosako/ArquiteturaDeSoftware/commit/5193531288fe45af644c64d373daf51bf599aab8
    Uma das coisas percebidas na avaliação do código é que existe bastante redundancia de dados, ou seja, dados iguais estão armazenados em diversas partes do código. Podemos ver no exemplo:
    Classe CorrecaoDeFosforo:
<pre>
    public class CorrecaoDeFosforo {
        private String teorDeFosforoNoSolo;
        private String teorDeFosforoDesejado;
        private double eficienciaDoFosforo;
    ...
</pre>
    Classe AmostraDoSolo:
<pre>
    public class AmostraDoSolo {
        private double teorFosforo;
        private double teorPotassio;
        private double teorCalcio;
    ...
</pre>
<pre>
    public class AmostraDoSolo {
        private double teorFosforo;
        private double teorPotassio;
        private double teorCalcio;
    ...
</pre>
    Em ambas as classes o "teor de fósforo" está armazenado, mesmo que com nomes diferentes. Para evitar isso a lógica do funcionamento da classe CorrecaoDeFosforo foi alterada, para ao invés de armazenar as informações redundantes, armazenar as informações que serão imprimidas na tela, recebendo como parâmetro essas outras informações.
    Para acomodar essa mudança, também foi mudada a classe responsável pelos cálculos, que foi quebrada em outros métodos e, ao invés de imprimir as informações na tela, retorna o resultado dos cálculos para os atributos da classe.

Avaliação utilizando cloc no commit atual:
<pre>
-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                             8             60             31            331
XML                              2              0              0             78
Maven                            1              6              4             65
INI                              4              0              0             19
-------------------------------------------------------------------------------
SUM:                            15             66             35            493
-------------------------------------------------------------------------------
</pre>

# Atividade 4
Assim que o clone foi feito, as seguintes alterações foi necessaria para começar a rodar o código:
### FonteDeCorrecao.java
<pre>
- O nome da classe "FonteDeCorrecao" não correspode com o ".java". Foi necessario realizar a substituição para garantir que o software funcionasse.
- Dentro da função "correcaoPottasio" a fonte correspondente a "Sul.Potassio/Mag" há 3 argumentos, sendo que a função apenas recebe 2. Foi corrigido.
</pre>
### CorrecaoDeCalcioMagnesio.java
<pre>
- Função setPRNT não tem um "this." referente a variavel private dentro da classe, e o nome estava gravado errada.
</pre>
### CorrecaoDePotassio.java
<pre>
- A função "getParticipacaoNaCTCDesejada" retorna uma variavel não existente. Sendo necessario a correção para a "participacaoNaCTCDesejada"
</pre>
### CorrecaoDeFosforo.java
<pre>
- O tipo de "fonteDeCorrecao" não corresponde com a classe criada
- Erro em doble, utilizando "," em vez de "."
- Utilizado variavel corresponde "quantidadeDeFonteEmKgAlqueire" sendo que não é uma entrada da função
- falta de ";" para fechar a função
- Faltante o "}" que fecha a classe principal
</pre>
### AmostraDoSolo.java
<pre>
- O nome da classe nao corresponde com o nome do ".java"
- não existe a entrada de "matéria organica" para o calculo correto do carbono
- Calculo errado do M.O%, necessario utilizar a entrada de "materiaOrganica" adicionada
</pre>

## Realização dos testes e problemas encontrados
### CorrecaoDeFosforo.java
<pre>
- necessario criar a função get para o custo do calculo da fonte de fosforo a adicionar;
- A conta de "calculaQuandidadeAAplicar" estava sendo multiplicada por 100, fazendo necessario sua retirada.
- A "this.fontesDeCorrecao" sempre retornava nulo, em relação ao seu teor da fonte utilizada para correção, porque não fazia referencia a classe correta.
- Alteração da função que imprime, pois não tinhamos acesso a ela
- Há redundancia nos calculos de alqueiro mas, foi mantido.
</pre>
### CorrecaoDePotassio.java
<pre>
- Há erro no calculo de kg de potassio a adicionar e no custo. Foi alterado em relação a eficiencia do potassio para um número double.
- O vetor começa em 0, sendo assim, o equivalente a 1 "Cloreto de Potássio" na planilha, é zero no software. (Foi mantido mas, há inconsistência).
- Necassario adicionar construtores para acesso da classe de teste em relação a quantidade e o custo.
</pre>

## Considerações finais
Não é um trabalho trivial consertar erro dos outros, além do que o trabalho apresentado não pensa em formas de manutenabilidade. Não havia classes de teste, variáveis apresentava-se com nomes confusos e existencia de condicionais em excesso.
Deu muito trabalho para adequar a planilha e corre o risco de uma nova introdução de dados impactar no código, consequentimente em seu retorno. Pois, não é tratado a entrada de dados em relação a valores nulos ou vazios.
