package org.pattern;

import org.pattern.entities.Address;
import org.pattern.entities.Contact;
import org.pattern.entities.Employee;
import org.pattern.entities.Phone;

public class Main {
    public static void main(String[] args) {
        // probando el patron builder
        Employee employee = new Employee.builder()
                .age(24)
                .name("Gerson Benito")
                .gender("Male")
                //.address(new Address("Calle 9", "San Salvador", "El Salvador", "503")) // forma 1
                .address("Calle carretera 19", "La Libertad", "El Salvador", "503") // forma 2
                //.phone(new Phone("7345-2343", "Tel", "Personal")) // forma 1
                .phone("2343-5676", "Tel", "Fijo") // forma 2
                .contact(new Contact("Douglas",
                        new Phone("7345-2343", "Tel", "Personal"),
                        new Address("Calle 9", "San Salvador", "El Salvador", "503")
                        )
                )
                .build();

        System.out.println("employee = " + employee);

    }
}