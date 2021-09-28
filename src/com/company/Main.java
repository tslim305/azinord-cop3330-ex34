package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main{
    public static void printEmployees(ArrayList<String> employees) {
        System.out.println("There are " + employees.size() + " employees: ");
        for (String emp : employees) {
            System.out.println(emp);
        }
    }


    public static void main(String[] args)
    {

        ArrayList<String> employees = new ArrayList<String>(Arrays.asList("John Smith", "Jackie Jackson", "Chris Jones", "Amanda Cullen", "Jeremy Goodwin"));
        printEmployees(employees);

        Scanner sc = new Scanner(System.in);

        System.out.println();
        System.out.println("Enter an employee name to remove: ");
        String nameToRemove = sc.nextLine();

        employees.remove(nameToRemove);

        System.out.println();
        printEmployees(employees);//print employees
    }
}

