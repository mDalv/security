package pe.gafs.security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import pe.gafs.security.model.Usuario;

@Repository
public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	Usuario findOneByUsername(String username);

	@Query(value = "SELECT * from Usuario us WHERE us.nombre = :username AND us.id_app = :app ", nativeQuery = true)
	Usuario findUsuario(@Param("username") String username, @Param("app") String app);

	@Transactional
	@Modifying
	@Query("UPDATE Usuario us SET us.password = :clave WHERE us.username = :nombre")
	void cambiarClave(@Param("clave") String clave, @Param("nombre") String nombre);
}