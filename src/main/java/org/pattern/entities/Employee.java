package org.pattern.entities;

import org.pattern.repository.IBuilder;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private int age;
    private String name;
    private String gender;
    private Address address;
    private List<Phone> phones = new ArrayList<>();
    private List<Contact> contacts = new ArrayList<>();

    public Employee() {
    }

    public Employee(int age, String name, String gender, Address address, List<Phone> phones, List<Contact> contacts) {
        this.age = age;
        this.name = name;
        this.gender = gender;
        this.address = address;
        this.phones = phones;
        this.contacts = contacts;
    }

    // crear el metodo para construir empleados
    public static class builder implements IBuilder{

        private int age;
        private String name;
        private String gender;
        private Address address;
        private List<Phone> phones = new ArrayList<>();
        private List<Contact> contacts = new ArrayList<>();

        public void builder(){

        }

        public builder age(int age){
            this.age = age;
            return this; // retornar el valor actual
        }

        public builder name(String name){
            this.name = name;
            return this;
        }

        public builder gender(String gender){
            this.gender = gender;
            return this;
        }

        public builder address(Address address){
            this.address = address;
            return this;
        }

        public builder address(String address, String city, String country, String cp){
            this.address = new Address(address, city, country, cp);
            return this;
        }

        public builder phone(Phone phone){
            this.phones.add(phone);
            return this;
        }

        public builder phone(String number, String extension, String type){
            this.phones.add(new Phone(number, extension, type));
            return this;
        }

        public builder contact(Contact contact){
            this.contacts.add(contact);
            return this;
        }

        public builder contact(String name, Phone phone, Address address){
            this.contacts.add(new Contact(name, phone, address));
            return this;
        }

        @Override
        public Employee build() {

            // retornar un nuevo empleado
            return new Employee(age, name, gender, address, phones, contacts);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Phone> getPhones() {
        return phones;
    }

    public void setPhones(List<Phone> phones) {
        this.phones = phones;
    }

    public List<Contact> getContacts() {
        return contacts;
    }

    public void setContacts(List<Contact> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "\nage=" + age +
                "\nname=" + name +
                "\ngender=" + gender +
                "\naddress=" + address +
                "\nphones=" + phones +
                "\ncontacts=" + contacts +
                "\n}";
    }
}
