public class Main {
    public static void main(String[] args) {

//        Создайте обобщенный класс Book<T>, который представляет книгу в библиотеке.
//        Каждая книга должна содержать параметр типа T для ее названия.
//        Создайте обобщенный класс LibraryCard<K, V>, который представляет библиотечную
//        карточку для определенной книги. Каждая карточка должна содержать параметры типов
//        K для номера карточки и V для информации о книге.
//        Создайте класс Library, который будет представлять библиотеку.
//                У этого класса должны быть методы для добавления книг и выдачи библиотечных карточек.
//                Добавьте метод для вывода информации о всех выданных книгах с их библиотечными карточками.
        Book<String> book1 = new Book<>("Грокаем Алгоритмы");
        LibraryCard<Integer, String> card1 = new LibraryCard<>(785645, "Програмирование");

        Book<String> book2 = new Book<>("Ведьмак");
        LibraryCard<Integer, String> card2 = new LibraryCard<>(134678, "Фантастика");

        Book<String> book3 = new Book<>("Мыслить как преступник");
        LibraryCard<Integer, String> card3 = new LibraryCard<>(265745, "Детектив");

        Library library = new Library();
        library.addBook(book1, card1);
        library.addBook(book2, card2);
        library.addBook(book3, card3);


        library.printIssuedBooks();

    }
}