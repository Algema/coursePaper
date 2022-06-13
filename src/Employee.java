public class Employee {
    private int id;
    private static int numberId=0;
    private String name;
    private String surname;
    private String patronymic;
    private int salary;
    private int department;

    public Employee(String surname, String name, String patronymic, int salary, int department) {
        this.name=name;
        this.surname=surname;
        this.patronymic=patronymic;
        this.salary=salary;
        this.department=department;
        numberId++;
        this.id=numberId;
    }
    public int getId(){
        return id;
    }
    public static int getNumberId(){
        return numberId;
    }
    public  String getName(){
        return name;
    }
    public String getSurname (){
        return surname;
    }
    public String getPatronymic(){
        return patronymic;
    }
    public int getSalary(){
        return salary;
    }
    public int getDepartment(){
        return department;
    }
    public void setSalary(int salary){
        this.salary=salary;
    }
    public void setDepartment (int department){
        this.department=department;
    }
    public String toString (){
        return "ФИО" + " " + this.surname + " " + this.name + " "+this.patronymic + " Зарплата " + this.salary + " Отдел № " + this.department;
    }



}
