package org.homework;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.Comparator;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employer {
    private String lastName;
    private String firstname;
    private String surname;
    private LocalDate birthDate;
    private String workStatus;
    private int salary;

    public static Comparator<Employer> dateComparator (){
        return Comparator.comparing(employer -> employer.birthDate);
    }

    @Override
    public String toString() {
        return this.lastName + " " + this.firstname + ", зарплата: " + this.salary + " руб.";
    }
}
