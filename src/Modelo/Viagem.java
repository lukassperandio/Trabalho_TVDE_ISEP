package Modelo;

import java.util.Date;

/**
 * Representa uma viagem realizada num serviço de TVDE.
 * Inclui informações sobre o condutor, cliente, viatura utilizada, datas,
 * moradas de origem e destino, distância percorrida e custo total.
 */
public class Viagem {
    private int id;
    private Condutor condutor;
    private Cliente cliente;
    private Viatura viatura;
    private Date dataInicio;
    private Date dataFim;
    private String moradaOrigem;
    private String moradaDestino;
    private double kms;
    private double custoViagem;

    /**
     * Cria uma nova instância de Models.Viagem.
     *
     * @param id             Identificador de viagem.
     * @param condutor       Models.Condutor responsável pela viagem.
     * @param cliente        Models.Cliente transportado.
     * @param viatura        Models.Viatura utilizada na viagem.
     * @param dataInicio     Data e hora de início da viagem.
     * @param dataFim        Data e hora de fim da viagem.
     * @param moradaOrigem   Morada de onde a viagem começa.
     * @param moradaDestino  Morada onde a viagem termina.
     * @param kms            Quilómetros percorridos.
     * @param custoViagem    Custo total da viagem.
     */
    public Viagem(int id, Condutor condutor, Cliente cliente, Viatura viatura, Date dataInicio, Date dataFim,
                  String moradaOrigem, String moradaDestino, double kms, double custoViagem) {

        this.id = id;
        this.condutor = condutor;
        this.cliente = cliente;
        this.viatura = viatura;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.moradaOrigem = moradaOrigem;
        this.moradaDestino = moradaDestino;
        this.kms = kms;
        this.custoViagem = custoViagem;
    }

    /**
     * Obtém o condutor da viagem.
     *
     * @return Models.Condutor responsável.
     */
    public Condutor getCondutor() {
        return condutor;
    }

    /**
     * Define o condutor da viagem.
     *
     * @param condutor Novo condutor.
     */
    public void setCondutor(Condutor condutor) {
        this.condutor = condutor;
    }

    /**
     * Obtém o cliente transportado.
     *
     * @return Models.Cliente.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente da viagem.
     *
     * @param cliente Novo cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém a viatura utilizada.
     *
     * @return Models.Viatura da viagem.
     */
    public Viatura getViatura() {
        return viatura;
    }

    /**
     * Define a viatura utilizada na viagem.
     *
     * @param viatura Nova viatura.
     */
    public void setViatura(Viatura viatura) {
        this.viatura = viatura;
    }

    /**
     * Obtém a data de início da viagem.
     *
     * @return Data e hora de início.
     */
    public Date getDataInicio() {
        return dataInicio;
    }

    /**
     * Define a data de início da viagem.
     *
     * @param dataInicio Nova data de início.
     */
    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    /**
     * Obtém a data de fim da viagem.
     *
     * @return Data e hora de fim.
     */
    public Date getDataFim() {
        return dataFim;
    }

    /**
     * Define a data de fim da viagem.
     *
     * @param dataFim Nova data de fim.
     */
    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    /**
     * Obtém a morada de origem da viagem.
     *
     * @return Morada de origem.
     */
    public String getMoradaOrigem() {
        return moradaOrigem;
    }

    /**
     * Define a morada de origem da viagem.
     *
     * @param moradaOrigem Nova morada de origem.
     */
    public void setMoradaOrigem(String moradaOrigem) {
        this.moradaOrigem = moradaOrigem;
    }

    /**
     * Obtém a morada de destino da viagem.
     *
     * @return Morada de destino.
     */
    public String getMoradaDestino() {
        return moradaDestino;
    }

    /**
     * Define a morada de destino da viagem.
     *
     * @param moradaDestino Nova morada de destino.
     */
    public void setMoradaDestino(String moradaDestino) {
        this.moradaDestino = moradaDestino;
    }

    /**
     * Obtém o total de quilómetros percorridos.
     *
     * @return Quilómetros.
     */
    public double getKms() {
        return kms;
    }

    /**
     * Define a distância percorrida.
     *
     * @param kms Quilómetros percorridos.
     */
    public void setKms(double kms) {
        this.kms = kms;
    }

    /**
     * Obtém o custo total da viagem.
     *
     * @return Valor da viagem.
     */
    public double getCustoViagem() {
        return custoViagem;
    }

    /**
     * Define o custo da viagem.
     *
     * @param custoViagem Novo valor.
     */
    public void setCustoViagem(double custoViagem) {
        this.custoViagem = custoViagem;
    }

    /**
     * Obtém o id da viagem.
     *
     * @return id da viagem.
     */
    public int getId() {
        return id;
    }
}
