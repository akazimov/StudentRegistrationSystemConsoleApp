package beans;

public class Student {
    private String name;
    private String surname;
    private int age;
    private String className;
    // Constructors
    public Student() {

    }
    public Student(String name, String surname, int age, String className) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.className = className;
    }
    // Getter
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getAge() {
        return age;
    }

    public String getClassName() {
        return className;
    }
    // Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public String toString() {
        return this.getName()+" "+this.getSurname()+" "+" "+this.getAge()+this.getClassName();
    }
}
