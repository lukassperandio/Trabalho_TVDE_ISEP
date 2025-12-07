package Gestor;

import Modelo.Cliente;
import Modelo.Condutor;
import Modelo.Viagem;
import Modelo.Viatura;

import java.util.ArrayList;

/**
 * Classe responsável por gerir e manipular os dados relacionados
 * ao sistema. Centraliza operações de leitura, escrita e atualização.
 *
 * <p>Futuramente, poderá incluir mecanismos de persistência,
 * validação e coordenação entre diferentes componentes.</p>
 */
public class Gestor {

    /**
     * Lista de clientes registados no sistema.
     */
    private ArrayList<Cliente> clientes;

    /**
     * Lista de condutores registados no sistema.
     */
    private ArrayList<Condutor> condutores;

    /**
     * Lista de viaturas registadas no sistema.
     */
    private ArrayList<Viatura> viaturas;

    /**
     * Lista de viagens registadas no sistema.
     */
    private ArrayList<Viagem> viagens;

    /**
     * Cria uma nova instância do Gestor, inicializando todas as listas
     * necessárias para a gestão dos dados do sistema.
     */
    public Gestor() {
        this.clientes = new ArrayList<>();
        this.condutores = new ArrayList<>();
        this.viaturas = new ArrayList<>();
        this.viagens = new ArrayList<>();
    }



    // CRUD DA CLASSE CONDUTOR
    /**
     * Adiciona um novo condutor à lista.
     *
     * @param condutor Condutor a ser adicionado.
     */
    public void criarCondutor(Condutor condutor) {
        this.condutores.add(condutor);
    }

    /**
     * Devolve a lista completa de condutores.
     *
     * @return Lista de condutores registados.
     */
    public ArrayList<Condutor> listarCondutores() {
        return this.condutores;
    }

    /**
     * Procura um condutor pelo seu ID.
     *
     * @param id ID do condutor.
     * @return Condutor encontrado ou null se não existir.
     */
    public Condutor procurarCondutorPorId(int id) {
        for (Condutor c : this.condutores) {
            if (c.getId() == id) {
                return c;
            }
        }
        return null;
    }

    /**
     * Atualiza os dados de um condutor existente.
     *
     * @param id ID do condutor a atualizar.
     * @param novosDados Objeto Condutor contendo as novas informações.
     * @return true se o condutor foi atualizado; false caso não exista.
     */
    public boolean atualizarCondutor(int id, Condutor novosDados) {
        for (int i = 0; i < this.condutores.size(); i++) {
            if (this.condutores.get(i).getId() == id) {
                this.condutores.set(i, novosDados);
                return true;
            }
        }
        return false;
    }


    /**
     * Elimina um novo condutor da lista.
     *
     * @param condutor Condutor a ser eliminado.
     */
    public void eliminaCondutor(Condutor condutor) {
        this.condutores.remove(condutor);
    }


    //CRUD DA CLASSE CLIENTE

    /**
     * Adiciona um novo cliente à lista.
     *
     * @param cliente Cliente a ser adicionado
     */

    public void criarCliente(Cliente cliente) {
        this.clientes.add(cliente);
    }

    /**
     * Devolve a lista completa de Clientes
     *
     * @return Lista de clientes.
     */

    public ArrayList<Cliente> listarClientes() {
        return this.clientes;
    }

    /**
     * Procura o cliente pelo seu NIF
     *
     * @param numIdentificacaoFiscal NIF do cliente.
     * @return Cliente encontrado ou null se não existir.
     */

    public Cliente proucurarClientePorNif (int numIdentificacaoFiscal){
        for (Cliente c : this.clientes){
            if (c.getNumIdentificacaoFiscal() == numIdentificacaoFiscal){
                return c;
            }
        }
        return null;
    }

    /**
     *Atualiza os dados de um cliente existente.
     *
     * @param numIdentificacaoFiscal NIF do cliente a atualiar.
     * @param novosDados Objeto cliente contendo novos dados.
     * @return true se o condutor foi atualizado; false caso não exista.
     */
    public boolean atualizarCliente(int numIdentificacaoFiscal, Cliente novosDados) {
        for (int i = 0; i < this.clientes.size(); i++) {
            if (this.clientes.get(i).getNumIdentificacaoFiscal() == numIdentificacaoFiscal) {
                this.clientes.set(i, novosDados);
                return true;
            }
        }
        return false;
    }

    /**
     * Elimina um novo cliente da lista.
     *
     * @param cliente Cliente a ser eleminado.
     */
    public void eliminaCliente(Cliente cliente) {
        this.clientes.remove(cliente);
    }

}
