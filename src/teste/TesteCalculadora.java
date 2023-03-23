package teste;

// https://www.mdsaude.com/obesidade/calcule-o-seu-peso

// 14 testes para adultos(20 a 65 anos). 
// 20 testes para idosos(acima de 65 anos). 


import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import controle.CalculadoraImc;

public class TesteCalculadora {
	
	CalculadoraImc calc;
	
	@Before
	public void setup() {
		calc = new CalculadoraImc();
	}
	
	//Adultos
	
	@Test
	//Baixo Peso Muito Grave
	public void testeAdultoBaixoPesoMuitoGrave() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Baixo peso muito grave", calc.calcularImc(1.6774, 45, 25, "masculino")); 
	}
	
	@Test
	//Baixo Peso Grave
	public void testeAdultoBaixoPesoGraveLimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.677, 45, 25, "masculino")); 
	}
	
	public void testeAdultoBaixoPesoGraveLimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Baixo peso grave", calc.calcularImc(1.799, 55, 25, "masculino")); 
	}
	
	@Test
	//Baixo Peso
	public void testeAdultoBaixoPesoLimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.8786, 60, 25, "masculino")); 
	}
	
	public void testeAdultoBaixoPesoLimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.756, 57, 25, "masculino")); 
	}
	
	@Test
	//Peso Normal
	public void testeAdultoPesoNormalLimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Peso normal", calc.calcularImc(1.7083, 54, 25, "masculino")); 
	}
	
	public void testeAdultoPesoNormalLimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Peso normal", calc.calcularImc(1.709, 73, 25, "masculino")); 
	}
	
	@Test
	//Sobrepeso
	public void testeAdultoSobrepesoLimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.697, 72, 25, "masculino")); 
	}
	
	public void testeAdultoSobrepesoLimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.5494, 72, 25, "masculino")); 
	}
	
	@Test
	//Obesidade grau I
	public void testeAdultoObesidadeGrauILimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.602, 77, 25, "masculino")); 
	}
	
	public void testeAdultoObesidadeGrauILimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.6039, 90, 25, "masculino")); 
	}
	
	@Test
	//Obesidade grau II
	public void testeAdultoObesidadeGrauIILimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.7071, 102, 25, "masculino")); 
	}
	
	public void testeAdultoObesidadeGrauIILimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.803, 130, 25, "masculino")); 
	}
	
	@Test
	//Obesidade grau III
	public void testeAdultoObesidadeGrauIII() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.8165, 132, 25, "masculino")); 
	}
	
	//Idosa
	
	@Test
	//Baixo Peso
	public void testeIdosaBaixoPeso() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Baixo peso", calc.calcularImc(1.66, 60, 66, "feminino")); 
	}
		
	@Test
	//Peso Normal
	public void testeIdosaPesoNormalLimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6095, 57, 66, "feminino")); 
	}
	
	public void testeIdosaPesoNormalLimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Peso normal", calc.calcularImc(1.6101, 70, 66, "feminino")); 
	}
	
	@Test
	//Sobrepeso
	public void testeIdosaSobrepesoLimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.6071, 70, 66, "feminino")); 
	}
	
	public void testeIdosaSobrepesoLimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Sobrepeso", calc.calcularImc(1.6007, 82, 66, "feminino")); 
	}
	
	@Test
	//Obesidade grau I
	public void testeIdosaObesidadeGrauILimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.608, 83, 66, "feminino")); 
	}
	
	public void testeIdosaObesidadeGrauILimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.6107, 96, 66, "feminino")); 
	}
	
	@Test
	//Obesidade grau II
	public void testeIdosaObesidadeGrauIILimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.6085, 96, 66, "feminino")); 
	}
	
	public void testeIdosaObesidadeGrauIILimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.6054, 108, 66, "feminino")); 
	}
	
	@Test
	//Obesidade grau III
	public void testeIdosaObesidadeGrauIII() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.6035, 108, 66, "feminino")); 
	}
	
	//Idoso
	
		@Test
		//Baixo Peso
		public void testeIdosoBaixoPeso() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Baixo peso", calc.calcularImc(1.66, 60, 66, "masculino")); 
		}
			
		@Test
		//Peso Normal
		public void testeIdosoPesoNormalLimiteInferior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Peso normal", calc.calcularImc(1.6095, 57, 66, "masculino")); 
		}
		
		public void testeIdosoPesoNormalLimiteSuperior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Peso normal", calc.calcularImc(1.6101, 70, 66, "masculino")); 
		}
		
		@Test
		//Sobrepeso
		public void testeIdosoSobrepesoLimiteInferior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Sobrepeso", calc.calcularImc(1.6071, 70, 66, "masculino")); 
		}
		
		public void testeIdosoSobrepesoLimiteSuperior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Sobrepeso", calc.calcularImc(1.602, 77, 66, "masculino")); 
		}
		
		@Test
		//Obesidade grau I
		public void testeIdosoObesidadeGrauILimiteInferior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.7, 87, 66, "masculino")); 
		}
		
		public void testeIdosoObesidadeGrauILimiteSuperior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Obesidade grau I", calc.calcularImc(1.7071, 102, 66, "masculino")); 
		}
		
		@Test
		//Obesidade grau II
		public void testeIdosoObesidadeGrauIILimiteInferior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.7046, 102, 66, "masculino")); 
		}
		
		public void testeIdosoObesidadeGrauIILimiteSuperior() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Obesidade grau II", calc.calcularImc(1.6066, 103, 66, "masculino")); 
		}
		
		@Test
		//Obesidade grau III
		public void testeIdosoObesidadeGrauIII() { 
			CalculadoraImc calc = new CalculadoraImc();
			Assert.assertEquals("Obesidade grau III", calc.calcularImc(1.6046, 103, 66, "masculino")); 
		}
	
	
	
	
	
	
	
	
	/*
	
	@Test
	public void testeMeninoPesoNormal2anosLimiteInferior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Peso normal", calc.calcularImc(1.0953, 18, 2, "masculino")); 
	}
	
	public void testeMeninoPesoNormal2anosLimiteSuperior() { 
		CalculadoraImc calc = new CalculadoraImc();
		Assert.assertEquals("Peso normal", calc.calcularImc(1.0953, 18, 2, "masculino")); 
	}
	*/

}
