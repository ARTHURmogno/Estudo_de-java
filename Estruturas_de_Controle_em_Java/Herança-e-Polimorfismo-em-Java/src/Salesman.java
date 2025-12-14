/**   extends quer dizer que a class (Salesman) herdara atributos e métodos
 *    da class (Employee) 
 * 
 */

public class Salesman extends Employee {

    public double comissao;

    public Salesman(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }

   

    
}
