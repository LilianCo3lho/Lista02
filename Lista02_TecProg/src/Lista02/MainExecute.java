//Ana Lilian Sousa Coelho - 556697
package Lista02;

public class MainExecute {

	public static void main(String[] args) {
		//popular vetor
		int vet[] = new int[10];
		for(int i = 2; i < 8 ;i++) {
			vet [i] = i + 1;
		}
		
		//soma
		Utilidades somas = new Utilidades();
		somas.Somatorio(vet);
		System.out.println("Somatorio: "+ somas.Somatorio(vet));
		
		//par
		System.out.println("Numeros pares: ");
		Utilidades.Pares(vet);
		
		//Media
		int vet1[] = {1,2,3,4,5,6,7,8,9,10};
		int vet2[] = {3,4,5,6,7,2,9,10,12,15};
		
		Utilidades media = new Utilidades();
		System.out.println("\nMedia: "+ media.Media(vet1, vet2));
		
		
		//media ponderada
		int notas[] = {5,7,9};
		int pesos[] = {1,2,3};
		System.out.println("Media Ponderada: " + Utilidades.MediaPonderada(notas, pesos));
		
		
		//contagem de elementos
		Utilidades QuantElementos = new Utilidades();
		int num = 4;
		System.out.println("Quantidades de elementos\n" + "4 -> " + QuantElementos.QuantidadeElementos(vet1,vet2,num));
		
		//copia de vetor
		System.out.println("Copia do vet1:" + Utilidades.CopiaVetor(vet1));
		
		//Ordenaçao Crescente
		System.out.println("Vetor Ordenado:" + Utilidades.Crescente(vet2));
		
		//verificacao de ordenacao
		System.out.println("Ordenaçao vet1:" + Utilidades.estaOrdenado(vet1));
		System.out.println("Ordenaçao vet2:" + Utilidades.estaOrdenado(vet2));
		
		//K-ésimo maior valor
		int k = 5;
		System.out.println("K-ésimo maior valor: " + Utilidades.kEsimoMaior(vet1, k));
		
		//K-ésimo menor valor
		System.out.println("K-ésimo maior valor: " + Utilidades.kEsimoMenor(vet1, k));
	
		//igualdade
		System.out.println("Vet1 e Vet2 iguais?\n " + Utilidades.Iguais(vet1, vet2));
		
		
		//potenciaçao
		
		//primo
		System.out.println("K eh primo?\n " + Utilidades.Primo(k));
		
		
		//busca por ocorrencia
		
		//remoçao de elemento
		
		//verificaçao de palindromo
		String Palavra = "ana";
		System.out.println(Palavra + "->" + Utilidades.Palindromo(Palavra));
		
		
		//verificaçao primo
		System.out.println(k + "->" + Utilidades.VerificaçaoPrimo(k));
		
		//string inverso
		String Palavra2 = "biscoito"
		System.out.println(Palavra2 + "->" + Utilidades.inverterString(Palavra2));
		
		//juros compostos
		double principal = 1000;
		double taxa = 0.05;
		int periodos = 3;
		System.out.println(principal + taxa + periodos + "->" + Utilidades.jurosCompostos(principal, taxa, periodos));
		
		//numero perfeito
		System.out.println(k + "->" + Utilidades.NumeroPerfeito(k));
		//diminui vetor
		
		//imprimir elementos
	}

}
