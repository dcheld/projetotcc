/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package org.br.sisgom.bean;

    import java.util.*;
	

// Start of user code for imports

// End of user code

public abstract class PessoaBase {
	/**
	 * The documentation of the attribute id.
	 * 
	 * @generated
	 */
	private Integer id;
	
	/**
	 * The documentation of the attribute cPFouCNPJ.
	 * 
	 * @generated
	 */
	private String cPFouCNPJ;
	
	/**
	 * The documentation of the attribute nome.
	 * 
	 * @generated
	 */
	private String nome;
	
	/**
	 * The documentation of the attribute endereco.
	 * 
	 * @generated
	 */
	private List<Endereco> endereco;
	
	/**
	 * The documentation of the attribute contato.
	 * 
	 * @generated
	 */
	private List<Contato> contato;
	
	
	/**
	 * The documentation of the constructor.
	 * 
	 * @generated
	 */
	public PessoaBase() {
		super();
	}
	
	
	/**
	 * The documentation of the getter getId.
	 * 
	 * @generated
	 */
	public Integer getId() {
		return this.id;
	}
	
	/**
	 * The documentation of the setter setId.
	 * 
	 * @generated
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * The documentation of the getter getCPFouCNPJ.
	 * 
	 * @generated
	 */
	public String getCPFouCNPJ() {
		return this.cPFouCNPJ;
	}
	
	/**
	 * The documentation of the setter setCPFouCNPJ.
	 * 
	 * @generated
	 */
	public void setCPFouCNPJ(String cPFouCNPJ) {
		this.cPFouCNPJ = cPFouCNPJ;
	}
	/**
	 * The documentation of the getter getNome.
	 * 
	 * @generated
	 */
	public String getNome() {
		return this.nome;
	}
	
	/**
	 * The documentation of the setter setNome.
	 * 
	 * @generated
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}
	/**
	 * The documentation of the getter getEndereco.
	 * 
	 * @generated
	 */
	public List<Endereco> getEndereco() {
		return this.endereco;
	}
	
	/**
	 * The documentation of the setter setEndereco.
	 * 
	 * @generated
	 */
	public void setEndereco(List<Endereco> endereco) {
		this.endereco = endereco;
	}
	/**
	 * The documentation of the getter getContato.
	 * 
	 * @generated
	 */
	public List<Contato> getContato() {
		return this.contato;
	}
	
	/**
	 * The documentation of the setter setContato.
	 * 
	 * @generated
	 */
	public void setContato(List<Contato> contato) {
		this.contato = contato;
	}
	
}
