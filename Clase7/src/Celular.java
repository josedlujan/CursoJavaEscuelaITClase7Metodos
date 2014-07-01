
public class Celular {
	boolean teclado;
	String pantalla;
	String carrier;
	
	
	public void marcar(){
		System.out.println("marcando");
	}
	
	public void colgar(){
		System.out.println("colgar");
	}
	
	public void enviarMsg(){
		System.out.println("enviar");
	}
	
	public void PCarrier(){
		System.out.println(this.carrier);
	}
	
	public void PTeclado(){
		System.out.println(this.teclado);
	}
	
	public void PPantalla(){
		System.out.println(this.pantalla);
	}
	
	
}
