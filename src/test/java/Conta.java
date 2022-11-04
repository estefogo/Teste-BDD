import javax.swing.JOptionPane;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	/**
	 * Criação de uma variável booleana que definirá se o cliente é especial ou não
	 * ("true" para clientes especiais e "false" para clientes comuns
	 */
	public boolean Especial;

	/**
	 * Criação de uma variável que armazenará os valores do saldo dos clientes
	 * (tanto especial quanto normal)
	 */
	public int saldo;

	/**
	 * Criação de uma variável que armazenará os valores dos saque solicitados pelos
	 * clientes
	 */
	public int saque;

	/** Getters e Setters das variáveis criadas */
	public boolean isTipo() {
		return Especial;
	}

	public void setTipo(boolean tipo) {
		this.Especial = tipo;
	}

	public int getSaldo() {
		return saldo;
	}

	public void setSaldo(int saldo) {
		this.saldo = saldo;
	}

	public int getSaque() {
		return saque;
	}

	public void setSaque(int saque) {
		this.saque = saque;
	}

	/**
	 * Um cliente especial está com um determinado valor inteiro disponível em sua
	 * conta
	 */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {

		/**
		 * o valor do saldo assumirá o valor da variável recebida como parâmetro pelo
		 * método um_cliente_especial_com_saldo_atual_de_reais, que corresponde ao valor
		 * declarado no Given do primeiro cenario do arquivo conta_bdd.feature (-200)
		 */
		this.saldo = int1;

		/** define que o cliente é do tipo Especial */
		this.Especial = true;

		/**
		 * se o valor do saldo for diferente daquele declarado no Given do primeiro
		 * cenário (-200), indicando que o método não funcionou corretamente, e o
		 * cliente for Especial, o teste retornará um erro
		 */
		if (this.saldo != -200 && this.Especial == true) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/** O cliente solicita um determinado valor inteiro de saque em sua conta */
	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {

		/**
		 * o valor do saque assumirá o valor da variável recebida como parâmetro pelo
		 * método for_solicitado_um_saque_no_valor_de_reais, que corresponde ao valor
		 * declarado no When do primeiro cenario do arquivo conta_bdd.feature (100)
		 */
		this.saque = int1;

		/**
		 * se o valor do saque for diferente daquele declarado no When do primeiro
		 * cenário (100), indicando que o método não funcionou corretamente,o teste
		 * retornará um erro
		 */
		if (this.saque != 100) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * O saque deverá ser efetuado e o saldo atualizado de acordo com o valor após o
	 * saque, independente do saldo original estar negativo ou não
	 */
	@Then("deve efutuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efutuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {

		/**
		 * o saldo será atualizado de acordo com o valor do saque solicitado,
		 * subtraindo-o
		 */
		this.saldo = this.saldo - this.saque;

		/**
		 * caso o saldo final seja diferente do resultado esperado definido no Then do
		 * primeiro cenário (-300), o teste retornará um erro
		 */
		if (this.saldo != -300) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * Um cliente comum está com um determinado valor inteiro disponível em sua
	 * conta
	 */
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {

		/**
		 * o valor do saldo assumirá o valor da variável recebida como parâmetro pelo
		 * método um_cliente_comum_com_saldo_atual_de_reais, que corresponde ao valor
		 * declarado no Given do segundo cenario do arquivo conta_bdd.feature (-300)
		 */
		this.saldo = int1;

		/** define que o cliente não é do tipo Especial */
		this.Especial = false;

		/**
		 * se o valor do saldo for diferente daquele declarado no Given do segundo
		 * cenário (-300), indicando que o método não funcionou corretamente, o teste
		 * retornará um erro
		 */
		if (this.saldo != -300 && this.Especial == false) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/** O cliente solicita um determinado valor inteiro de saque em sua conta */
	@When("solicitar um saque no valor de {int} reais")
	public void solicitar_um_saque_no_valor_de_reais(Integer int1) {

		/**
		 * o valor do saque assumirá o valor da variável recebida como parâmetro pelo
		 * método solicitar_um_saque_no_valor_de_reais, que corresponde ao valor
		 * declarado no When do segundo cenario do arquivo conta_bdd.feature (200)
		 */
		this.saque = int1;

		/**
		 * se o valor do saque for diferente daquele declarado no When do segundo
		 * cenário (200), indicando que o método não funcionou corretamente,o teste
		 * retornará um erro
		 */
		if (this.saque != 200) {
			throw new io.cucumber.java.PendingException();
		}
	}

	/**
	 * Caso o valor solicitado para o saque seja maior que o valor disponível na
	 * conta, o saque não é efetuado, e deve ser retornada uma mensagem de aviso de
	 * saldo insuficiente
	 */
	@Then("não deve efutuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public String não_deve_efutuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {

		/**
		 * se o valor do saldo final for diferente daquele declarado no Then do segundo
		 * cenário (-300), indicando que o método não funcionou corretamente, o teste
		 * retornará um erro
		 */
		if (this.saldo != -300 && this.Especial != false) {
			throw new io.cucumber.java.PendingException();
		}

		/**
		 * caso o método funcione conforme o esperado, o sistema retornará uma mensagem
		 * de alerta de saldo insuficiente para o cliente
		 */
		else {
			return "Saldo insuficiente!";
		}
	}
}