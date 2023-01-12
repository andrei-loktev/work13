package lesson13;

public class Author {
    private String name;
    private String surname;
    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;

    }

    public String getName() {
        return this.name;
    }

    public String getSurName() {
        return this.surname;
    }

    public String getFullName() {
        String fullName = (this.name + " " + this.surname);
        return fullName;
    }
}
