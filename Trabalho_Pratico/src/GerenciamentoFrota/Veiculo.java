package GerenciamentoFrota;

//import java.util.Scanner;

public class Veiculo {
	
	private String marca;
	private String modelo;
	private String anoFabricacao;
	private String numeroFabricacao;
	private float capacidadeTanque;
	
	public Veiculo() {
		
	}
	
	public Veiculo(String marca, String modelo, String anoFabricacao, String numeroFabricacao, float capacidadeTanque) {
		this.marca = marca;
		this.modelo = modelo;
		this.anoFabricacao = anoFabricacao;
		this.numeroFabricacao = numeroFabricacao;
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getAnoFabricacao() {
		return anoFabricacao;
	}
	public void setAnoFabricacao(String anoFabricacao) {
		this.anoFabricacao = anoFabricacao;
	}
	public String getNumeroFabricacao() {
		return numeroFabricacao;
	}
	public void setNumeroFabricacao(String numeroFabricacao) {
		this.numeroFabricacao = numeroFabricacao;
	}
	public float getCapacidadeTanque() {
		return capacidadeTanque;
	}
	public void setCapacidadeTanque(float capacidadeTanque) {
		this.capacidadeTanque = capacidadeTanque;
	}
	
	public void cadastrar() {
		
	}
	
	public void pesquisar(String numeroCadastro) {
		
	}
	
	public void atualizar() {
		
	}
	
	public void apagar() {
		
	}
	
}
