package day44_Constructor;

public class Student {
    String name;
    int age;
    char gender;
    static String schoolName="Cybertek University";

    public Student(String name,int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;

    }

/*
    public void setStudentInfo(String name,int age, char gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
*/

    public String toString(){
        return "Student name: "+name+"\nStudent age: "+age+"\nStudent gender: "+gender+", School Name: "+schoolName;
    }







}
