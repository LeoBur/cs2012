package cs.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

import cs.Cuit;

@Entity
public class Cliente extends Persona {

	@NotNull
	private String facebook;
	@NotNull
	@Cuit
	private Int cuit;
}
