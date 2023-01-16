import lesson13.Author;
import lesson13.Book;

public class Main {
    public static void main(String[] args) {
        Author levTolstoy = new Author("Лев", "Толстой");
        Author ivanTurgenev = new Author("Иван", "Тургенев" );
        Book warAndPeace = new Book ("Война и Мир", "Лев Толстой", 1869);
        Book fathersAndChildren = new Book ("Отцы и Дети", "Иван Тургенев", 1862);
        System.out.println("warAndPeace.age = " + warAndPeace.age);
        warAndPeace.setAge(1865);
        System.out.println("warAndPeace.getAge() = " + warAndPeace.getAge());
        System.out.println(warAndPeace.getAuthor());
        System.out.println("warAndPeace.getTitle() = " + warAndPeace.getTitle());
    }
}
