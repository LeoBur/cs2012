package cs.modelo;

@Entity
public class Promociones extends TipoServicio {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private Float tasa; // Tasa de descuento entre 0 y 1

	public Float getTasa() {
		return tasa;
	}

	public void setTasa(Float tasa) {
		this.tasa = tasa;
	}

}
