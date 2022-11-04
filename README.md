<h1>BDD (Behavior Driven Development): Implementação do Cucumber no desenvolvimento orientado a comportamento</h1>
<h3>Repositório do projeto sobre Desenvolvimento Orientado a Comportamento (BDD - Behavior Drives Development), realizado com a framework Cucumber.</h3>
<h3>Autor: Rafaela Mendonça Estefogo</h3>
<>Contato: rafaelamestefogo@gmail.com</>

<h2>Sobre as ferramentas utilizadas:</h2>
<p>A framework utilizada para a realização dos testes foi o Cucumber, que é definido como uma framework de testes BDD (Behavior Driven Development) ou seja, com foco no desenvolvimento orientado ao comportamento. Isso significa que a framework em questão compara os resultados de um determinado código com os resultados esperados pré-definidos, auxiliando o desenvolvedor de forma a analisar a relação entre aquilo que era previsto e aquilo que de fato foi obtido. Para sua implementação, foi utilizada neste projeto a ferramenta de desenvolvimento Eclipse IDE for Java Developers (versão 2022-09).</p>

<h3>Cucumber Framework</h3>
![Cucumber](https://user-images.githubusercontent.com/79616452/200039192-de06724e-5ad0-434b-8b3d-0768107633bc.png)

<h2>Sobre a estrutura e construção do projeto:</h2>
<p>O arquivo inicial conta_bdd.featura tem como objetivo declarar os valores esperados em cada cenário. No caso, haviam dois tipos de cenários possíveis, onde o primeiro deles era referente a um cliente especial do banco e o segundo a um cliente comum. Cada tipo de cliente iniciava no cenário com um determinado valor de saldo (Given), solicitava um valor de saque (When) e recebia uma determinada resposta do sistema (Then), que permitia ou bloqueava o saque dependendo do tipo de cliente. Caso o cliente fosse especial, ele poderia realizar o saque mesmo com saldo negativo; caso o cliente fosse comum, não poderia realizar o saque e receberia como resposta uma mensagem de alerta de Saldo Insuficiente.</p>
