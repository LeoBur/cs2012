package cs.modelo;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente extends Persona {

	private static final long serialVersionUID = 1L;
	
	private String facebook;
	
	@NotNull
	private String cuil;
	
	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getCuil() {
		return cuil;
	}

	public void setCuil(String cuil) {
		this.cuil = cuil;
	}
}
