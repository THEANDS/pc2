package controller;

import java.util.List;
import model.Cliente;
import hotel.ClienteDAOImp;

public class ClienteController {
	
	public String inserir(Cliente emp){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.inserir(emp);
	}

	public String alterar(Cliente emp){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.alterar(emp);
	}

	public String excluir(Cliente emp){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.excluir(emp);
	}

	public List<Cliente>  listarTodos(){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.listarTodos();
	}

	public Cliente pesquisarPorRg(String rg){
		ClienteDAOImp dao = new ClienteDAOImp();
		return dao.pesquisarPorRg(rg);
	}
}
	
	
