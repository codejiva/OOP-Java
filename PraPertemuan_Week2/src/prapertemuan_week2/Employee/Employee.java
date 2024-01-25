/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Employee;

/**
 *
 * @author codejiva
 */
public class Employee {
       // Atribut
       private int id;
       private String firstName;
       private String lastName;
       private int salary;
       
       // inisialisasi objek Employee
       public Employee(int id, String firstName, String lastName, int salary) {
           this.id = id;
           this.firstName = firstName;
           this.lastName = lastName;
           this.salary = salary;
       }
       
       // method getID
       public int getID(){
           return id;
       }
       
       // method getFirstName
       public String getFirstName() {
           return firstName;
       }
       
       // method getLastName
       public String getLastName() {
           return lastName;
       }
       
       // method getName
       public String getName() {
           return firstName + " " + lastName;
       }
       
       // method getSalary
       public int getSalary() {
           return salary;
       }
       
       // method setSalary
       public void setSalary(int salary) {
           this.salary = salary;
       }
       
       // method getAnnualSalary
       public int getAnnualSalary() {
           return salary * 12;
       }
       
       // method raiseSalary
       public int raiseSalary(int percent) {
           double kenaikan = 1 + (percent / 100.0);
           salary = (int) (salary * kenaikan);
           return salary;
       }
       
       // method toString
       public String toString() {
           return "Employe[id: " + id + ", Name: " + getName() + ", Salary: " + salary + "]";
       }
}

