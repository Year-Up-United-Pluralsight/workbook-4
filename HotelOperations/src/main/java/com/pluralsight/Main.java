package com.pluralsight;

public class Main {
    public static void main(String[] args) {

        //testReservation1();
        testEmployee();
    }


    public static void testEmployee(){

        Employee e1 = new Employee(1, "Matt", "Facilitators", 10);

        e1.setHoursWorked(39);

        System.out.println(e1.getTotalPay());

        Employee e2 = new Employee(1, "Matt", "Facilitators", 10);
        e2.setHoursWorked(40);
        System.out.println(e2.getTotalPay());

        Employee e3 = new Employee(1, "Matt", "Facilitators", 10);
        e3.setHoursWorked(41);
        System.out.println(e3.getTotalPay());

    }

    public static void testReservation1() {
        Reservation r1 = new Reservation("king", false, 1);
        System.out.println(r1.getPrice());

        Reservation r2 = new Reservation("double", false, 1);
        System.out.println(r2.getPrice());

        Reservation r3 = new Reservation("king", true, 1);
        System.out.println(r3.getPrice());

        Reservation r4 = new Reservation("double", true, 1);
        System.out.println(r4.getPrice());

    }
}