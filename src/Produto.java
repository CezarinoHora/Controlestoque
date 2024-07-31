/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cezarino Hora
 */
public class Produto {
	private String Descricao;
	private int Quantidade;
	private int Codigo;
	
	public Produto(String descricao, int codigo) {
		this.Descricao = descricao;
		this.Codigo = codigo;
		this.Quantidade = 0;
	}
	
	public void setDescricao(String novaDescricao) {
		this.Descricao = novaDescricao;
	}
	
	public String getDescricao() {
		return this.Descricao;
	}
	
	public void setCodigo(int novoCodigo) {
		this.Codigo = novoCodigo;
	}
	
	public int getCodigo() {
		return this.Codigo;
	}
	
	public void setQuantidade(int novaQuantidade) {
		this.Quantidade = novaQuantidade;
	}
	
	public int getQuantidade() {
		return this.Quantidade;
	}
	
}
