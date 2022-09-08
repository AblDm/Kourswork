public class Employee {



    //1. Создать класс Employee, который содержит информацию о ФИО., отделе и зарплате сотрудника. Отделы для простоты должны быть названы от 1 до 5.
    //2. Добавить статическую переменную-счетчик, которая будет отвечать за id.
    //3. Добавить в класс Employee поле id, которое проставляется из счетчика, а затем счетчик увеличивает свое значение.



    private static int counter;
    private Integer id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private static int sallary;



    //4. Добавить возможность получать значения полей из Employee (геттеры) для всех полей.

    public static int getCounter() {return counter;}
    public Integer getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSallary() {
        return sallary;
    }

    //5. Добавить возможность устанавливать значения полей отдела и зарплаты (сеттеры).
    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }


    //6. По умолчанию все поля должны передавать через конструктор (кроме id) и заполняться в нем (включая id, который нужно получить из счетчика).
    public Employee (String firstName, String middleName, String lastName, int department, int sallary) {
        this.id = counter++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.sallary = sallary;

    }
    public static void Employees(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employees.length; i++) {
            sum += employees[i].getSallary ();
        }
        System.out.println (sum);
    }



    public void EmployeeList(String firstName, String middleName, String lastName) {
        ;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        return;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}
//задание 8 ищи в классе Main
