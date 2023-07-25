public class Book implements Printable {
    private String name;
    public Book(String name) {
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }
    @Override
    public void print() {
        System.out.println(name + " can be print.");
    }
    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
    static void printBooks(Printable[] printables){
        for (Printable printable : printables) {
            if (printable.getClass().getName().equals("Book")){
                System.out.println(printable);
            }
        }
    }
}
