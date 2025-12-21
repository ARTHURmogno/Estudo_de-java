/**    
 *  extends quer dizer que a class (Salesman) herdara atributos e métodos
 *    da class (Employee) 
 * ----------------------------------------------------------------------------------------------
 *   
 *    FINAL; quer dizer que está class não pode ser erdade por nem uma outra; 
 * 
 * ----------------------------------------------------------------------------------------------
 * 
 *   super quer dizer que você está chamando um construtor da class pai
 *    no caso é a Employee.
 * 
 *    você deicha claro que esté construtor e da class pai.
 * 
 * ----------------------------------------------------------------------------------------------
 * 
 *   non-sealed:
 *    quer dizer que está class está quebrando o controle rigido imposto pelo (sealed)
 *    está class pode ser estendida livremente por qualquer um.
 *  
 */

public non-sealed class Salesman extends Employee {

    public double comissao;

    public Salesman(String nome, double salarioBase, double comissao) {
        super(nome, salarioBase);
        this.comissao = comissao;
    }

    public double calcularSalario() {
        return getSalarioBase() + comissao;
    }

   

    
}
