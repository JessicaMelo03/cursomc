package com.jessicamelo.cursomc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jessicamelo.cursomc.domain.Categoria;
import com.jessicamelo.cursomc.repositories.CategoriaRepository;
import com.jessicamelo.cursomc.services.exeption.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo; 
	
	public Categoria buscar(Integer id) {
		Categoria obj = repo.findOne(id);
		
		if(obj == null) {
			throw new ObjectNotFoundException("Objeto não encontrado Id:" + id +
					",Tipo: " + Categoria.class.getName());
		}
		return obj;
	}

}
