package Modelo;

/**
 * Representa um condutor de TVDE.
 * Contém informações de identificação, contactos e documentação obrigatória.
 */
public class Condutor {

    private String nome;
    private int id;
    private String cartaDeConducao;
    private int numSegurancaSocial;
    private int numIdentificacaoFiscal;
    private String numTelemovel;
    private String morada;

    /**
     * Cria uma nova instância de Models.Condutor.
     *
     * @param nome                  Nome completo do condutor.
     * @param id                    Identificador único do condutor.
     * @param cartaDeConducao       Número da carta de condução.
     * @param numSegurancaSocial    Número de Segurança Social.
     * @param numIdentificacaoFiscal Número de Identificação Fiscal (NIF).
     * @param numTelemovel          Contacto telefónico.
     * @param morada                Morada completa do condutor.
     *
     *
     */
    public Condutor(String nome, int id, String cartaDeConducao, int numSegurancaSocial,
                    int numIdentificacaoFiscal, String numTelemovel, String morada) {
        this.nome = nome;
        this.id = id;
        this.cartaDeConducao = cartaDeConducao;
        this.numSegurancaSocial = numSegurancaSocial;
        this.numIdentificacaoFiscal = numIdentificacaoFiscal;
        this.numTelemovel = numTelemovel;
        this.morada = morada;
    }

    /**
     * Obtém o nome do condutor.
     *
     * @return Nome completo.
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do condutor.
     *
     * @param nome Novo nome.
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Obtém o identificador único do condutor.
     *
     * @return ID do condutor.
     */
    public int getId() {
        return id;
    }

    /**
     * Define o identificador do condutor.
     *
     * @param id Novo ID.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Obtém o número da carta de condução.
     *
     * @return Carta de condução.
     */
    public String getCartaDeConducao() {
        return cartaDeConducao;
    }

    /**
     * Define o número da carta de condução.
     *
     * @param cartaDeConducao Nova carta de condução.   
     */
    public void setCartaDeConducao(String cartaDeConducao) {
        this.cartaDeConducao = cartaDeConducao;
    }

    /**
     * Obtém o número de Segurança Social.
     *
     * @return Número de Segurança Social.
     */
    public int getNumSegurancaSocial() {
        return numSegurancaSocial;
    }

    /**
     * Define o número de Segurança Social.
     *
     * @param numSegurancaSocial Novo número de Segurança Social.
     */
    public void setNumSegurancaSocial(int numSegurancaSocial) {
        this.numSegurancaSocial = numSegurancaSocial;
    }

    /**
     * Obtém o Número de Identificação Fiscal (NIF).
     *
     * @return NIF do condutor.
     */
    public int getNumIdentificacaoFiscal() {
        return numIdentificacaoFiscal;
    }

    /**
     * Define o NIF do condutor.
     *
     * @param numIdentificacaoFiscal Novo NIF.
     */
    public void setNumIdentificacaoFiscal(int numIdentificacaoFiscal) {
        this.numIdentificacaoFiscal = numIdentificacaoFiscal;
    }

    /**
     * Obtém o número de telemóvel do condutor.
     *
     * @return Telefone de contacto.
     */
    public String getNumTelemovel() {
        return numTelemovel;
    }

    /**
     * Define o número de telemóvel do condutor.
     *
     * @param numTelemovel Novo número de telemóvel.
     */
    public void setNumTelemovel(String numTelemovel) {
        this.numTelemovel = numTelemovel;
    }

    /**
     * Obtém a morada do condutor.
     *
     * @return Morada completa.
     */
    public String getMorada() {
        return morada;
    }

    /**
     * Define a morada do condutor.
     *
     * @param morada Nova morada.
     */
    public void setMorada(String morada) {
        this.morada = morada;
    }
}
