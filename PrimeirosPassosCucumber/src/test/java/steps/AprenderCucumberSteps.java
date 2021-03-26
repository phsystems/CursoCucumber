package steps;

import java.util.Calendar;
import java.util.Date;

import org.junit.Assert;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class AprenderCucumberSteps {
	@Dado("que criei o arquivo corretamente")
	public void que_criei_o_arquivo_corretamente() {
	    
	}

	@Quando("executa - lo")
	public void executa_lo() {
	    
	}

	@Entao("a especificacao deve finalizar com sucesso")
	public void a_especificacao_deve_finalizar_com_sucesso() {
	    
	}
	
	private int contador = 0;
	
	@Dado("que o valor do contador e {int}")
	public void que_o_valor_do_contador_e(int int1) {
		contador = int1;
	
	}

	@Quando("eu incrementar em {int}")
	public void eu_incrementar_em(int int1) {
	   contador = contador + int1;
	}

	@Entao("o valor do contador sera {int}")
	public void o_valor_do_contador_será(int int1) {
	    Assert.assertEquals(int1, contador);
	    
	}
	
	Date entrega = new Date();
	
	@Dado("que a entrega e dia {int}\\/{int}\\/{int}")
	public void que_a_entrega_e_dia(int dia, int mes, int ano) {
	    Calendar cal = Calendar.getInstance();
	    cal.set(Calendar.DAY_OF_MONTH, dia);
	    cal.set(Calendar.MONTH, mes - 1);  //pro java Janeiro é 0
	    cal.set(Calendar.YEAR, ano);
	    entrega = cal.getTime();
	}

	@Quando("a entrega atrasar em {int} dias")
	public void a_entrega_atrasar_em_dias(int int1) {
	    Calendar cal = Calendar.getInstance();
	    cal.setTime(entrega);
	    cal.add(Calendar.DAY_OF_MONTH, int1);
	    entrega = cal.getTime();
	}

	@Entao("a entrega sera efetuada em {int}\\/{int}\\/{int}")
	public void a_entrega_sera_efetuada_em(int int1, int int2, int int3) {
	    
	}


	


}
