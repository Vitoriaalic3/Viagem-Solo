package Aplicacao;

import DAO.AgenciaDAO;
import modelo.Agencia;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agencia agencia=new Agencia();
		agencia.setNome("Alice");
		agencia.setEndereco("Rua dos Alfeneiros, numero 4. Rio de Janeiro, Brasil");
		
		AgenciaDAO agenciaDao=new AgenciaDAO();
		agenciaDao.save(agencia);
	}

}
