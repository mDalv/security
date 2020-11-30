package pe.gafs.security;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import pe.gafs.security.model.App;
import pe.gafs.security.model.Usuario;
import pe.gafs.security.repository.IUsuarioDAO;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SecurityApplicationTests {

	@Autowired
	private IUsuarioDAO dao;

	@Autowired
	private BCryptPasswordEncoder bcrypt;

	@Test
	public void createUser() {
		Usuario user = new Usuario();
		user.setIdUsuario(6);
		user.setUsername("Gabo");
		user.setApp(new App());
		user.setPassword(bcrypt.encode("idata_$"));
		System.out.println(user.getPassword());
		user.setEnabled(true);

		Usuario verifyUser = dao.save(user);
		assertTrue(verifyUser.getPassword().equalsIgnoreCase(user.getPassword()));
	}

}
