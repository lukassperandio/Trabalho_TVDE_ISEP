package Modelo;

/**
 * Representa uma viatura utilizada para operações de TVDE.
 * Inclui dados de identificação como matrícula, marca, modelo e ano de fabrico.
 */
public class Viatura {

    private String matricula;
    private String marca;
    private String modelo;
    private int anoDeFabrico;

    /**
     * Cria uma nova instância de Models.Viatura.
     *
     * @param matricula     Matrícula da viatura.
     * @param marca         Marca do fabricante.
     * @param modelo        Modelo da viatura.
     * @param anoDeFabrico  Ano em que a viatura foi fabricada.
     */
    public Viatura(String matricula, String marca, String modelo, int anoDeFabrico) {
        this.matricula = matricula;
        this.marca = marca;
        this.modelo = modelo;
        this.anoDeFabrico = anoDeFabrico;
    }

    /**
     * Obtém a matrícula da viatura.
     *
     * @return Matrícula.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Define a matrícula da viatura.
     *
     * @param matricula Nova matrícula.
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * Obtém a marca da viatura.
     *
     * @return Marca.
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Define a marca da viatura.
     *
     * @param marca Nova marca.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Obtém o modelo da viatura.
     *
     * @return Modelo.
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * Define o modelo da viatura.
     *
     * @param modelo Novo modelo.
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * Obtém o ano de fabrico da viatura.
     *
     * @return Ano de fabrico.
     */
    public int getAnoDeFabrico() {
        return anoDeFabrico;
    }

    /**
     * Define o ano de fabrico da viatura.
     *
     * @param anoDeFabrico Novo ano de fabrico.
     */
    public void setAnoDeFabrico(int anoDeFabrico) {
        this.anoDeFabrico = anoDeFabrico;
    }
}
