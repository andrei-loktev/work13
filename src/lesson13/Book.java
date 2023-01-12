package lesson13;

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
}
