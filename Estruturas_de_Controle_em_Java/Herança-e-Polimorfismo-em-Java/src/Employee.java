/*   class abstract 
*    e uma class que não pode ser instanciada.
*    somente servem como base ou uma class referencia. 
*/

public abstract class Employee {
   

    public String nome;

    public double salarioBase;

    public Employee(String nome, double salarioBase) {
        this.nome = nome;
        this.salarioBase = salarioBase;
    }

    public String getNome() {
        return nome;
    }

    public double getSalarioBase() {
        return salarioBase;
    }


    public double calcularSalario() {
        return salarioBase;
    }


    


}


