import java.util.Arrays;

//задания 1-7 ищи в классе Employee

public class Main {
    static Employee[] employees = new Employee[10];
    private static int getSallary;

    public static void main(String[] args) {
        System.out.println ("Hello world!");
        var employee1 = new Employee ("Иван", "Иванович", "Иванов", 2, 1299910);
        var employee2 = new Employee ("Петр", "Петрович", "Петров", 3, 1299850);
        var employee3 = new Employee ("Сидор", "Сидорович", "Петров", 3, 1299900);
        var employee4 = new Employee ("Иван", "Сидорович", "Сидоров", 3, 1299900);
        var employee5 = new Employee ("Сидор", "Иванович", "Сидоров", 3, 1299900);
        var employee6 = new Employee ("Сидор", "Сидорович", "Иванов", 4, 1299900);
        var employee7 = new Employee ("Иван", "Петрович", "Петров", 5, 129900);
        var employee8 = new Employee ("Петр", "Иванович", "Петров", 3, 1299900);
        var employee9 = new Employee ("Петр", "Петрович", "Иванов", 1, 1299900);
        var employee0 = new Employee ("Иван", "Петрович", "Петров", 1, 1299900);
        //7. Создать внутри класса с методом main поле типа Employee[10], которое будет выполнять роль «хранилища» для записей о сотрудниках.

        employees[0] = employee1;
        employees[1] = employee2;
        employees[2] = employee9;
        employees[3] = employee5;
        employees[4] = employee4;
        employees[5] = employee8;
        employees[6] = employee6;
        employees[7] = employee7;
        employees[8] = employee0;
        employees[9] = employee3;

        employees = Arrays.copyOf (employees, 10); //код из разбора д/з

        printEmployeeBook (); //8a.
        System.out.println (sumOfSallary ()); //8b
        System.out.println (findMinSalary ()); //8c
        System.out.println (findMaxSalary ()); //8d
        System.out.println (findOverageSalary ()); //8e
        printEmployeeNames(); //8f.
    }

    //8а. печать всех контактов (запуск строка 34)
    public static void printEmployeeBook() {

        for (int i = 0; i < employees.length; i++) {
            System.out.println (employees[i]);
        }
    }

    //8b Посчитать сумму затрат на зарплаты в месяц. (запуск строка 35, некоректно считает - зарплата не меняется - почему?)
    public static int sumOfSallary() {
        int sum = 0;

        for (int i = 0; i < employees.length; i++) {
            sum = sum + employees[i].getSallary ();
        }

        return sum;
    }

    //8с.Найти сотрудника с минимальной зарплатой.
    public static Employee findMinSalary() {

        Employee result = employees[0];
        int minSallary = employees[0].getSallary ();
        for (int i = 0; i < employees.length - 1; i++) {
            if (employees[i].getSallary () < minSallary) {
                minSallary = employees[i].getSallary ();
                result = employees[i];
            }


        }
        return result;

    }

    //8d. Найти сотрудника с максимальной зарплатой.

    public static Employee findMaxSalary() {

        Employee result = employees[0];
        int maxSallary = employees[0].getSallary ();
        for (int i = 0; i > employees.length; i++) {
            if (employees[i].getSallary () < maxSallary) {
                maxSallary = employees[i].getSallary ();
                result = employees[i];
            }

        }
        return result;
        //8e. Подсчитать среднее значение зарплат (можно использовать для этого метод из пункта b).
    }

    public static double findOverageSalary() {
        int sum1 = 0;
        for (int i = 0; i < employees.length; i++) {
            sum1 = sum1 + employees[i].getSallary ();
        }
        double overage = (sum1 / employees.length);
        return overage;
    }
    //8f. Получить Ф. И. О. всех сотрудников (вывести в консоль).

    public static void printEmployeeNames() {

        for (int i = 0; i < employees.length; i++) {
            System.out.println (( i+1) + ". "+employees[i].getFirstName ()+ " " +employees[i].getMiddleName () + " "+ employees[i].getLastName ());
        }
    }
}

