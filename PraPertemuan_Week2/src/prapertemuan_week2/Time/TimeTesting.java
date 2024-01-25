/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prapertemuan_week2.Time;

/**
 *
 * @author codejiva
 */
public class TimeTesting {
    public static void main(String[] args) {
        Time time1 = new Time(10, 30, 45);
        Time time2 = new Time(23, 59, 59);
        Time time3 = new Time(00, 00, 00);
        
        //Time 1
        System.out.println("Initial Time: " + time1.toString());

        time1.nextSecond();
        System.out.println("Next Second: " + time1.toString());

        
        System.out.println();
        
        //Time 2
        System.out.println("Initial Time: " + time2.toString());

        time2.nextSecond();
        System.out.println("Next Second: " + time2.toString());
        
        System.out.println();
        
        //Time 3
        System.out.println("Initial Time: " + time3.toString());

        time3.previousSecond();
        System.out.println("Previous Second: " + time3.toString());
        
        System.out.println();
    }
}


