package pe.gafs.security.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import pe.gafs.security.model.Usuario;
import pe.gafs.security.repository.IUsuarioDAO;

import java.util.ArrayList;
import java.util.List;

import static pe.gafs.security.util.Constants.NO_USER;


@Service("userDetailsService")
public class UserServiceImpl implements UserDetailsService {

	@Autowired
	private IUsuarioDAO userDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
//		Usuario user = userDAO.findOneByUsername(username);

		Usuario user = userDAO.findUsuario(username.substring(0, username.indexOf("-"))
				, username.substring(username.indexOf("-") + 1));

		if (user == null) {
			throw new UsernameNotFoundException(String.format(NO_USER, username));
		}

		List<GrantedAuthority> authorities = new ArrayList<>();
		user.getRoles().forEach(role -> {
			authorities.add(new SimpleGrantedAuthority(role.getNombre()));
		});

		return new User(user.getUsername(), user.getPassword(), user.isEnabled(), true,
				true, true, authorities);
	}
}