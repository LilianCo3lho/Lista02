//Ana Lilian Sousa Coelho - 556697
package Lista02;

public class Utilidades {

	// somas
	public int Somatorio(int vet[]) {
		int soma = 0;
		for (int i = 2; i < vet.length -2; i++) {
			soma += vet[i];
		}
		return soma;
	}

	// numeros pares
	public static void Pares(int vet[]) {
		for (int i = 0; i < vet.length; i++) {
			if (vet[i] % 2 == 0) {
				System.out.print(vet[i] + ", ");
			}
		}
	}
	
	//media
	public double Media(int vet1[], int vet2[]) {
		int soma1 = 0, soma2 =0;
		for (int i = 0; i < vet1.length; i++) {
			soma1 += vet1[i];
			soma2 += vet2[i];
		}
		double media = (soma1 + soma2)/2;
		return media;
	}

	
	//Media Ponderada
	public static double MediaPonderada(int notas[], int pesos[]) {
		int somaNotas = 0; 
		int somaPesos = 0;
        for (int i = 0; i < notas.length; i++) {
            somaNotas += notas[i] * pesos[i];
            somaPesos += pesos[i];
        }
        	double somaTotal = somaNotas / somaPesos;
        return somaTotal;
	}
	
	
	//quantidades de elementos
	public int QuantidadeElementos (int vet1[], int vet2[], int num) {
		int vezes = 0;
		for(int i=0; i<vet1.length; i++) {
			if(vet1[i] == num || vet2[i] == num) {
				vezes = i++;
				if(vet1[i] == num && vet2[i] == num)
					vezes = i++;
			}
		}
			return vezes;
		
	}
	
	
	//copia de vetor ================================================
	public static int[] CopiaVetor(int vet1[]) {
		int copia[] = new int[vet1.length];
		for (int i = 0; i < vet1.length; i++) {
			copia[i] = vet1[i];
		}
		return copia;
	}
	
	
	//Ordenaçao crescente
	public static int[] Crescente(int vet1[]) {
		int copia [] = CopiaVetor(vet1);
		for (int i = 0; i < vet1.length -i -1; i++) {
			for(int j = 0; j< copia.length -i -1; j++) {
				if(copia[j] > copia[j+1]) {
					int anterior = copia[j];
					copia[j] = copia[j+1];
					copia[j+1] = anterior;
				}
			}
		}
		return copia;
	}
	
	//Verificação de ordenação
    public static boolean estaOrdenado(int vet[]) {
        for (int i = 0; i < vet.length - 1; i++) {
            if (vet[i] > vet[i + 1]) {
                return false;
            }
        }
        return true;
    }
    
    //K-ésimo maior valor
    public static int kEsimoMaior(int vet [], int k) {
        int[] copia = Crescente(vet);
        return copia[vet.length - k];
    }
    
    //K-ésimo menor valor
    public static int kEsimoMenor(int vet [], int k) {
        int[] copia = Crescente(vet);
        return copia[k - 1];
    }
	
    //igualdade
	public static boolean Iguais(int vet1[], int vet2 []) {
        for(int i = 0; i< vet1.length ;i++) {
        	if(vet1[i] == vet2[i])
        		return true;
        	}
        return false;
    }
	
	
  	//potenciaçao (nao consegui  fazer)
  		
	//primo
	  public static boolean Primo(int numero) {
	        if (numero % 2 == 0) 
	         return false;
	        
	        return true;
	    }
  		//busca por ocorrencia (nao consegui  fazer)
  		
  		//remoçao de elemento (nao consegui  fazer)
  		
  	//verificaçao de palindromo
	  public static boolean Palindromo(String palavra) {
	        StringBuilder reverso = new StringBuilder(palavra).reverse();
	        return palavra.equals(reverso.toString());
	        }
	        
  	//verificaçao primo
	 public static boolean VerificaçaoPrimo(int numero) {
		        if (numero % 2 == 0) 
		         return false;
		        
		        return true;
		    }
	 
  		//string inverso
	  public static String inverterString(String texto) {
	        return new StringBuilder(texto).reverse().toString();
	    }
  		
  		//juros compostos
	  public static double jurosCompostos(double principal, double taxa, int periodos) {
	        return principal * Math.pow(1 + taxa, periodos);
	    }
	  
  		//numero perfeito
	  public static boolean NumeroPerfeito(int numero) {
	        int somaDivisores = 0;
	        for (int i = 1; i <= numero / 2; i++) {
	            if (numero % i == 0) {
	                somaDivisores += i;
	            }
	        }
	        return somaDivisores == numero;
	    }
	  
  		//diminui vetor (nao consegui  fazer)
  		
  		//imprimir elementos (nao consegui  fazer)
    
}