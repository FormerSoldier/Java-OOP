package model;

/**
 * Created by 桐爷哥 on 2019/6/28.
 */
public class Student {
    private String name;
    private int age;
    private String sex;
    private int studentNumber;

    public Student(){}
    public Student(String name, int age, String sex, int studentNumber){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.studentNumber = studentNumber;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", studentNumber=" + studentNumber +
                '}';
    }
}
