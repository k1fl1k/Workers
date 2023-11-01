// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {

    public static void main(String[] args) {
        NameAndSurname[] workersArray = new NameAndSurname[3];

        NameAndSurname worker1 = new NameAndSurname("М.В.", "Трученко", "Менеджер", 5, 2000);
        workersArray[0] = worker1;

        NameAndSurname worker2 = new NameAndSurname("О.С.", "Рябченко", "Робітник", 2, 1000);
        workersArray[1] = worker2;

        NameAndSurname worker3 = new NameAndSurname("Ю.П.", "Мисленко", "Робітник", 3, 1200);
        workersArray[2] = worker3;

        NameAndSurname.arrayOutput(workersArray);
    }
}