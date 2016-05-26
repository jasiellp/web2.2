package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto 
{
	
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
	@Column
	String nome;
	@Column
	double preco;
	
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public void setNome(String nome) 
	{
		this.nome = nome;
	}
	
	public void setPreco(double preco) 
	{
		this.preco = preco;
	}
	
	
	
	
	
}
