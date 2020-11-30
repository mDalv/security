package pe.gafs.security.model.api;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class UsuarioRequest {

	private String nombre;
	private String app;
}
