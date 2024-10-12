class Student {

    private final String name;
    private final int age;
    private final String major;

    public Student(String name, int age, String major) {
        this.name = name;
        this.age = age;
        this.major = major;
    }

    public int getAge() {
        return age;
    }

    public void displayInfo() {
        System.out.println("Имя: " + name);
        System.out.println("Возраст: " + age);
        System.out.println("Специальность: " + major);
        System.out.println("------------------------");
    }
    public static Student findOldestStudent(Student[] students) {
        Student oldestStudent = students[0];
        for (Student student : students) {
            if (student.getAge() > oldestStudent.getAge()) {
                oldestStudent = student;
            }
        }
        return oldestStudent;
    }
    public static void main(String[] args) {
        Student[] students = new Student[3];
        students[0] = new Student("Алексей", 20, "Информатика");
        students[1] = new Student("Мария", 22, "Филология");
        students[2] = new Student("Дмитрий", 21, "Экономика");
        System.out.println("Информация о студентах:");
        for (Student student : students) {
            student.displayInfo();
        }
        Student oldestStudent = findOldestStudent(students);
        System.out.println("Самый старший студент:");
        oldestStudent.displayInfo();
    }
}
