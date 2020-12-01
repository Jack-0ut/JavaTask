package com.company.Homework1;
import com.company.Homework2.Student;
import java.util.Scanner;
public class Main {

    public static String name;
    public static  int age;


    public static void main(String[] args) {
        Student student = new Student();
        student.answer();
        int[] inputArray;
        Scanner input = new Scanner(System.in);

        System.out.println("Введите свое имя...");
        String name = input.nextLine();
        reverseName(name);
        System.out.println("Введите свой возраст...");
        int ageValue = input.nextInt();
        ageCheck(ageValue);
        System.out.println("Введите 5 чисел...");
        int number = input.nextInt();
        inputArray = new int[5];
        for (int i = 0;i<5;i++){
            inputArray[i] = input.nextInt();
        }
        // Вызов метода getMax () для получения максимального значения
        int max = getMax(inputArray);
        System.out.println("Наибольшее: "+max);

        // Вызов метода getMin () для получения минимального значения
        int min = getMin(inputArray);
        System.out.println("Наименьшее: "+min);

    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++){ if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }


    public static int getMin(int[] inputArray){
        int minValue = inputArray[0];
        for(int i=1;i<inputArray.length;i++){
            if(inputArray[i] < minValue){
                minValue = inputArray[i];
            }
        }
        return minValue;
    }


    public static void reverseName(String name){
        char[] array = name.toCharArray();
        String reversed = "";
        for(int i=array.length-1;i>=0;i--) {
            reversed = reversed + array[i];
        }
        System.out.println(reversed);

    }


    public static void ageCheck(int age){
        if (age < 0){
            System.out.println("Возраст не может быть отрицательным");
        }
        else if (age > 0  && age  < 18){
            System.out.println("Делай уроки!");
        }
        else{
            System.out.println("Езжай в Польшу на клубнику");
        }
    }
}
