package cs.modelo;

import java.io.Serializable;

@Entity
public class TipoServicio implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	private Long nroServicio;
	public Long getNroServicio() {
		return nroServicio;
	}
	public void setNroServicio(Long nroServicio) {
		this.nroServicio = nroServicio;
	}
	public String getDescrip() {
		return descrip;
	}
	public void setDescrip(String descrip) {
		this.descrip = descrip;
	}
	@NotNull
	private String descrip;
	
	
}
