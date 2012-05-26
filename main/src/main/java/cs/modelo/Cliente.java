package cs.modelo;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

@Entity
public class Cliente extends Persona {

	private static final long serialVersionUID = 1L;
	
	@NotNull
	private String facebook;
	
	@NotNull
	private String cuit;
	
	public String getFacebook() {
		return facebook;
	}

	public void setFacebook(String facebook) {
		this.facebook = facebook;
	}

	public String getCuit() {
		return cuit;
	}

	public void setCuit(String cuit) {
		this.cuit = cuit;
	}
}
