import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Conta {
	/** Um cliente especial está com um determinado valor inteiro disponível em sua conta */
	@Given("Um cliente especial com saldo atual de {int} reais")
	public void um_cliente_especial_com_saldo_atual_de_reais(Integer int1) {
	    throw new io.cucumber.java.PendingException();
	}

	/** O cliente solicita um determinado valor inteiro de saque em sua conta */
	@When("for solicitado um saque no valor de {int} reais")
	public void for_solicitado_um_saque_no_valor_de_reais(Integer int1) {
	    throw new io.cucumber.java.PendingException();
	}

	/** O saque deve ser efetuado e o saldo atualizado de acordo com o valor após o saque, independente do saldo original
	 * estar negativo ou não */
	@Then("deve efutuar o saque e atualizar o saldo da conta para {int} reais")
	public void deve_efutuar_o_saque_e_atualizar_o_saldo_da_conta_para_reais(Integer int1) {
	    throw new io.cucumber.java.PendingException();
	}

	/** Um cliente comum está com um determinado valor inteiro disponível em sua conta */
	@Given("Um cliente comum com saldo atual de {int} reais")
	public void um_cliente_comum_com_saldo_atual_de_reais(Integer int1) {
	    throw new io.cucumber.java.PendingException();
	}

	/** O cliente solicita um determinado valor inteiro de saque em sua conta */
	@When("solicitar um saque no valor de {int} reais")
	public void solicitar_um_saque_no_valor_de_reais(Integer int1) {
	    throw new io.cucumber.java.PendingException();
	}

	/** Caso o valor solicitado para o saque seja maior que o valor disponível na conta, o saque não é efetuado,
	 * e deve ser retornada uma mensagem de aviso de saldo insuficiente */
	@Then("não deve efutuar o saque e deve retornar a mensagem Saldo Insuficiente")
	public void não_deve_efutuar_o_saque_e_deve_retornar_a_mensagem_saldo_insuficiente() {
	    throw new io.cucumber.java.PendingException();
	}
}