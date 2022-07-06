package model;

import java.text.ParseException;

public class Main {
	public static void main(String[] args) throws ParseException {
		
		Venda venda = VendaBuilder.builder()
				.addNomeDoCliente("Julia")
				.addCpfDoCliente("12345678912")
				.addModoPagamento("Pix")
				.addDataHorario("05/07/2022", "12:23:53")
				.addEmailDoCliente("julia@gmail.com")
				.addTelefoneDoCliente("75992934560")
				.addItem("Macarrao", "Macarrao ao molho branco", "29.90", "Massas")
				.addItem("Coca cola", "Coca cola em lata", "4.00", "Bebidas")
				.getVenda();
		
		System.out.println(venda);

	}
}

