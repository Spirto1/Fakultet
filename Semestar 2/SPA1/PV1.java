public class PV1 {

    private static void printWholeFile(String path) {
        System.out.println(System.in(path).readAll());
        System.in(path).close();
    }
    public static void main(String[] args) {
        String fileName = "fajl1.txt";

        if (!System.testIn(fileName)) {
            System.out.print("Fajl ne postoji!");
            return;
        }

        printWholeFile(fileName);
        printWholeFile(System.in.readToken("Unesite ime fajla: "));

    }
}
