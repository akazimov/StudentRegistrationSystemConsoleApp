package Main;

import Util.InputUtil;
import Util.StudentUtil;

public class Main {
    public static void main(String[] args) {
        while(true) {
            int menu = InputUtil.requireNumber("-----\nWhat do you want to do?\n1. Register Student\n2. Show All Students\n3. Find Student\n4. Update Student Info\n5. Exit\n-----\nChoose your option");
            switch(menu) {
                case 1:
                    StudentUtil.Register();
                    break;
                case 2:
                    StudentUtil.showStudentList();
                    break;
                case 3:
                    StudentUtil.checkIfStudentExists();
                    break;
                case 4:
                    StudentUtil.updateStudent();
                    break;
                case 5:
                    System.out.println("Bye");
                    System.exit(0);
            }
            StudentUtil.checkContinue();
        }
    }
}
