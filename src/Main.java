public class Main {
   private static Employee [ ] allEmployee = new Employee[10];
    public static void main(String[] args) {
        allEmployee [0] = new Employee("Иванова","Екатерина"," Михайловна", 50000,2);
        allEmployee[1]=new Employee("Анисимова","Дарья","Геннадьевна",38000,1);
        allEmployee[2]= new Employee("Колесников","Евгений","Петрович", 43000,4);
        allEmployee[3]=new Employee("Крутоголова","Алина","Витальевна",62000,5);
        allEmployee[4]=new Employee("Ковалев","Денис","Виктрович",49000,3);
        allEmployee[5]=new Employee("Ковальчук", "Иван", "Игоревич",29000,1);
        allEmployee[6]=new Employee("Березовская","Ангелина","Николаевна",56000,2);
        allEmployee[7]=new Employee("Терентьева","Валентина","Ивановна",36000,5);
        allEmployee[8]=new Employee("Красников","Виталий","Иванович",58000,3);
        allEmployee[9]=new Employee("Овчинников","Владимир","Станиславович",41000,4);
        /*System.out.println(allEmployee[0]);
        System.out.println(allEmployee[1]);
        System.out.println(allEmployee[2]);
        System.out.println(allEmployee[3]);
        System.out.println(allEmployee[4]);
        System.out.println(allEmployee[5]);
        System.out.println(allEmployee[6]);
        System.out.println(allEmployee[7]);
        System.out.println(allEmployee[8]);
        System.out.println(allEmployee[9]);*/
        printAllEmployee1();
        System.out.println("Общая сумма затрат на зарплаты " + countAllSalary());
        findMinSalary();
        findAverageSalary();
        findMaxSalary();
        printFullName();


    }
    private static int  countAllSalary ( ){
       int sum = 0;
        for (Employee everyEmployee:allEmployee) {
            sum= sum+ everyEmployee.getSalary();
        }
        return sum;
    }

    private static void printAllEmployee1 ( ){
        for (Employee everyEmployee1: allEmployee) {
            System.out.println(everyEmployee1);
        }
    }
    private static void findMinSalary () {
        int min = 100_000;
        for ( Employee everyEmployeeMin : allEmployee){
            if (everyEmployeeMin.getSalary() < min)
                min=everyEmployeeMin.getSalary();
        }
        System.out.println("Минимальная зарплата  " + min);
    }
    private static void findAverageSalary () {
        double sum = countAllSalary();
        double averageSalary = 0;
        averageSalary= sum / allEmployee.length;
        System.out.println("Средняя зарплата " + averageSalary);
    }
    private static void findMaxSalary ( ) {
        int max=0;
        for(Employee everyEmployeeMax:allEmployee){
            if(everyEmployeeMax.getSalary()>max)
                max=everyEmployeeMax.getSalary();
        }
        System.out.println("Максимальная зарплата " + max);
    }
    private static void printFullName(){
        for( Employee everyEmployeeFullName: allEmployee){

            System.out.println( "ФИО " + everyEmployeeFullName.getSurname()+" "+everyEmployeeFullName.getName() + " " + everyEmployeeFullName.getPatronymic());
        }
}
}
