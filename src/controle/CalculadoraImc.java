package controle;

public class CalculadoraImc {
	
	public String calcularImc(double altura, double peso, int idade, String sexo) {
		
		double imc = peso / (altura * altura);
		
		// adulto
		
		if(idade >= 20 && idade <= 65) {
			
			if(imc <= 16) {
				return "Baixo peso muito grave";
			}
			if(imc >= 16 && imc <= 16.99) {
				return "Baixo peso grave";
			}
			if(imc >= 17 && imc <= 18.49) {
				return "Baixo peso";
			}
			if(imc >= 18.50 && imc <= 24.99) {
				return "Peso normal";
			}
			if(imc >= 25 && imc <= 29.99) {
				return "Sobrepeso";
			}
			if(imc >= 30 && imc <= 34.99) {
				return "Obesidade grau I";
			}
			if(imc >= 35 && imc <= 39.99) {
				return "Obesidade grau II";
			}
			if(imc >= 40) {
				return "Obesidade grau III";
			}			
		}
		
		// idosa
		
		if(idade > 65 && sexo == "feminino") {
			
			if(imc < 22) {
				return "Baixo peso";
			}
			if(imc >= 22 && imc <= 27) {
				return "Peso normal";
			}
			if(imc > 27 && imc <= 32) {
				return "Sobrepeso";
			}
			if(imc > 32 && imc <= 37) {
				return "Obesidade grau I";
			}
			if(imc > 37 && imc < 42) {
				return "Obesidade grau II";
			}
			if(imc >= 42) {
				return "Obesidade grau III";
			}	
		}
		
		// idoso
		
		if(idade > 65 && sexo == "masculino") {
			
			if(imc < 22) {
				return "Baixo peso";
			}
			if(imc >= 22 && imc <= 27) {
				return "Peso normal";
			}
			if(imc > 27 && imc <= 30) {
				return "Sobrepeso";
			}
			if(imc > 30 && imc <= 35) {
				return "Obesidade grau I";
			}
			if(imc > 35 && imc < 40) {
				return "Obesidade grau II";
			}
			if(imc >= 40) {
				return "Obesidade grau III";
			}	
	}
		System.out.println(imc);
		return "Erro";
	}

}
