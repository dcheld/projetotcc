/**
 * Generated with MTL UML 2 Java example
 */
package br.com.sisgom.bean;

// Start of user code for imports
import java.util.*;
// End of user code

/**
 * @author MTL
 */
public class Servico {
    /**
     * the Valor attribute.
     */
    private double Valor;
    /**
     * the Codigo attribute.
     */
    private int Codigo;
    /**
     * the Funcionario attribute.
     */
    private Funcionario Funcionario;
    /**
     * the Nome attribute.
     */
    private String Nome;
    /**
     * the TipoCobranca attribute.
     */
    private TipoCobrancao TipoCobranca;
    /**
     * the Valor getter.
     * @return the Valor.
     */
    public double getValor() {
        return this.Valor;
    }

    /**
     * the Valor setter.
     * @param p_Valor the Valor to set.
     */
    public void setValor(double p_Valor) {
        this.Valor = p_Valor;
    }
    /**
     * the Codigo getter.
     * @return the Codigo.
     */
    public int getCodigo() {
        return this.Codigo;
    }

    /**
     * the Codigo setter.
     * @param p_Codigo the Codigo to set.
     */
    public void setCodigo(int p_Codigo) {
        this.Codigo = p_Codigo;
    }
    /**
     * the Funcionario getter.
     * @return the Funcionario.
     */
    public Funcionario getFuncionario() {
        return this.Funcionario;
    }

    /**
     * the Funcionario setter.
     * @param p_Funcionario the Funcionario to set.
     */
    public void setFuncionario(Funcionario p_Funcionario) {
        this.Funcionario = p_Funcionario;
    }
    /**
     * the Nome getter.
     * @return the Nome.
     */
    public String getNome() {
        return this.Nome;
    }

    /**
     * the Nome setter.
     * @param p_Nome the Nome to set.
     */
    public void setNome(String p_Nome) {
        this.Nome = p_Nome;
    }
    /**
     * the TipoCobranca getter.
     * @return the TipoCobranca.
     */
    public TipoCobrancao getTipoCobranca() {
        return this.TipoCobranca;
    }

    /**
     * the TipoCobranca setter.
     * @param p_TipoCobranca the TipoCobranca to set.
     */
    public void setTipoCobranca(TipoCobrancao p_TipoCobranca) {
        this.TipoCobranca = p_TipoCobranca;
    }
    /**
     * the Servicos attribute.
     */
    private List<Servico> Servicos;
}
