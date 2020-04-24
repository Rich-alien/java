import Task1.*;
import Task2.*;
import Task3.*;

import java.util.Scanner;

public class Main {

    private static Scanner scanner  = new Scanner(System.in);
    public static void main(String[] args) {

//       task1();
   //  task2();
       task3();
    }

    private static void task1(){
        Cat cat = new Cat();
        Cow cow = new Cow();
        Dog dog = new Dog();

        cat.voice();
        cow.voice();
        dog.voice();
    }

    private static void task2(){
        Cat2 cat = new Cat2();
        Bird2 bird = new Bird2();
        Dog2 dog = new Dog2();

        cat.hasWool();
        bird.hasWings();
        dog.hasVoice();
    }

    private static void task3() {

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
}
