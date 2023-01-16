package lesson13;

import java.util.Objects;

public class Book {
    private String title;
    private String author;
    public int age;
    public Book (String title, String author, int age) {
        this.title = title;
        this.author = author;
        this.age = age;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Book : " +
                "название = '" + title + '\'' +
                ", автор = '" + author + '\'' +
                ", год издания = " + age +
                ' ';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title);
    }
}
