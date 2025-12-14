/**   super quer dizer que você está chamando um construtor da class pai
 *    no caso é a Employee.
 * 
 *    você deicha claro que esté construtor e da class pai.
 */


public class Manager extends Employee {

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
