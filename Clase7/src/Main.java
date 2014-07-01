
public class Main {

	public static void main(String[] argumentos){
		Iphone movil1 = new Iphone("AT&T");
	
		Android movil2 = new Android("telcel", "500x600");
		Blackberry movil3 = new Blackberry("telefonica");
	 
		movil1.PCarrier();
		movil1.PPantalla();
		movil2.PPantalla();
	}
	
}
