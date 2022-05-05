package exercicio3;

public class Main {
	public static void main(String[] args) {
		
		Lista lista = new Lista();
		
		// inser��o dos elementos na lista
		lista.inserir(1);
		lista.inserir(2);
		lista.inserir(3);
		lista.inserir(4);
		lista.inserir(5);
		
		// inverte os elementos da lista
		inverter(lista);
	
		
		// imprime os elementos da lista
		lista.imprimir();

	}
	
	public static void inverter(Lista lista) {
		No aux = lista.fim;
		lista.inicio= aux;
		No aux2 = null;

			while(aux != null){
				if(aux.esq == null){
					lista.fim = aux;					
				}
					if(aux.dir == null){
						aux2 = aux.esq;
						aux.dir = aux.esq;
						aux.esq = null;
						aux = aux2;			
					}else{
						aux2 = aux.dir;
						aux.dir = aux.esq;
						aux.esq = aux2;
						aux = aux.dir;
					}

			}	
			
			
	}
}
