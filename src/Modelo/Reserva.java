package Modelo;

import java.util.Date;

/**
 * Representa uma reserva realizada por um cliente para um TVDE.
 * Contém informações sobre o cliente, data da reserva, moradas de origem e destino, e a distância total em quilómetros.
 */
public class Reserva {
    private int id;
    private Cliente cliente;
    private Date dataReserva;
    private String moradaOrigem;
    private String moradaDestino;
    private double kms;

    /**
     * Cria uma nova instância de Models.Reserva.
     *
     * @param id             Identificador de reserva.
     * @param cliente        Models.Cliente que realizou a reserva.
     * @param dataReserva    Data em que a reserva foi efetuada.
     * @param moradaOrigem   Local de partida.
     * @param moradaDestino  Local de chegada.
     * @param kms            Distância total da viagem em quilómetros.
     */
    public Reserva(Cliente cliente, Date dataReserva, String moradaOrigem, String moradaDestino, double kms, int id) {
        this.id = id;
        this.id = contadorID++;
        this.cliente = cliente;
        this.dataReserva = dataReserva;
        this.moradaOrigem = moradaOrigem;
        this.moradaDestino = moradaDestino;
        this.kms = kms;
    }

    /**
     * Obtém o id associado à reserva.
     *
     * @return id da reserva.
     */
    public int getId() {

        return id;
    }

    /** Contador estático que garante o auto-incremento do ID.
    * Cada nova instância da classe recebe um ID único.
    */
    private static int contadorID = 1;

    /**
     * Obtém o cliente associado à reserva.
     *
     * @return Models.Cliente da reserva.
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * Define o cliente da reserva.
     *
     * @param cliente Novo cliente.
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    /**
     * Obtém a data em que a reserva foi efetuada.
     *
     * @return Data da reserva.
     */
    public Date getDataReserva() {
        return dataReserva;
    }

    /**
     * Define a data da reserva.
     *
     * @param dataReserva Nova data da reserva.
     */
    public void setDataReserva(Date dataReserva) {
        this.dataReserva = dataReserva;
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
     * Obtém a distância total da viagem.
     *
     * @return Distância em quilómetros.
     */
    public double getKms() {
        return kms;
    }

    /**
     * Define a distância total da viagem.
     *
     * @param kms Nova distância em quilómetros.
     */
    public void setKms(double kms) {
        this.kms = kms;
    }
}
