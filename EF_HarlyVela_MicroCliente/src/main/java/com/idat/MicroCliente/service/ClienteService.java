package com.idat.MicroCliente.service;

import java.util.List;

import com.idat.MicroCliente.model.Cliente;

public interface ClienteService {
	
	List<Cliente> listar();
	Cliente obtenerId(Integer id);
	void guardar(Cliente cliente);
	void eliminar(Integer id);
	void actualizar(Cliente cliente);

}
