package Modelo;

/**
 * Representa um cliente que utiliza o serviço de TVDE.
 * Contém dados de identificação, contacto e morada.
 */
public class Cliente {

    private String nome;
    private String morada;
    private String numTelemovel;
    private int numIdentificacaoFiscal;

    /**
     * Cria uma nova instância de Models.Cliente.
     *
     * @param nome                   Nome completo do cliente.
     * @param morada                 Morada do cliente.
     * @param numTelemovel           Número de telemóvel para contacto.
     * @param numIdentificacaoFiscal Número de Identificação Fiscal (NIF) do cliente.
     */
    public Cliente(String nome, String morada, String numTelemovel, int numIdentificacaoFiscal) {
        this.nome = nome;
        this.morada = morada;
        this.numTelemovel = numTelemovel;
        this.numIdentificacaoFiscal = numIdentificacaoFiscal;
    }

    /**
     * Obtém o nome do cliente.
     *
     * @return Nome completo.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do cliente.
     *
     * @param nome Novo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém a morada do cliente.
     *
     * @return Morada completa.
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Define a morada do cliente.
     *
     * @param morada Nova morada.
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }

    /**
     * Obtém o número de telemóvel do cliente.
     *
     * @return Número de telemóvel.
     */
    public String getNumTelemovel() {
        return numTelemovel;
    }

    /**
     * Define o número de telemóvel do cliente.
     *
     * @param numTelemovel Novo número de telemóvel.
     */
    public void setNumTelemovel(String numTelemovel) {
        this.numTelemovel = numTelemovel;
    }

    /**
     * Obtém o Número de Identificação Fiscal (NIF).
     *
     * @return NIF do cliente.
     */
    public int getNumIdentificacaoFiscal() {
        return numIdentificacaoFiscal;
    }

    /**
     * Define o Número de Identificação Fiscal do cliente.
     *
     * @param numIdentificacaoFiscal Novo NIF.
     */
    public void setNumIdentificacaoFiscal(int numIdentificacaoFiscal) {
        this.numIdentificacaoFiscal = numIdentificacaoFiscal;
    }
}
