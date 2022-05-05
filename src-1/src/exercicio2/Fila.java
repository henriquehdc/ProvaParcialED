package exercicio2;

public class Fila {

	No inicio, fim;
	
	// m�todo para inserir um elemento no final da fila (enfileirar)
	public void enfileirar(Motorista motorista) {
		No aux = new No(motorista);
		if(inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	// m�todo para desenfileirar um elemento da fila, ou seja, remover o primeiro elemento
	public void desenfileirar() {

		if(inicio == null){
			System.out.println("Não existem mais motoristas para desenfileirar");
		}else{
			if(inicio.dir == null){
				inicio = null;
			}else{
				inicio = inicio.dir;
				inicio.esq = null;
			}		
		}			
	}
	
	// m�todo para exibir os dados (nome e placa) dos motoristas
	public void mostrarDados() {
		No aux = inicio;
		if(aux == null){
			System.out.println("Não existem mais veiculos na fila");
		}else{
			while(aux != null){
				System.out.println("Motorista: " +aux.motorista.getNome() +", Placa: " +aux.motorista.getPlaca());
				aux = aux.dir;
			}
		}
	}
}
