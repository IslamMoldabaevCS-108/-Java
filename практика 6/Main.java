import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

class Task {
    private final int id;
    private final String description;
    private final String category;
    private boolean isDone;

    public Task(int id, String description, String category, boolean isDone) {
        this.id = id;
        this.description = description;
        this.category = category;
        this.isDone = isDone;
        java.time.LocalDate.now();
    }
    public int getId() {
        return id;
    }
    public String getDescription() {
        return description;
    }
    public String getCategory() {
        return category;
    }
    public boolean isDone() {
        return isDone;
    }
    public void markAsDone() {
        isDone = true;
    }
    @Override
    public String toString() {
        return id + ". " + description + " (Категория: " + category + ", Статус: " + (isDone ? "Выполнено" : "Не выполнено") + ")";
    }

}

class TodoList {
    private final List<Task> tasks = new ArrayList<>();
    private final HashSet<String> categories = new HashSet<>();
    private final HashMap<String, List<Task>> tasksByCategory = new HashMap<>();

    public void addTask(Task task) {
        tasks.add(task);
        categories.add(task.getCategory());
        tasksByCategory.computeIfAbsent(task.getCategory(), _ -> new ArrayList<>()).add(task);
        System.out.println("Задача \"" + task.getDescription() + "\" добавлена.");
    }
    public void markTaskAsDone(int id) {
        for (Task task : tasks) {
            if (task.getId() == id) {
                task.markAsDone();
                System.out.println("Задача \"" + task.getDescription() + "\" отмечена как выполненная.");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
    }
    public void removeTask(int id) {
        Iterator<Task> iterator = tasks.iterator();
        while (iterator.hasNext()) {
            Task task = iterator.next();
            if (task.getId() == id) {
                iterator.remove();
                tasksByCategory.get(task.getCategory()).remove(task);
                System.out.println("Задача \"" + task.getDescription() + "\" удалена.");
                return;
            }
        }
        System.out.println("Задача с ID " + id + " не найдена.");
    }
    public void displayAllTasks() {
        System.out.println("=== Вывод всех задач ===");
        for (Task task : tasks) {
            System.out.println(task);
        }
    }
    public void displayTasksByCategory() {
        System.out.println("=== Вывод задач по категориям ===");
        for (String category : categories) {
            System.out.println("Категория: " + category);
            for (Task task : tasksByCategory.get(category)) {
                System.out.println("- " + task);
            }
        }
    }
    public void searchTasks(String keyword) {
        System.out.println("=== Поиск задач по ключевому слову \"" + keyword + "\" ===");
        boolean found = false;
        for (Task task : tasks) {
            if (task.getDescription().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println("Найдена задача: " + task);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Задачи не найдены.");
        }
    }
    public void displayStatistics() {
        int completed = 0;
        int notCompleted = 0;
        for (Task task : tasks) {
            if (task.isDone()) {
                completed++;
            } else {
                notCompleted++;
            }
        }
        System.out.println("=== Статистика ===");
        System.out.println("Всего задач: " + tasks.size());
        System.out.println("Выполнено: " + completed);
        System.out.println("Не выполнено: " + notCompleted);
    }
}

public class Main {
    public static void main(String[] args) {
        TodoList todoList = new TodoList();
        todoList.addTask(new Task(1, "Купить молоко", "Покупки", false));
        todoList.addTask(new Task(2, "Позвонить маме", "Личное", false));
        todoList.addTask(new Task(3, "Подготовить отчет", "Работа", false));
        todoList.displayAllTasks();
        todoList.markTaskAsDone(1);
        todoList.searchTasks("отчет");
        todoList.displayTasksByCategory();
        todoList.displayStatistics();
        todoList.addTask(new Task(4, "Сходить в спортзал", "Здоровье", false));
        todoList.displayAllTasks();
        todoList.removeTask(2);
        todoList.displayAllTasks();
        todoList.displayStatistics();
    }
}
