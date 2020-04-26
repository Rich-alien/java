import Task1.DateTest;
import Task1.RegularExpressions;
import Task1.ResourceBundles;
import Task1.TestCalendar;
import Task2.Person;
import Task3.DateAndCalendar;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

       task1(args);
//        task2();
 //       task3();
    }

    public static void task1(String[] args){
        RegularExpressions regularExpressions = new RegularExpressions();
        regularExpressions.test();
        System.out.println("___________________");
        ResourceBundles res = new ResourceBundles();
        res.test(args);
        System.out.println("___________________");
        DateTest dateTest = new DateTest();
        dateTest.test();
        System.out.println("___________________");
        TestCalendar testCalendar = new TestCalendar();
        testCalendar.test();
    }

    public static void task2(){
        String surname, name, middlename;
        System.out.println("Введите Фамилию");
        surname = scanner.nextLine();
        System.out.println("Введите Имя");
        name = scanner.nextLine();
        System.out.println("Введите Отчество");
        middlename = scanner.nextLine();
        System.out.println("Введите год рождения");
        Integer year = scanner.nextInt();
        year-=1900;
        System.out.println("Введите месяц рождения");
        Integer mounth = scanner.nextInt();
        mounth--;
        System.out.println("Введите день рождения");
        Integer day = scanner.nextInt();
        Date date = new Date(year, mounth,day);

        Person person = new Person(surname, name, middlename, date);
        System.out.println(person.toString());

    }

    public static void task3(){
        System.out.println("Введите год");
        Integer year = scanner.nextInt();
        System.out.println("Введите месяц");
        Integer month = scanner.nextInt();
        System.out.println("Введите день");
        Integer day = scanner.nextInt();
        System.out.println("Введите часы");
        Integer hour = scanner.nextInt();
        System.out.println("Введите минуты");
        Integer minutes = scanner.nextInt();
        DateAndCalendar dateAndCalendar = new DateAndCalendar();
        Integer[] arr = {year, month, day, hour, minutes};
        System.out.println(dateAndCalendar.printDate(arr).toString());
        System.out.println(dateAndCalendar.printCalendare(arr).getTime().toString());

    }
}
