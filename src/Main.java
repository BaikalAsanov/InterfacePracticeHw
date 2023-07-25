// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Printable[] printables = {new Book("Sherlock Holms"),
                new Book("Algebra"),
                new Book("Physic"),
                new Magazine("Vogue"),
                new Magazine("Play boy"),
                new Magazine("People")};
        for (int i = 0; i < printables.length; i++) {
            printables[i].print();
        }
        System.out.println();
        Book.printBooks(printables);
        System.out.println();
        Magazine.printMagazines(printables);
    }
}