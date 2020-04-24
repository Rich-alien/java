import T2.Fibonachi;
import T3.Pascal;
import T4.ComplexNum;
import T4.ComplexOperator;
import T5.SquaEqu;
import T6.Player;
import T7.Address;
import T7.Person;
import T8.Calculator;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {

	private static Scanner scanner = new Scanner(System.in);
		public static void main(String[] args){		int choice;
			do{
				System.out.println("\t 1. Задание2");
				System.out.println("\t 2. Задание3");
				System.out.println("\t 3. Задание4");
				System.out.println("\t 4. Задание5");
				System.out.println("\t 5. Задание6");
				System.out.println("\t 6. Задание7");
				System.out.println("\t 7. Задание8");
				System.out.println("\t 8. exit");
				System.out.println("Select menu item:\n");
				choice = scanner.nextInt();
			} while (choice < 1 || choice > 8);

			System.out.println();

			switch(choice){
				case 1:
					task2();
					break;
				case 2:
					task3();
					break;
				case 3:
					task4();
					break;
				case 4:
					task5();
					break;
				case 5:
					task6();
					break;
				case 6:
					task7();
					break;
				case 7:
					task8();
					break;
				case 8:
					return;
			}
    	//		task2();
//      task3();
//      task4();
//      task5();
//      task6();
//     task7();
//	    task8();
    }

    private static void task2(){

        System.out.println("Введите N");
        int n = scanner.nextInt();
        Fibonachi fib = new Fibonachi();
        int[] array = fib.matrix(n);
        System.out.println(Arrays.toString(array));
    }

	private static void task3(){

        System.out.println("Введите N");
        int n = scanner.nextInt();
        Pascal pas = new Pascal();
        int[][] array = pas.matrix(n);
        for (int i=0;i<n;i++){
            for (int j=0; j<n;j++){
                if (array[i][j] == 0) {System.out.print("  ");}
                else{System.out.print("" + array[i][j] + " ");}
            }
            System.out.println();
        }
    }

	private static void task4() {

		System.out.println("Введите действительную и мнимую части 1го комплесного числа");
		ComplexNum first = new ComplexNum(scanner.nextInt(), scanner.nextInt(), 1); //Создание компл числа
        System.out.println("Введите действительную и мнимую части 2го комплесного числа");
        ComplexNum second = new ComplexNum(scanner.nextInt(), scanner.nextInt(), 2);//Создание компл числа

        System.out.println(first.algForm());                                               //Вывод триг и алг форм
        System.out.println(first.geoForm());
        System.out.println(second.algForm());
        System.out.println(second.geoForm());

        ComplexOperator operations = new ComplexOperator(first, second);                   //Создание оператора
        System.out.println(operations.plus());
        System.out.println(operations.minus());
        System.out.println(operations.increase());
        System.out.println(operations.division());
	}

	private static void task5(){

		System.out.println("Введите a, b, c"); // например 4 7 3, 1 2 1, 3 5 4
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		System.out.println("Уравнение: " + a+"x^2+"+b+"x+"+c+"=0");
		SquaEqu example = new SquaEqu(a, b, c);
		example.calculation();
	}

	private static void task6() {

		boolean isEnd = false;                                               //Для цикла - пока не выявлен победитель
		boolean isFirstRound = true;                                         //Если первый раун
		int indexPlayerMaxPoint=0;                                           //Индекс игрока с макс. очков

		System.out.println("Введите количество участников");
		int kolPlayers = scanner.nextInt();
		System.out.println("Введите количество кубиков у каждого участника");
		int kolDice = scanner.nextInt();
		Player[] players = new Player[kolPlayers];                           //Массив игроков
		for (int i=0; i<kolPlayers; i++){
			players[i]=new Player();                                         //Заполнение массива игроками
		}

		while (!isEnd) {                                                     //Пока не найден победитель
			for (int i = indexPlayerMaxPoint; i < kolPlayers; i++) {         //Цикл от побед в прошлом раунде
				players[i].flipSameTimes(kolDice);
				System.out.println("У игрока номер " + (i+1) + " - " + players[i].getSum() + " очков");
			}
			if (!isFirstRound){
				for (int i = 0; i < indexPlayerMaxPoint; i++) {              //Цикл от 0 до победит в прошлом раунде
					players[i].flipSameTimes(kolDice);
					System.out.println("У игрока номер " + (i+1) + " - " + players[i].getSum() + " очков");
				}
			}
			indexPlayerMaxPoint = 0;

			for (int i = 0; i < kolPlayers; i++) {                           //Поиск игрока с наибольшим счетом
				if (players[i].getSum() > players[indexPlayerMaxPoint].getSum()) {
					indexPlayerMaxPoint = i;
				}
			}
			for (int i = 0; i < kolPlayers; i++) {
				if (players[indexPlayerMaxPoint].getSum()==players[i].getSum()){
					players[i].setCountWin(1);                               //Добавление игроку с наиб счетом победу
					System.out.println("В этом раунде выйграл игрок под номером " + (i+1));
					if (players[i].getCountWin() == 7) {                     //Проверка количества побед у игроков
						System.out.println("У нас есть победитель! Игрок номер: " + (i+1));
						isEnd=true;                                          //Игрок найден - цикл окончен
					}
				}
			}
			System.out.println();
			isFirstRound=false;
		}
	}

	private static void task7(){

		Address add1 = new Address();                                          //Создание 3х адресов
		add1.setDirection("TLT", "Topolinaya");
		Address add2 = new Address();
		add2.setDirection("MSK", "Topolinaya");
		Address add3 = new Address();
		add3.setDirection("SPB", "Lynacharskogo");
		Address add4 = new Address();
		add4.setDirection("SPB", "Lenina");
		Address add5 = new Address();
		add5.setDirection("SPB", "Pobedi");

		Person pers1 = new Person(add1, "Vasya1", "2010-22-22");   //Создание 5 человек
		Person pers2 = new Person(add2, "Vasya2", "2011-12-12");
		Person pers3 = new Person(add3, "Vasya3", "2012-12-12");
		Person pers4 = new Person(add4, "Vasya4", "2013-12-12");
		Person pers5 = new Person(add5, "Vasya5", "2014-12-12");
		Person[] persons = {pers1, pers2, pers3, pers4, pers5};                //Заполнение массива людьми
		for (int i = 0; i < 5; i++) {
			System.out.println(persons[i].toString());
		}

		scanner.nextLine();
		System.out.println("Введите имя человека для поиска");
		String namePers = scanner.nextLine();
		for (int i = 0; i < 5; i++) {
			if (persons[i].getName().equals(namePers)){ System.out.println(persons[i].toString());}
		}

		System.out.println("Введите адрес человека для поиска");
		String addresPers = scanner.nextLine();
		for (int i = 0; i < 5; i++) {
			if (persons[i].getStringAddress().equals(addresPers)){
				System.out.println(persons[i].toString());
			}
		}

		System.out.println("Введите интервал дат для поиска людей в формате YYYY-MM-DD");
		String data1 = scanner.nextLine();
		String data2 = scanner.nextLine();
		SimpleDateFormat ft = new SimpleDateFormat ("yyyy-MM-dd");
		Date dateStart = new Date();
		Date dateEnd = new Date();
		int indexTheOldest=0;                                              //Индекс самого старого человека
		int indexTheYoungest=0;                                              //Индекс самого старого человека
		Date theOldest = persons[indexTheOldest].getDateOfBirth();         //Принимаем дату 1го человека за наиб старого
		Date theYoungest = persons[indexTheYoungest].getDateOfBirth();         //Принимаем дату 1го человека за наиб молодого

		try {
			dateStart = ft.parse(data1);                                   //Парсим даты по форме
			dateEnd = ft.parse(data2);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		for (int i=0; i<5; i++){                                           //Проверяем вхождение даты в промежуток
			if (persons[i].getDateOfBirth().after(dateStart) && persons[i].getDateOfBirth().before(dateEnd)){
				System.out.println(persons[i].toString());
			}
			if (persons[i].getDateOfBirth().after(theOldest)) {            //Ищем самого старого
				theOldest = persons[i].getDateOfBirth();
				indexTheOldest = i;
			}
			if (persons[i].getDateOfBirth().before(theYoungest)) {            //Ищем самого молодого
				theYoungest = persons[i].getDateOfBirth();
				indexTheYoungest = i;
			}
		}
		System.out.println();
		System.out.println("Самый старый человек:");
		System.out.println(persons[indexTheOldest]);
		System.out.println();
		System.out.println("Самый молодой человек:");
		System.out.println(persons[indexTheYoungest]);

		for (int i = 0; i < 5; i++) {
			for (int j = i+1; j < 5; j++) {
				if (persons[i].getAddress().getStreet().equals(persons[j].getAddress().getStreet())){
					System.out.println("Найдено совпадение улиц:");
					System.out.println(persons[i].toString());
					System.out.println("и");
					System.out.println(persons[j].toString());
				}

			}

		}
	}

	private static void task8(){
		System.out.println("Введите начало интервала");
		int intStart = scanner.nextInt();
		System.out.println("Введите конец интервала");
		int intEnd = scanner.nextInt();
		System.out.println("Введите шаг");
		int step = scanner.nextInt();
		System.out.println("Выберите функцию");
		System.out.println("1. cos x");
		System.out.println("2. кубический корень");
		int choice = scanner.nextInt();

		Calculator calc = new Calculator();
		switch (choice){
			case 1: calc.cosinus(intStart, intEnd, step);
				break;
			case 2: calc.koren(intStart, intEnd, step);
				break;
		}
	}
}