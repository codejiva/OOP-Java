/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Employee;

/**
 *
 * @author codejiva
 */
// Class testing
public class EmployeeTest {
    public static void main(String[] args) {
        // buat objek employee
        Employee employee1 = new Employee(833, "Code", "Jiva", 5000);
        
        System.out.println(employee1.toString());
        System.out.println(employee1.getID());
        System.out.println(employee1.getFirstName());
        System.out.println(employee1.getLastName());
        System.out.println(employee1.getName());
        System.out.println(employee1.getSalary());
        employee1.setSalary(10000);
        System.out.println(employee1.getSalary());
        System.out.println(employee1.raiseSalary(10));
        System.out.println(employee1.toString());
    }
}
