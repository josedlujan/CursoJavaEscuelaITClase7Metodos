
public class Metodos {
	int x,y,z;
	
	public Metodos(){
		this.x=1;
		this.y=1;
		this.z=1;
	}
	
	public void sumar(){
		this.x=this.x+1;
		System.out.println("El valor de mi x es: "+this.x);
	}
	
	public void sumarParametro(int numero){
		int numeroR = numero+10;
		System.out.println("Pasas el numero"+numero+"pero yo le sume 10  y ahora es"+numeroR);
	
	}
	
	public  int multiplicar(int numero){
		int numeroR = numero*numero;
		return numeroR;
	}
	
	public  static void  main(String[] argumentos){
		Metodos metodos = new Metodos();
	
		metodos.multiplicar(2);
		//System.out.println(metodos.multiplicar(2));
	}
}
