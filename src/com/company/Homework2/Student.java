package com.company.Homework2;

public class Student {
    public int age;
    private static String name;

    public void answer(){
        System.out.println("I don't know what to say.This stupid  math ");
        PrepareToAnswer();
        Eat();
    }

    private void PrepareToAnswer(){
        System.out.println("I prepare to answer this dump questions...\n But my teacher marked me 2");

    }
    private void Eat(){
        System.out.println("After all I have a dinner");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        if (age < 0){
            System.out.println("It's not correct age!");
            this.age = 18;
        }else if ( age < 18){
            System.out.println("Get out of here");
        }else if (age < 100){
            System.out.println("You're welcome");
        }else{
            System.out.println("It's not correct age!");
            this.age = 18;
        }
    }

    public  String getName() {
        return name;
    }

    public  void setName(String name) {
        Student.name = name;
    }
}

