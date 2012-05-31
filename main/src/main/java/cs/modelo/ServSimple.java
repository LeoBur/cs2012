package cs.modelo;

@Entity
public class ServSimple extends TipoServicio {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Float precio; //Precio base al q se le agrega el resto de costos

	public Float getPrecio() {
		return precio;
	}

	public void setPrecio(Float precio) {
		this.precio = precio;
	}
	

}
