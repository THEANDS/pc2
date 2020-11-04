package hotel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Cliente;


public class ClienteDAOImp implements ClienteDAO {

	@Override
	public String inserir(Cliente emp) {
		String sql = "insert into cliente(cpf,nome,idade,salario) values(?,?,?,?)";
		Connection con = Conectabd.getConnection();
		try{
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,emp.getnome());
			pst.setString(2,emp.getrg());
			pst.setString(3,emp.getendereco());
			pst.setString(4,emp.getbairro());
			pst.setString(5,emp.getcidade());
			pst.setInt(6,emp.getdata());
			pst.setString(7,emp.gettel());
			
			int res = pst.executeUpdate();
			if(res>0){
				return "Inseridocomsucesso.";
			}
			else{
				return"Erroaoinserir.";
				}
			}
		catch(SQLException e){
			return e.getMessage();
		}
		finally{Conectabd.close(con);
		}

}

	@Override
	public String alterar(Cliente emp) {
		String sql = "update Cliente set nome=?,idade=?,salario=? where cpf=?";

		Connection con = Conectabd.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1,emp.getnome());
			pst.setString(2,emp.getrg());
			pst.setString(3,emp.getendereco());
			pst.setString(4,emp.getbairro());
			pst.setString(5,emp.getcidade());
			pst.setInt(6,emp.getdata());
			pst.setString(7,emp.gettel());

			int res = pst.executeUpdate();

			if (res > 0) {
				return "Alterado com sucesso.";
			} else {
				return "Erro ao alterar.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			Conectabd.close(con);
		}
	}

	@Override
	public String excluir(Cliente emp) {
		String sql = "delete from Cliente where cpf=?";
		Connection con = Conectabd.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);

			pst.setString(1, emp.getrg());
			int res = pst.executeUpdate();

			if (res > 0) {
				return "Excluído com sucesso.";
			} else {
				return "Erro ao excluir.";
			}
		} catch (SQLException e) {
			return e.getMessage();
		} finally {
			Conectabd.close(con);
		}
	}

	@Override
	public List<Cliente> listarTodos() {
		String sql = "select * from Cliente";
		Connection con = Conectabd.getConnection();
		List<Cliente> lista = new ArrayList<>();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			ResultSet rs = pst.executeQuery();
			if (rs != null) {
				while (rs.next()) {
					Cliente ep = new Cliente();
					ep.setnome(rs.getString(1));
					ep.setrg(rs.getString(2));
					ep.setendereco(rs.getString(3));
					ep.setbairro(rs.getString(4));
					ep.setcidade(rs.getString(5));
					ep.setdata(rs.getInt(6));
					ep.settel(rs.getString(7));
					lista.add(ep);
				}
				return lista;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		} finally {
			Conectabd.close(con);
		}
	}

	@Override
	public Cliente pesquisarPorRg(String rg) {
		String sql = "select * from Cliente where cpf=?";
		Connection con =  Conectabd.getConnection();
		try {
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, rg);
			ResultSet rs = pst.executeQuery();
			if (rs.next()) {
				Cliente ep = new Cliente();
				ep.setnome(rs.getString(1));
				ep.setrg(rs.getString(2));
				ep.setendereco(rs.getString(3));
				ep.setbairro(rs.getString(4));
				ep.setcidade(rs.getString(5));
				ep.setdata(rs.getInt(6));
				ep.settel(rs.getString(7));
				return ep;
			} else {
				return null;
			}
		} catch (SQLException e) {
			return null;
		} finally {
			 Conectabd.close(con);
		}
	}
	}
	
	



