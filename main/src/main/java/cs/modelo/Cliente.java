package cs.modelo;

import java.io.Serializable;
import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private Long dni;	

	private String nombre;
	private String domicilio;
	private String email;
	private Calendar fechaNac;
	private Long telefono;
	private String sexo;
}
