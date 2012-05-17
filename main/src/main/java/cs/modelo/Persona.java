package cs.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Calendar;

@Entity
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	private Long dni;
	private String nombre;
	private String domicilio;
	private String eMail;
	private Calendar fechaNac;
	private Long telefono;
	private String sexo;
}
