/**
 * Generated by Acceleo 3
 * All rights reserved.
 */
package org.br.sisgom.dao;

	import org.br.sisgom.bean.Fornecedor;
	

// Start of user code for imports

// End of user code

/**
 * The documentation of the interface FornecedoDAO.
 * 
 * @generated
 */
public interface FornecedoDAO {
	/**
	 * The documentation of the method inserir.
	 * 
	 * @param entidade
	 * 
	 * @generated
	 */
	public void inserir(Fornecedor entidade);
	
	/**
	 * The documentation of the method alterar.
	 * 
	 * @param entidade
	 * 
	 * @generated
	 */
	public void alterar(Fornecedor entidade);
	
	/**
	 * The documentation of the method deletar.
	 * 
	 * @param codigo
	 * 
	 * @generated
	 */
	public void deletar(Integer codigo);
	
	/**
	 * The documentation of the method obter.
	 * 
	 * @param codigo
	 * @return
	 * 
	 * @generated
	 */
	public Fornecedor obter(Integer codigo);
	
}
