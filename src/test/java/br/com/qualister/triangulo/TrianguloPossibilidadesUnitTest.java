package br.com.qualister.triangulo;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class TrianguloPossibilidadesUnitTest {

	private Integer lado1;
	private Integer lado2;
	private Integer lado3;
	private String resultado;
	
	public TrianguloPossibilidadesUnitTest(Integer lado1, Integer lado2, Integer lado3, String resultado) {
		this.lado1 = lado1;
		this.lado2 = lado2;
		this.lado3 = lado3;
		this.resultado = resultado;
	}
	
	
	@Test
	public void testeTodasAsPossibilidadesDosTriangulos() throws TrianguloNaoPreenchidoException {
		assertEquals(resultado, Triangulo.calcular(lado1, lado2, lado3));
	}

	@Parameters(name = "{0}, {1}, {2} - {3}")
	public static List<Object[]> data() {
		return Arrays.asList(new Object[][] {
			{3, 3, 3, "O triângulo é Equilátero"},
			{3, 6, 9, "O triângulo é Escaleno"},
			{3, 6, 6, "O triângulo é Isósceles"},
			{6, 6, 3, "O triângulo é Isósceles"},
			{6, 3, 6, "O triângulo é Isósceles"},
			{0, 3, 3, "Não é um triângulo"},
			{3, 0, 3, "Não é um triângulo"},
			{3, 3, 0, "Não é um triângulo"},
			{0, 0, 3, "Não é um triângulo"},
			{0, 3, 0, "Não é um triângulo"},
			{0, 0, 0, "Não é um triângulo"}
		});
	}
}
