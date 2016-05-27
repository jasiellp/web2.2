package com.hiber.teste;

import com.hiber.model.Produto;
import com.hiber.util.Util;
 

public class TestaInsereProduto
{

	public static void main(String[] args)
	{
		 

		Produto p = new Produto();
		p.setNome("p De Borracha");
		p.setPreco(12999.23);

		Util.insert(p);
	}
}
