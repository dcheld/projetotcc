/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package org.eclipse.acceleo.sisgom.uml2java.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

// Start of user code for imports
// End of user code
@Entity
@Table(name="Veiculo")
public  class VeiculoEntitty {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String chassi;
	private int ano;
	private String modelo;
	private String cor;
	
	@ManyToOne
	@JoinColumn(name = "Cliente_Id", insertable = true, nullable = false, updatable = true)
	private ClienteEntity cliente;
	
	public VeiculoEntitty(String chassi, int ano, String modelo, String cor, ClienteEntity cliente) {
		super();
		this.chassi = chassi;
		this.ano = ano;
		this.modelo = modelo;
		this.cor = cor;
		this.cliente = cliente;
	}
	
	public VeiculoEntitty() {
		super();
	}
	
	public String getChassis() {
		return this.chassi;
	}
	
	public void setChassis(String chassis) {
		this.chassi = chassis;
	}
	
	public int getAno() {
		return this.ano;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getModelo() {
		return this.modelo;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public String getCor() {
		return this.cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public ClienteEntity getCliente() {
		return cliente;
	}

	public void setCliente(ClienteEntity cliente) {
		this.cliente = cliente;
	}
}
