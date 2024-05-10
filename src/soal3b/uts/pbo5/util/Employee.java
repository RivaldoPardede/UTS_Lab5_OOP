package soal3b.uts.pbo5.util;

import java.text.MessageFormat;

public class Employee {
    private final int id;
    private int salary;
    private final String firstName, lastName;

    public Employee (int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() { return id; }

    public String getFirstName() { return firstName; }

    public String getLastName() { return lastName; }

    public String getName() { return firstName + " " + lastName; }

    public int getSalary() { return salary; }

    public void setSalary(int salary) { this.salary = salary; }

    public int getAnnualSalary() { return salary*12; }

    public int raiseSalary(int percent) {
        int newSalary = (int) (salary + salary*(percent/100.0));
        setSalary(newSalary);
        return newSalary;
    }

    public String toString() {
        return MessageFormat.format("Employee[id={0},name={1} {2},salary={3, number, #}]", id, firstName, lastName, salary);
    }
}
