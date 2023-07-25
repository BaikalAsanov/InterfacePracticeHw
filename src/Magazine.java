import javax.xml.namespace.QName;

public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public  void setName(String name) {
        this.name = name;
    }
    @Override
    public void print() {
        System.out.println(name + " can be print.");
    }
    @Override
    public String toString() {
        return "Magazine{" +
                "name='" + name + '\'' +
                '}';
    }
    static void printMagazines(Printable[] printables){
        for (Printable printable : printables) {
            if (printable.getClass().getName().equals("Magazine")) {
                System.out.println(printable);
            }
        }
    }
}
