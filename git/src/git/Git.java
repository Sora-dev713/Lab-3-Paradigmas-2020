package git;

public class Git {
	//atributos
	String author;
	String fecha;
	String nombreProyecto;	
	Zonas zonas;
	
	public void gitInit(String auth, String nombre){
		this.author = auth;
		this.nombreProyecto = nombre;
		this.fecha = "aun en desarrollo";
		this.zonas = new Zonas();
		
	}
	
}
