package test;

import static org.junit.Assert.assertEquals;
import impl.Ingresso;
import impl.TipoIngresso;
import impl.DiasDaSemana;

import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

public class IngressoTest {
	TipoIngresso ingressoCrianca;
	TipoIngresso ingressoEstudante;
	TipoIngresso ingressoIdoso;
	DiasDaSemana sabado;
	public Ingresso ingresso;

	@Before
	public void setup(){
		ingressoCrianca = TipoIngresso.valueOf("CRIANCA");;
		ingressoEstudante = TipoIngresso.valueOf("ESTUDANTE");
		ingressoIdoso = TipoIngresso.valueOf("IDOSO");
		ingresso = new Ingresso();
	}
		
	@Test
	public void CriancasNaoTemDescontoAosSabados() {
		assertEquals(ingressoCrianca.retornaPrecoConvencional(),ingresso.precoAPagar(ingressoCrianca,sabado));
	}

}
