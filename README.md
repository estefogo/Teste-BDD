<h1>BDD <i>(Behavior Driven Development)</i>: Implementação do <i>Cucumber</i> no desenvolvimento orientado a comportamento</h1>
<h3>Autor: Rafaela Mendonça Estefogo</h3>
<h3>Contato: rafaelamestefogo@gmail.com</h3>

<h2>Sobre as ferramentas utilizadas:</h2>
<p>A framework utilizada para a realização dos testes foi o <i>Cucumber</i>, que é definido como uma framework de testes BDD <i>(Behavior Driven Development)</i> ou seja, com foco no desenvolvimento orientado a comportamentos. Isso significa que a framework em questão compara os resultados de um determinado código com os comportamentos esperados, auxiliando o desenvolvedor a analisar a relação entre aquilo que era previsto e aquilo que de fato foi obtido. Para sua implementação, foi utilizada neste projeto a ferramenta de desenvolvimento Eclipse IDE for Java Developers (versão 2022-09).</p>

<h2>Sobre a estrutura e construção do projeto:</h2>
<p>O arquivo inicial <i>conta_bdd.feature</i> tem como objetivo declarar os valores esperados em cada cenário. O projeto simulava saques de dois tipos de clientes de um banco, hsendo que no primeiro cenário era referente a um cliente especial e o segundo a um cliente comum. Cada tipo de cliente iniciava com um determinado valor de saldo <i>(Given)</i>, solicitava um valor de saque <i>(When)</i> e recebia uma determinada resposta do sistema <i>(Then)</i>, que liberava ou bloqueava o saque dependendo do tipo de cliente. Caso o cliente fosse especial, ele poderia realizar o saque mesmo com saldo negativo, que apenas seria atualizado de acordo com o valor retirado; caso o cliente fosse comum, ele não poderia realizar o saque e receberia como resposta uma mensagem de alerta de saldo insuficiente.</p>
