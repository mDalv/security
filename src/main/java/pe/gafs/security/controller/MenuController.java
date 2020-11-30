package pe.gafs.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pe.gafs.security.model.Menu;
import pe.gafs.security.model.api.UsuarioRequest;
import pe.gafs.security.service.IMenuService;

@RestController
@RequestMapping("/menus")
public class MenuController {

	@Autowired
	private IMenuService service;

	@GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Menu>> listar() {
		List<Menu> menues = service.listar();
		return new ResponseEntity<List<Menu>>(menues, HttpStatus.OK);
	}

	@PostMapping(value = "/usuario", consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Menu>> listar(@RequestBody UsuarioRequest request) {
		List<Menu> menues = service.listarMenuPorUsuario(request);
		return new ResponseEntity<List<Menu>>(menues, HttpStatus.OK);
	}

}
