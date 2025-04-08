package org.homework;

import java.time.LocalDate;

import static org.homework.Employer.dateComparator;

public class Main {
    public static void main(String[] args) {

        // Создаем сотрудников

        Director director = new Director("Тимошенко", "Николай", "Петрович",
                LocalDate.of(1990, 6, 30), "Руководитель", 106000);
        Employer manager1 = new Employer("Васильев", "Дмитрий", "Артемович",
                LocalDate.of(1996, 10, 4), "Менеджер", 65000);
        Employer manager2 = new Employer("Чехова", "Анастасия", "Николаевна",
                LocalDate.of(1995, 11, 3), "Менеджер", 68000);
        Employer accountant = new Employer("Петрушева", "Таисия", "Олеговна",
                LocalDate.of(1985, 12, 2), "Бухгалтер", 53000);
        Employer technicalSupport = new Employer("Гряков", "Арсений", "Александрович",
                LocalDate.of(1995, 6, 15), "Технический специалист", 85000);

        // 1. Написать прототип компаратора - метод внутри класса сотрудника, сравнивающий две даты, представленные в
        // виде трёх чисел гггг-мм-дд, без использования условного оператора.

        if(dateComparator().compare(manager1, manager2) > 0){
            System.out.println(manager1.getFirstname() + " " + manager1.getLastName() + " старше, чем "
                    + manager2.getFirstname() + " " + manager2.getLastName() + "\n");
        } else if(dateComparator().compare(manager1, manager2) < 0){
            System.out.println(manager1.getFirstname() + " " + manager1.getLastName() + " младше, чем "
                    + manager2.getFirstname() + " " + manager2.getLastName() + "\n");
        }else {
            System.out.println(manager1.getFirstname() + " " + manager1.getLastName() + " и " + manager2.getFirstname()
                    + " " + manager1.getLastName() + " рождены в один день" + "\n");
        }

        // 2. Опишите класс руководителя, наследник от сотрудника.
        // Перенесите статический метод повышения зарплаты в класс руководителя,
        // модифицируйте метод таким образом, чтобы он мог поднять заработную плату всем, кроме руководителей.
        // В основной программе создайте руководителя и поместите его в общий массив сотрудников.
        // Повысьте зарплату всем сотрудникам и проследите, чтобы зарплата руководителя не повысилась.

        Employer[] employers = new Employer[]{director, manager1, manager2, accountant, technicalSupport};
        System.out.println("Зарплата сотрудников до повышения: ");
        for (Employer employer : employers) {
            System.out.println(employer);

        }
        System.out.println("\n");

        // Повышаем зарплату! Кроме руководителя 😈
        Director.salaryIncrease(employers, 15);
        System.out.println("Зарплата сотрудников, после повышения: ");
        for (Employer employer : employers) {
            System.out.println(employer);
        }
        System.out.println("\n");

    }
}