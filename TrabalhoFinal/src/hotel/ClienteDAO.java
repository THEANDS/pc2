package hotel;
import java.util.List;
import model.Cliente;

public interface ClienteDAO {
	public String inserir(Cliente emp);
	public String alterar(Cliente emp);
	public String excluir(Cliente emp);
	public List<Cliente> listarTodos();
	public Cliente pesquisarPorRg(String rg);
}
