package org.pattern.entities;

public class Phone {
    private String number;
    private String extension;
    private String type;

    public Phone() {
    }

    public Phone(String number, String extension, String type) {
        this.number = number;
        this.extension = extension;
        this.type = type;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", extension='" + extension + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
