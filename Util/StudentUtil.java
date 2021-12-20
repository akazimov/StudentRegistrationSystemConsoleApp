package Util;

import beans.Student;
import Main.config;

public class StudentUtil {
    public static Student[] fillStudent() {
        for(int i=1;i<= config.studentCount;i++){
            System.out.println("Student No "+i);
            String name = InputUtil.requireText("Name");
            String surname = InputUtil.requireText("Surname");
            int age = InputUtil.requireNumber("Age");
            String className = InputUtil.requireText("Class Name");
            Student st = new Student(name, surname, age, className);
            config.students[i] = st;
        }
        return config.students;
    }
    public static void showStudentList() {
        if(config.studentCount == 0) {
            System.out.println("No student found.");
            return;
        }
        for(int i=1;i<=config.studentCount;i++) {
            Student st = config.students[i];
            System.out.println(i+". "+st.getName()+" "+st.getSurname()+" "+st.getAge()+" "+st.getClassName());
        }
    }

    public static void Register() {

        config.studentCount = InputUtil.requireNumber("Number of students");
        config.students = new Student[config.studentCount+1];
        config.students = StudentUtil.fillStudent();
        System.out.println("Successfully registered.");
    }

    public static int findStudent() {
        String name = InputUtil.requireText("Name");
        String surname = InputUtil.requireText("Surname");
        int age = InputUtil.requireNumber("Age");
        String className = InputUtil.requireText("Class Name");
        Student st = new Student(name, surname, age, className);
        int cnt=0;
        for(int i=1;i<=config.studentCount;i++) {
            if(st.getName().contains(config.students[i].getName())) {
                cnt=i;
                System.out.println(cnt+" "+config.students[i].toString());
            }
        }
        int opt = InputUtil.requireNumber("Enter the number of student (-1 if you did not find the one you want)");
        return opt;
    }

    public static void updateStudent() {
        System.out.println("Please enter the information about the student you want to update his/her info");
        int res = StudentUtil.findStudent();
        if(res == -1) {
            System.out.println("Student Not Found.");
        }
        else {
            String name = InputUtil.requireText("Name");
            String surname = InputUtil.requireText("Surname");
            int age = InputUtil.requireNumber("Age");
            String className = InputUtil.requireText("Class Name");
            Student st = new Student(name, surname, age, className);
            config.students[res] = st;
            System.out.println("Successfully Updated.");
        }
    }

    public static void checkIfStudentExists(){
        if(StudentUtil.findStudent() != -1) {
            System.out.println("Student Found.");
        }
        else {
            System.out.println("Student Not Found.");
        }
    }

    public static void checkContinue() {
        int continueOrNot = InputUtil.requireNumber("-----\nContinue? 1/0 (1 = Yes, 0 = No)\nEnter the number");
        if(continueOrNot == 0) {
            System.out.println("Bye");
            System.exit(0);
        }
    }
}
