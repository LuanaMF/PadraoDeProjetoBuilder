package model;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class VendaBuilder {
	
	private Venda venda;
    private Cliente cliente;
    private List<Item> itens = new ArrayList<Item>();
    private BigDecimal valorCompra = new BigDecimal("0");

   
    public VendaBuilder() {
        this.venda = new Venda();
        this.cliente = new Cliente();
    }
    
    public static VendaBuilder builder() {
        return new VendaBuilder();
    }

    public VendaBuilder addDataHorario(String data, String hora){
    	SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formataDataHora = new SimpleDateFormat("HH:mm:ss");
		Date dataDate = new Date();
		Date horaDate = new Date();
		try {
			dataDate = formataData.parse(data);
			horaDate = formataDataHora.parse(hora);
		} catch (ParseException e) {
			e.printStackTrace();
		}
        
		this.venda.setData(dataDate);
		this.venda.setHorario(horaDate);
        return this;
    }
    public VendaBuilder addModoPagamento(String pagamento){
    	this.venda.setPagamento(pagamento);
    	return this;
    }
    public VendaBuilder addNomeDoCliente(String nome) {
    	this.cliente.setNome(nome);
    	return this;
    }
    
    public VendaBuilder addCpfDoCliente(String cpf) {
    	this.cliente.setCpf(cpf);
    	return this;
    }
    public VendaBuilder addEmailDoCliente(String email) {
    	this.cliente.setEmail(email);
    	return this;
    }
    public VendaBuilder addTelefoneDoCliente(String telefone) {
    	this.cliente.setTelefone(telefone);
    	return this;
    }
    
    public VendaBuilder addItem(String nome, String descricao, String valor, String categoria) {
    	BigDecimal valorBD = new BigDecimal(valor);
    	this.itens.add(new Item(nome, descricao, valorBD, categoria));
    	this.valorCompra.add(valorBD);
    	return this;
    }
    
    public Venda getVenda() {
    	this.venda.setCliente(cliente);
    	this.venda.setItens(itens);
    	BigDecimal valorBD = new BigDecimal("33.90");
    	this.venda.setPreco(valorBD);
    	return this.venda;
    }
}
