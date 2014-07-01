
public class MetodosS {

	public void sumar(){
		System.out.println("No puedo sumar no me diste numeros");
	}
	
	public void sumar(int numero){
		System.out.println("No puedo sumar porque solo tengo 1 dato");
	}
	
	public void sumar(int numero, int numero2){
		int resultado;
		resultado = numero+numero2;
		System.out.println("El resultado es: "+resultado);
	}

	
	
	public static void main(String[] argumentos){
		MetodosS metodoss = new MetodosS();
		metodoss.sumar();
		metodoss.sumar(2);
		metodoss.sumar(2,2);
	}
	
}
