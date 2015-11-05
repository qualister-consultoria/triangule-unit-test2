package br.com.qualister.triangulo;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class TrianguloExceptionUnitTest {

	public @Rule ExpectedException expected = ExpectedException.none();
	
	@Test
	public void testValorNulo_Lado1() throws TrianguloNaoPreenchidoException {
		expected.expect(TrianguloNaoPreenchidoException.class);
		expected.expectMessage("Lado não preenchido!");
		
		Triangulo.calcular(null, 3, 3);
	}
	
	@Test
	public void testValorNulo_Lado2() throws TrianguloNaoPreenchidoException {
		expected.expect(TrianguloNaoPreenchidoException.class);
		expected.expectMessage("Lado não preenchido!");
		
		Triangulo.calcular(3, null, 3);
	}
	
	@Test
	public void testValorNulo_Lado3() throws TrianguloNaoPreenchidoException {
		expected.expect(TrianguloNaoPreenchidoException.class);
		expected.expectMessage("Lado não preenchido!");
		
		Triangulo.calcular(3, 3, null);
	}

}
