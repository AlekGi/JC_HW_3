package org.homework;

import java.time.LocalDate;

public class Director extends Employer {


    public Director(String lastName, String firstname, String surname, LocalDate birthDate, String workStatus, int salary) {
        super(lastName, firstname, surname, birthDate, workStatus, salary);
    }

    public static void salaryIncrease(Employer[] employers, int percentage) {
        for (Employer employer : employers) {
            if (!(employer instanceof Director)) {
                int currentSalary = employer.getSalary();
                int newSalary = currentSalary * (percentage / 100) + currentSalary;
                employer.setSalary(newSalary);
            }
        }
    }

}

