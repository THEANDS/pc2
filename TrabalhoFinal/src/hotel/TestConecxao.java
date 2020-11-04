package hotel;

import java.sql.Connection;

import controller.ClienteController;
import model.Cliente;



public class TestConecxao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 Connection con = (Connection) Conectabd.getConnection();
		 
		 if(con != null) { System.out.println("OK"); }else {
		 System.out.println("Erro");
		 }
		 
		 Cliente emp = new Cliente();
		 ClienteController controller = new ClienteController();
		 
		 emp.setnome("MariadaSilva");
		 emp.setrg("11111");
		 emp.setendereco("rua geraldo soares");
		 emp.setbairro("Novo horizonte");
		 emp.setcidade("alto paraiso");
		 emp.setdata(73770);
		 emp.settel("6134461875");
		 
		 System.out.println(controller.inserir(emp));
	}
	}