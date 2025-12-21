/**   super quer dizer que você está chamando um construtor da class pai
 *    no caso é a Employee.
 * 
 *    você deicha claro que esté construtor e da class pai.
 * -------------------------------------------------------------------------------------------
 * 
 *         FINAL; quer dizer que está class não pode ser erdade por nem uma outra;
 * 
 * -------------------------------------------------------------------------------------------
 *    extends quer dizer que a class (Salesman) herdara atributos e métodos
 *    da class (Employee)
 * 
 * -------------------------------------------------------------------------------------------
 * 
 *    non-sealed:
 *    quer dizer que está class está quebrando o controle rigido imposto pelo (sealed)
 *    está class pode ser estendida livremente por qualquer um.
 *  
 */


public non-sealed class Manager extends Employee {

    public String login;
    
    public double comissao;
    
    
    public Manager(String nome, double salarioBase, String login, double comissao) {
        super(nome, salarioBase);
        this.login = login;
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }
}
