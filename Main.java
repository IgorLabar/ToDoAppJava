import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddTask AddTask = new AddTask();

        PrintMenu();
        int userInput = scanner.nextInt();

        while (true) {
            if (userInput == 1) {
                System.out.println(AddTask.addNewTask());
            } else if (userInput == 2) {
                AddTask.showMeTask();
            } else if (userInput == 3) {
                System.out.println(AddTask.deleteTask());
            }else if (userInput == 4) {
                System.out.println(AddTask.readyItems());
            }else if (userInput == 5) {
                System.out.println(AddTask.renameTask());
            }else if (userInput == 0) {
                System.out.println("До свидания");
                break;
            }else if (userInput == 6) {
                AddTask.showMeReadyTask();
            }
            PrintMenu();
            userInput = scanner.nextInt();
        }
    }

    private static void PrintMenu() {
        System.out.println("Что вы хотите сделать?");
        System.out.println("1 - Добавить задачу");
        System.out.println("2 - Посмотреть все задачи");
        System.out.println("3 - Удалить задачу");
        System.out.println("4 - Завершить задачу");
        System.out.println("5 - Переименовать задачу");
        System.out.println("6 - Список завершенных задач");
        System.out.println("0 - Выйти из приложения");
    }
}
