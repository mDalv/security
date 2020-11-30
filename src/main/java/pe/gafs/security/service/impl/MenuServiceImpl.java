package pe.gafs.security.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gafs.security.model.Menu;
import pe.gafs.security.model.api.UsuarioRequest;
import pe.gafs.security.repository.IMenuDAO;
import pe.gafs.security.service.IMenuService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


@Service
public class MenuServiceImpl implements IMenuService {

	@Autowired
	private IMenuDAO dao;

	@Override
	public void registrar(Menu menu) {
		dao.save(menu);
	}

	@Override
	public void modificar(Menu menu) {
		dao.save(menu);
	}

	@Override
	public void eliminar(int idMenu) {
		//2
		dao.deleteById(idMenu);
	}

	@Override
	public Menu listarId(int idMenu) {
		//2
		Optional<Menu> opt = dao.findById(idMenu);
		return opt.orElseGet(Menu::new);
	}

	@Override
	public List<Menu> listar() {
		return dao.findAll();
	}

	@Override
	public List<Menu> listarMenuPorUsuario(UsuarioRequest request) {
		List<Menu> menus = new ArrayList<>();

		dao.listarMenuPorUsuario(request.getNombre(), request.getApp()).forEach(x -> {

			Menu m = new Menu();
			m.setIdMenu((Integer.parseInt(String.valueOf(x[0]))));
			m.setIcono(String.valueOf(x[1]));
			m.setNombre(String.valueOf(x[2]));
			m.setUrl(String.valueOf(x[3]));
			menus.add(m);
		});
		return menus;			
	}

}
