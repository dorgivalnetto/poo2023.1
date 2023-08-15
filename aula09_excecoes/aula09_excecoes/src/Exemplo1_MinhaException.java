// A classe MinhaException herda de alguma 
// classe na hierarquia de Throwable

public class Exemplo1_MinhaException extends RuntimeException{
	
	public Exemplo1_MinhaException(String msg) {
		super(msg);
	}
}
