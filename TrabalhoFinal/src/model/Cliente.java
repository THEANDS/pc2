package model;

public class Cliente {
	
	private String nome;
	private String rg;
	private String endereco;
	private String bairro;
	private String cidade;
	private String CEP;
	private Integer data;
	private String tel;
	
	public Cliente() {}

	public String getrg() {
		return rg;
	}
	public void setrg(String rg) {
		this.rg = rg;
	}
	public String getnome() {
		return nome;
	}
	
	public void setnome(String nome) {
		this.nome = nome;
	}

	public void setendereco(String endereco) {
		this.endereco = endereco;
	}
	public String getendereco() {
		return endereco;
	}
	public void setbairro(String bairro) {
		this.bairro = bairro;
	}
	public String getbairro() {
		return bairro;
	}
	public void setcidade(String cidade) {
		this.cidade = cidade;
	}
	public String getcidade() {
		return cidade;
	}
	public void setCEP(String CEP) {
		this.CEP = CEP;
	}
	public String getCEP() {
		return CEP;
	}
	
	public void setdata(Integer data) {
		this.data = data;
	}
	public Integer getdata() {
		return data;
	}
	
	public void settel(String tel) {
		this.tel = tel;
	}
	public String gettel() {
		return tel;
	}

	
	//get/set
	

}
