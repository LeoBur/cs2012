package cs.modelo;

import java.io.Serializable;
import java.util.Calendar;

@Entity
public class Persona implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private Long dni;
	@NotNull
	private String nombre;
	private String domicilio;
	@Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\."
	        +"[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@"
	        +"(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?",
	        message="{invalid.email}")
	private String email;
	private Calendar fechaNac;
	private Long telefono;
	private String sexo;
}
