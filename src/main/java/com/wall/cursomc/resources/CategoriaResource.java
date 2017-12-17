package com.wall.cursomc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.wall.cursomc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {

	@RequestMapping(method = RequestMethod.GET)
	public List<Categoria> listar() {
		Categoria c1 = new Categoria();
		Categoria c2 = new Categoria(1,"Escritório");
		c1.setNome("Informática");
		List<Categoria> lista = new ArrayList<>();
		lista.add(c1);
		lista.add(c2);
		return lista;
	}
	
}
