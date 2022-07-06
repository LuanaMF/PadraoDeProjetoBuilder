package model;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;


public class Venda {
	
	private List<Item> itens;
	private BigDecimal valorDaCompra;
	private String pagamento;
	private Cliente cliente;
	private Date data;
	private Date horario;
	
	//construtor
	public Venda() {
		
	}
	// getters e setters
	public void setItens(List<Item> itens) {
		this.itens = itens;	
	}
	public void setPreco(BigDecimal preco) {
		this.valorDaCompra = preco;
	}
	public void setPagamento(String pagamento) {
		this.pagamento = pagamento;	
	}
	public List<Item> getItens() {
		return itens;
	}
	public BigDecimal getPreco() {
		return valorDaCompra;
	}
	public String getPagamento() {
		return pagamento;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	public void setData(Date data) {
		this.data = data;
	}
	
	public void setHorario(Date horario) {
		this.horario = horario;
	}
	public Date getData() {
		return data;
	}
	public Date getHorario() {
		return horario;
	}	
	@Override
	public  String toString(){
		SimpleDateFormat formataData = new SimpleDateFormat("dd/MM/yyyy");
		SimpleDateFormat formataDataHora = new SimpleDateFormat("HH:mm:ss");
		
        return   "\nData: " + formataData.format(getData()) + "\nHorario: " + formataDataHora.format(getHorario()) +
        		  "\nItens: \n" + getItens() + "\nTotal da compra: " + getPreco() +
        		"\nModo de pagamento: " + getPagamento();
        
	}
}	
