/*   class abstract 
*    e uma class que não pode ser instanciada.
*    somente servem como base ou uma class referencia. 
* --------------------------------------------------------------------------------------------------
*   sealed:
*   quer dizer que ela foi selada é não pode ser erdade por nim quem
*   A não see que ela permita com (permits).
*
*--------------------------------------------------------------------------------------------------
*
*   permits:
*   quer dizer que ás class descritas após serão pesmitidas herdar dela
*   logo após á permits o nome das class.
*/

public sealed abstract class Employee permits Manager, Salesman {
   

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


