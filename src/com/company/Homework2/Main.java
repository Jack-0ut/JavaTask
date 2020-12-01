package com.company.Homework2;
import java.util.Scanner;
import com.company.Homework2.Student;

public class Main {
    public static void main(String[] args){
        Student student = new Student();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String myName= scanner.nextLine();
        System.out.println("Enter your age");
        int age = scanner.nextInt();


        student.setAge(age);
        student.setName(myName);
        System.out.println("Hello " + student.getName()+"...\n What do you tell about yourself?");
        System.out.println("Hello...My name is  "+student.getName()+" I'm "  +student.getAge() +" and I'd like to tell you interesting story");

        student.answer();
        // student.Eat()
        // student.prepareToAnswer
        // private methods aren't accessible here because it visible just in class Student


    }
}
