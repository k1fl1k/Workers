import java.util.Scanner;
public class NameAndSurname {

    public String initials;
    public String surname;
    public String position;
    public int year;
    public int salary;

    public NameAndSurname(String _initials, String _surname, String _position, int _year, int _salary) {
        initials = _initials;
        surname = _surname;
        position = _position;
        year = _year;
        salary = _salary;
    }

    public static void arrayOutput(NameAndSurname[] arrayWorkers) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Оберіть варіант:");
        System.out.println("1. Список працівників, етап роботи яких на даному підприємстві старше заданого числа років.");
        System.out.println("2. Список працівників, зарплата яких більше заданої.");
        System.out.println("3. Список працівників, які займають задану посаду.");
        int variant = scanner.nextInt();

        if (variant == 1) {
            System.out.print("Введіть мінімальну кількість років стажу: ");
            int minYears = scanner.nextInt();
            for (NameAndSurname worker : arrayWorkers) {
                if (worker.year > minYears) {
                    System.out.println("Прізвище: " + worker.surname);
                    System.out.println("Ініціали: " + worker.initials);
                    System.out.println("Посада: " + worker.position);
                    System.out.println("Рік прибуття на роботу: " + worker.year);
                    System.out.println("Зарплата: " + worker.salary);
                    System.out.println("");
                }
            }
        } else if (variant == 2) {
            System.out.print("Введіть мінімальну зарплату: ");
            int minSalary = scanner.nextInt();
            for (NameAndSurname worker : arrayWorkers) {
                if (worker.salary > minSalary) {
                    System.out.println("Прізвище: " + worker.surname);
                    System.out.println("Ініціали: " + worker.initials);
                    System.out.println("Посада: " + worker.position);
                    System.out.println("Рік прибуття на роботу: " + worker.year);
                    System.out.println("Зарплата: " + worker.salary);
                    System.out.println("");
                }
            }
        } else if (variant == 3) {
            System.out.print("Введіть посаду для пошуку: ");
            String searchPosition = scanner.next();
            for (NameAndSurname worker : arrayWorkers) {
                if (worker.position.equalsIgnoreCase(searchPosition)) {
                    System.out.println("Прізвище: " + worker.surname);
                    System.out.println("Ініціали: " + worker.initials);
                    System.out.println("Посада: " + worker.position);
                    System.out.println("Рік прибуття на роботу: " + worker.year);
                    System.out.println("Зарплата: " + worker.salary);
                    System.out.println("");
                }
            }
        }

        scanner.close();
    }
}