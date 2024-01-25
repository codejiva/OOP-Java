/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Account;

/**
 *
 * @author codejiva
 */
public class AccountTesting {
    public static void main(String[] args) {
        Account account1 = new Account("B16", "Kamila", 100000000);
        Account account2 = new Account("A19", "Andini", 7000);
        System.out.println("ID: " + account1.getID());
        System.out.println("Nama: " + account1.getName());
        System.out.println("Saldo: " + account1.getBalance());
        System.out.println("Saldo setelah credit: " + account1.credit(5000));
        System.out.println("Saldo setelah debit: " + account1.debit(3000));
        System.out.println("Saldo setelah transfer ke " + account2.getName() + " " + account1.transferTo(account2, 3000));
        System.out.println("Saldo " + account2.getName() + " = " + account2.getBalance());
        System.out.println(account1.toString());
    }
    
}
