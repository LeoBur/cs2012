package cs.modelo;

import java.util.Calendar;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2012-05-27T20:36:13.891-0300")
@StaticMetamodel(Persona.class)
public class Persona_ {
	public static volatile SingularAttribute<Persona, Long> id;
	public static volatile SingularAttribute<Persona, Long> dni;
	public static volatile SingularAttribute<Persona, String> nombre;
	public static volatile SingularAttribute<Persona, String> domicilio;
	public static volatile SingularAttribute<Persona, String> email;
	public static volatile SingularAttribute<Persona, Calendar> fechaNac;
	public static volatile SingularAttribute<Persona, Long> telefono;
	public static volatile SingularAttribute<Persona, String> sexo;
}
