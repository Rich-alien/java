import Task2.Person;
import Task3.Address;
import Task4.Shirt;
import Task5.PhoneNumber;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

   //    task1();
  //   task2();
//     task3();
//        task4();
        task5();
    }

    public static void task1(){
        String tableGroup = "T_GroupSelected <id_Student, firstName, lastName, id_Group>";
        String tableStudent = "T_Student<id_Student, firstName, lastName, id_Group, dolgCount>";

        System.out.println("Введите название группы");
        String group = scanner.nextLine();
        System.out.println("Введите количество долгов");
        Integer dolg = Integer.parseInt(scanner.nextLine());
        String query = "INSERT INTO T_GroupSelected " + '\n' +
                "SELECT ID_STUDENT, FIRSTNAME, LASTNAME, ID_GROUP " + '\n' +
                "FROM T_Student " + '\n' +
                "WHERE DOLGCOUNT > "+ dolg + '\n' +
                "AND ID_GROUP = '" + group + "';";
        System.out.println(query);
    }

    public static void task2 ( ) {
        String surname, name, middlename;
        System.out.println("Введите Фамилию");
        surname = scanner.nextLine();
        System.out.println("Введите Имя");
        name = scanner.nextLine();
        System.out.println("Введите Отчество");
        middlename = scanner.nextLine();

        Person person = new Person(surname, name, middlename);
        System.out.println(person.getFIO());

    }

    public static void task3(){
        String address = "Россия,Самарская область,Тольятти,б-р Курчатова,11,1,9";
        String address2 = "Америка-Американская область.Нюрок,Американская стрит;60;70.90";
        Address adr = new Address();
        Address adr2 = new Address();
        adr.getAddressWithComa(address);
        System.out.println("------------------");
        adr2.getAddressWithSeparator(address2);
    }

    public static void task4(){
        String[] strings = {"S001, Black Polo Shirt, Black, XL",
                "S002, Black Polo Shirt, Black, L",
                "S003, Blue Polo Shirt, Blue, XL",
                "S004, Blue Polo Shirt, Blue, M",
                "S005, Tan Polo Shirt, Tan, XL",
                "S006, Black T-Shirt, Black, XL",
                "S007, White T-Shirt, White, XL",
                "S008, White T-Shirt, White, L",
                "S009, Green T-Shirt, Green, S",
                "S010, Orande T-Shirt, Orange, S",
                "S011, Maroon Polo Shirt, Maroon, S"};
        List<Shirt> shirts = new ArrayList<>();
        Shirt shirt = new Shirt();
        for (String string: strings) {
            shirts.add(shirt.parseShirt(string));
            System.out.println(shirt);
        }
    }

    public static void task5(){
        String number = "+79023222470";
        String number2 = "89023222470";
        String number3 = "+109023222470";
        String number4 = "119023222470";
        PhoneNumber phoneNumber = new PhoneNumber(number);
        PhoneNumber phoneNumber2 = new PhoneNumber(number2);
        PhoneNumber phoneNumber3 = new PhoneNumber(number3);
        PhoneNumber phoneNumber4 = new PhoneNumber(number4);
        System.out.println(phoneNumber.foo());
        System.out.println(phoneNumber2.foo());
        System.out.println(phoneNumber3.foo());
        System.out.println(phoneNumber4.foo());
    }
}

