package exercicio4;

public class Lista {
	No inicio;
	No fim;
	
	// m�todo para inserir um elemento na lista.
	// a inser��o deve manter a lista ordenada (ordem crescente)
	public void inserir(int dado) {
		No aux = new No(dado);
		No aux2 = inicio;
		Boolean achou = false;
	
			if (inicio == null){
				inicio = aux;
				fim = aux;
			}else if (inicio.dir == null){
						if(aux.dado >= inicio.dado){
							inicio.dir = aux;
							fim = aux;
							fim.esq = inicio;
						}else{
							aux.dir = aux2;
							inicio = aux;						
							fim.esq = aux;
						}
	
					}else{					
						while (aux2 != null){
							if(aux.dado >= aux2.dado){
								aux2 = aux2.dir;
							}else{
								if(aux2.esq == null){
									aux.dir = inicio;
									inicio.esq = aux;
									inicio = aux;
									achou = true;
									break;
								}else{
									aux.esq = aux2.esq;
									aux.dir = aux2;
									aux.esq.dir = aux;							 
									aux2.esq = aux;	
									achou = true;
									break;
								}						
							}
						}
						if (achou == false){
							fim.dir = aux;
							aux.esq = fim;
							fim = aux;
						}					
					}				
	}
	
	// m�todo para imprimir os elementos da lista
	public void imprimir() {
		No aux = inicio;
		while(aux != null) {
			System.out.println(aux.dado);
			aux = aux.dir;
		}
	}
}
