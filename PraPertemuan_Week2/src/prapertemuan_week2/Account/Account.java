/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Account;

/**
 *
 * @author codejiva
 */
public class Account {
    // Atribut
       private String id;
       private String name;
       private int balance = 0;
       
    // Constructor 1
       public Account(String id, String name) {
           this.id = id;
           this.name = name;
       }
       
    
    // Constructor 2
       public Account(String id, String name, int balance) {
           this(id, name);
           this.balance = balance;
       }
       
       public String getID() {
           return id;
       }
       
       public String getName() {
           return name;
       }
       
       public int getBalance() {
           return balance;
       }
       
       public int credit(int amount) {
           if (amount != 0) {
               balance = balance + amount;
               System.out.println("Credit = " + amount + " successful. Saldo baru = " + balance);
           }
           return balance;
       }
       
       
       public int debit(int amount) {
           if (amount <= balance) {
               balance = balance - amount;
               System.out.println("Debit = " + amount + " successful. Saldo baru = " + balance);
           } else {
               System.out.println("Amount exceeds balance. Debit unsuccessful. Current balance: $" + balance);
           }
           
           return balance;
       }
       
       
       
       public int transferTo(Account another, int amount) {
           if (amount <= balance) {
               balance = balance - amount;
               another.balance = another.balance + amount;
               System.out.println("Transfer sebesar " + amount + " pada account " + another.id + " sukses");
            } else {
            
            System.out.println("Amount exceeds balance. Transfer unsuccessful. Current balance: $" + balance);
            }
        
        return balance;
       }
       
       public String toString() {
         return "Account[id = " + getID() + ", name = " + getName() + ", balance = " + getBalance()+"]";
       }
     
       
}
