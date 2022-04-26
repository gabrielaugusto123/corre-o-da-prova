package correcao;
import java.util.Scanner; 
public class correcao {

	public static void main(String[] args) {
		int[] vetor = new int[10];
		int aux, soma=0, menor= 0, maior=0, dmaior=0, media= 0;
		Scanner ler = new Scanner(System.in);
			
		for(int i=0;i<10;i++){
			System.out.printf("Digite a nota #%d \n ",i+1);
			vetor[i]= ler.nextInt();	
		}
		//ordenação de vetor simples
		for(int i=0; i<10; i++){
			for(int j=0; j<9; j++){
				if(vetor[j]> vetor[j+1]){
						aux = vetor[j];
						vetor[j] = vetor[j+1];
						vetor[j+1] = aux;
				}
			}
		}
			
		for (int i=0; i<10; i++) {
			 soma = soma + vetor[i];

			 if (vetor[i] < menor)
			     menor = vetor[i];

			 if (vetor[i] > maior) {
			    	  maior = vetor[i];
			    	 
			 }
			         
			   soma=soma+vetor[i]; 
			   media=soma/10;	
			      
			    }
			
			 
			System.out.println("A menor nota e :" + menor);
			System.out.println("A 1ª maior nota e :" + vetor[9]);
			System.out.println("A 2ª maior nota e :" + vetor[8]);
			System.out.println("A 3ª maior nota e :" + vetor[7]);
			System.out.println("A media da notas e :" + media);
				
	}

}
