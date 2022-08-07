import java.util.HashMap;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.HashMap;


public class AddTask {
    Scanner scanner = new Scanner(System.in);
    ArrayList<String> newTaskName = new ArrayList<>();
    //HashMap<Integer,String> readyTask = new HashMap<>();
    ArrayList<String> readyTask = new ArrayList<>();
    public String addNewTask() {
        System.out.println("Новая задача");
        System.out.println("");
        System.out.println("Название задачи");
        String addName = scanner.nextLine();
        newTaskName.add(addName);
        System.out.println("");
        return "Задача добавлена в список";
    }
    public void showMeTask() {
        System.out.println(newTaskName.toString());
        System.out.println("");
    }
    public String deleteTask() {
        System.out.println("Выберете задачу, которую нужно удалить. Где 0 первая задача " + newTaskName);
        int choiceTaskName = scanner.nextInt();
        if (choiceTaskName > newTaskName.size()) {
            System.out.println("Выбранное Вами число, больше, чем задач, повторите еще раз");
            System.out.println("Выберете задачу, которую нужно удалить. Где 0 первая задача " + newTaskName);
            choiceTaskName = scanner.nextInt();
        }else {
            newTaskName.remove(choiceTaskName);
        }
        return "Задача удалена";
    }
    public String readyItems() {
        System.out.println("Выберете задачу, которую хотите завершить. Где 0 первая задача " + newTaskName);
        int readyItems = scanner.nextInt();
        readyTask.add(readyItems, newTaskName.get(readyItems));
        newTaskName.remove(readyItems);
        return "Ваша задача завершена";
    }
    public String renameTask() {
        System.out.println("Выберете задачу, котрую хотите переименовать. Где 0 это первая задача " + newTaskName);
        int renameTask = scanner.nextInt();
        System.out.println("Задача " + newTaskName.get(renameTask));
        scanner.nextLine();
        System.out.println("Введите новое название");
        String rename = scanner.nextLine();
        System.out.println("");
        newTaskName.add(rename);
        newTaskName.remove(renameTask);
        return "Ваша задача переименована";
    }
    public void showMeReadyTask() {
        System.out.println("Ваши завершенные задачи " + readyTask.toString());
    }
}
