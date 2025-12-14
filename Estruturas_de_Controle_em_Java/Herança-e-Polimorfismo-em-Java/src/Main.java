public class Main {

    public static void main(String[] args) {
        
        Employee f1 = new Manager("ARTHUR", 500.000, "tfff", 100.000);
        Employee f2 = new Salesman("ff", 10.000, 5.000);

        System.out.println(f1.getNome() + " - Salário " + f1.calcularSalario());
        System.out.println(f2.getNome() + " - Salário " + f2.calcularSalario());


    }
    
}
