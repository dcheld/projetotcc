/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package org.br.sisgom.dao;

	import org.br.sisgom.bean.Servico;
	
// Start of user code for imports
// End of user code

/**
 * The documentation of the interface ServicoDAO.
 * 
 * @generated
 */
public interface ServicoDAO {
	/**
	 * The documentation of the method inserir.
	 * 
	 * @param entidade
	 * 
	 * @generated
	 */
	public void Inserir(Servico entidade);
	
	/**
	 * The documentation of the method alterar.
	 * 
	 * @param entidade
	 * 
	 * @generated
	 */
	public void Alterar(Servico entidade);
	
	/**
	 * The documentation of the method deletar.
	 * 
	 * @param codigo
	 * 
	 * @generated
	 */
	public void Deletar(Integer codigo);
	
	/**
	 * The documentation of the method obter.
	 * 
	 * @param codigo
	 * @return
	 * 
	 * @generated
	 */
	public Servico Obter(Integer codigo);
	
}