package pe.gafs.security.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@Table(name = "usuario")
public class Usuario {

	@Id
	private int idUsuario;

	@ManyToOne
	@JoinColumn(name = "id_app", nullable = false)
	private App app;

	@Column(name = "nombre", nullable = false)
	private String username;

	@Column(name = "clave", nullable = false)
	private String password;

	@Column(name = "estado", nullable = false)
	private boolean enabled;

	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "usuario_rol", joinColumns = @JoinColumn(name = "id_usuario", referencedColumnName = "idUsuario"), inverseJoinColumns = @JoinColumn(name = "id_rol", referencedColumnName = "idRol"))
	private List<Rol> roles;
}
