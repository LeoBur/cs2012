package cs.modelo;

import java.io.Serializable

@Entity
public class Unidad implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long nroUnidad;
	private String descripcion;
	@NotNull
	private Long volumenMax; // Volumen de la caja de carga
	private Long capacidadMax // En kg de carga
	private String posicion; // Se guarda la latitud y longitud dos numeros reales con 6 decimales y signo separados con coma
	

}
