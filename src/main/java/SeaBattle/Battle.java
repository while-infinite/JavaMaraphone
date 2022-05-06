package SeaBattle;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.random;

public class Battle {

     public static void fight(Player p1, Player p2){
        String[][] fieldPlayer1 = new String[10][10];
        String[][] fieldPlayer2 = new String[10][10];
        String[][] currentOpponent;
        String[][] battleField;
        Scanner in = new Scanner(System.in);
        String enterNum;
        String[] temp;
        int x = 0;
        int y = 0;
        int numHits = 0;
        String lastPlayer = "";
        boolean isAlive = false;
        int nextPlayer = 0;
        for (int i = 0; i < fieldPlayer1.length; i++) {
            Arrays.fill(fieldPlayer1[i], " 🟨 ");
            Arrays.fill(fieldPlayer2[i], " 🟨 ");
        }
         p1.setPlayground( addShips(p1.getPlayground(), "Player1"));
         System.out.println("--------------------------------------------------------------");
         System.out.println("\n||\n||\n||\n||\n||\n||\n||\n||\n||            Растояние между полями\n||" +
                 "           что бы не подсматривали!\n||\n||\n||\n||\n||\n||\n||\n");
         System.out.println("--------------------------------------------------------------");
         p2.setPlayground( addShips(p2.getPlayground(), "Player2"));

        int firstStep = (int) (Math.random() * 2) + 1;                                          //определяем очерёдность хода
         System.out.println("\n \n \n \n \n \n \n \n \n \n \n \n \n \n \n \n");
        System.out.println("Первый ход делает player" + firstStep);
        if(firstStep == 1) {
            currentOpponent = p2.getPlayground();
            battleField = fieldPlayer2;
        }else{
            currentOpponent = p2.getPlayground();
            battleField = fieldPlayer1;
        }
         for (int i = 0; i < 10; i++)                                                              //отображаем сетку противника для удобства выбора координат
             System.out.printf("  %d ", i);
         for (int i = 0; i < battleField.length; i++) {
             System.out.println();
             System.out.print(i);
             for (int j = 0; j < battleField[i].length; j++) {
                 System.out.print(battleField[i][j]);
             }
         }
            while (numHits != 20){                                                                   //пока не будут уничтожены все корабли
                System.out.println();
                System.out.println("Введите координаты: x,y");
                do {
                    try {
                        enterNum = in.nextLine();
                        System.out.println();
                        temp = enterNum.split(",");
                        x = Integer.parseInt(temp[0]);
                        y = Integer.parseInt(temp[1]);
                        if (battleField[x][y].equals(" 🟥 "))
                            throw new Exception();
                    } catch (Exception e) {
                        System.out.println("Корабль уже подбит, введите координаты повторно!");
                    }
                }while (battleField[x][y].equals(" 🟥 "));

                if (currentOpponent[x][y].equals(" \uD83D\uDEA2  ")) {                                     //если произошло попадание по кораблю
                    battleField[x][y] = " 🟥 ";                                                            //ставим на поле противника красный квадрат
                    int tempX = x;
                    int tempY = y;
                        if(x != 0){                                                                         //двигаясь вверх проверяем уничтожен ли корабль
                            while (tempX !=0){
                                tempX--;
                                if(currentOpponent[tempX][y].equals(" 🟦 "))
                                    break;
                                if(currentOpponent[tempX][y].equals(" \uD83D\uDEA2  ") && !battleField[tempX][y].equals(" 🟥 ")){
                                    isAlive = true;
                                    break;
                                }
                            }
                        }
                        tempX = x;
                        if(x != 9){                                                                            //двигаясь вниз проверяем уничтожен ли корабль
                            while (tempX !=  9){
                                tempX++;
                                if(currentOpponent[tempX][y].equals(" 🟦 "))
                                    break;
                                if(currentOpponent[tempX][y].equals(" \uD83D\uDEA2  ") && !battleField[tempX][y].equals(" 🟥 ")){
                                    isAlive = true;
                                    break;
                                }
                            }
                        }
                    if(y != 0){                                                                                      //двигаясь влево проверяем уничтожен ли корабль
                        while (tempY != 0){
                            tempY--;
                            if(currentOpponent[x][tempY].equals(" 🟦 "))
                                break;
                            if(currentOpponent[x][tempY].equals(" \uD83D\uDEA2  ") && !battleField[x][tempY].equals(" 🟥 ")){
                                isAlive = true;
                                break;
                            }
                        }
                    }
                    tempY = y;
                    if(y != 9){                                                                                        //двигаясь вправо проверяем уничтожен ли корабль
                        while (tempY != 9){
                            tempY++;
                            if(currentOpponent[x][tempY].equals(" 🟦 "))
                                break;
                            if(currentOpponent[x][tempY].equals(" \uD83D\uDEA2  ") && !battleField[x][tempY].equals(" 🟥 ")){
                                isAlive = true;
                                break;
                            }
                        }
                    }
                    if(isAlive)                                                                                            //если цела хоть одна клетка корабля
                        System.out.println("Попадание!");
                    else
                        System.out.println("Утопил!");
                    isAlive = false;
                    numHits++;
                    for (int i = 0; i < 10; i++)                                                                            //отображаем сетку противника
                        System.out.printf("  %d ", i);
                    for (int i = 0; i < battleField.length; i++) {
                        System.out.println();
                        System.out.print(i);
                        for (int j = 0; j < battleField[i].length; j++) {
                            System.out.print(battleField[i][j]);
                        }
                    }
                    if(currentOpponent == p2.getPlayground()){                                                                            //если текущий игрок является игроком номер 1, то
                        fieldPlayer2 = battleField;                                                                            //обнавляем поле противника
                        lastPlayer = "player1";
                    }else{                                                                                                     //иначе обнавляем поле игрока номер 2
                        fieldPlayer1 = battleField;
                        lastPlayer = "player2";
                    }
                }else {
                    System.out.println("Мимо!");
                    battleField[x][y] = " 🟢 ";                                                                                 //если мимо, то ставим зелёный кружок
                    for (int i = 0; i < 10; i++)                                                                                 //отображаем поле противника
                        System.out.printf("  %d ", i);
                    for (int i = 0; i < battleField.length; i++) {
                        System.out.println();
                        System.out.print(i);
                        for (int j = 0; j < battleField[i].length; j++) {
                            System.out.print(battleField[i][j]);
                        }
                    }
                    if (currentOpponent == p2.getPlayground()) {                                                                               //если текущий игрок является игроком номер 1, то
                        fieldPlayer2 = battleField;                                                                                 //обнавляем поле потивника
                        currentOpponent = p1.getPlayground();                                                                                  //передаём управление другому игроку
                        battleField = fieldPlayer1;                                                                                  //меняем местами поля игроков
                        System.out.println('\n');
                        for (int i = 0; i < 10; i++)                                                                                 //отображаем поле противника
                            System.out.printf("  %d ", i);
                        for (int i = 0; i < battleField.length; i++) {
                            System.out.println();
                            System.out.print(i);
                            for (int j = 0; j < battleField[i].length; j++) {
                                System.out.print(battleField[i][j]);
                            }
                        }
                    } else {                                                                                                           //иначе всё наоборот
                        fieldPlayer1 = battleField;
                        currentOpponent = p2.getPlayground();
                        battleField = fieldPlayer2;
                        System.out.println('\n');
                        for (int i = 0; i < 10; i++)                                                                                   //отображаем поле противника
                            System.out.printf("  %d ", i);
                        for (int i = 0; i < battleField.length; i++) {
                            System.out.println();
                            System.out.print(i);
                            for (int j = 0; j < battleField[i].length; j++) {
                                System.out.print(battleField[i][j]);
                            }
                        }
                    }
                }
                if(currentOpponent == p2.getPlayground())                                                                                              //определяем очередность хода
                    nextPlayer = 1;
                else nextPlayer = 2;
                System.out.println("");
                System.out.println("Ход делает игрок player" + nextPlayer);

            }
            if(lastPlayer.equals("player1")) {
                System.out.println("Победил player1!");
            }
            else {
                System.out.println("Победил player2!");
            }

    }


    public static void setAura(String[][] player, String shipCor, int shipSize) throws ScannerException {
         int countSize = 0;
         int countCor = 0;
        String[] splitString = shipCor.split(";");
        int[][] num = new int[splitString.length][splitString[0].length() - 1];
        for (int i = 0; i < splitString.length; i++) {
            countSize++;
            String[] temp = splitString[i].split(",");
            for (int j = 0; j < temp.length; j++) {                                                               //проеобразуем строковый ввод координат в числовой массив
                num[i][j] = Integer.parseInt(temp[j]);
                countCor++;
            }
        }
        if(countSize != shipSize && countCor != shipSize*2)                                                        //проверяем соответствует ли колличество введённых координат размеру корабля
            throw new ScannerException("5");
        int[] sizeX = new int[num.length];                                                                          //создаём отдедбный массив для х-ов
        int[] sizeY = new int[num.length];                                                                          //для у-ов
        int previousPointX = num[0][0];                                                                             //определяем переменную для хранения предыдущего значения х
        int previousPointY = num[0][1];                                                                             //определяем переменную для хранения предыдущего значения у
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (j == num[i].length - 1) {
                    int x = num[i][j - 1];
                    int y = num[i][j];
                    if (x > 9 || y > 9) {                                                                           //проверяем выходят ли координаты за пределы массива
                        for(int k = 0; k < i; k++)                                                                  //если да, то обнуляем предыдущие введённые координаты и кидаем в исключение
                            player[sizeX[k]][sizeY[k]] = " 🟨 ";
                        throw new ScannerException("3");
                    }
                    if (player[x][y].equals(" \uD83D\uDEA2  ") || player[x][y].equals(" 🟦 ")) {
                        for(int k = 0; k < i; k++)
                            player[sizeX[k]][sizeY[k]] = " 🟨 ";
                        throw new ScannerException("1");
                    }
                    else {

                            if (x == previousPointX + 1 || x == previousPointX - 1 || x == previousPointX) {          //проверяем последовательность введённых координат, не разбросаны ли они по полю
                                if (y == previousPointY + 1 || y == previousPointY - 1 || y == previousPointY) {      //сравнивая с предыдущей координатой
                                previousPointX = x;
                                previousPointY = y;
                                    sizeX[i] = x;
                                    sizeY[i] = y;
                                    if(i > 0) {
                                        if (sizeX[i - 1] != sizeX[i]) {                                                //проверяем ровно ли строиться корабль: текущая и предыдущая координаты х либо у
                                            if (sizeY[i - 1] != sizeY[i]) {                                            //должны бать одинаковы
                                                for(int k = 0; k < i; k++)
                                                    player[sizeX[k]][sizeY[k]] = " 🟨 ";
                                                throw new ScannerException("4");
                                            }
                                        }
                                    }
                                    player[x][y] = " \uD83D\uDEA2  ";
                                } else {
                                    for(int k = 0; k < i; k++)
                                        player[sizeX[k]][sizeY[k]] = " 🟨 ";
                                    throw new ScannerException("2");
                                }
                            }

                    }
                }
            }
        }
        int end = sizeX.length - 1;
        ////////////////////Корабль однопалубный////////////////////////////////////////////
        if (sizeX.length == 1) {
            if (sizeX[0] != 0 && sizeY[0] != 0) {                                         //проверяем есть ли пространство сверху и слева
                player[sizeX[0] - 1][sizeY[0] - 1] = " 🟦 ";
                player[sizeX[0] - 1][sizeY[0]] = " 🟦 ";
                player[sizeX[0]][sizeY[0] - 1] = " 🟦 ";
            }
            if (sizeX[0] != 0 && sizeY[0] != 9) {                                           //проверяем есть ли пространство сверху и справа
                player[sizeX[0] - 1][sizeY[0] + 1] = " 🟦 ";
                player[sizeX[0] - 1][sizeY[0]] = " 🟦 ";
                player[sizeX[0]][sizeY[0] + 1] = " 🟦 ";
            }
            if (sizeX[0] != 9 && sizeY[0] != 0) {                                             //проверяем есть ли пространство снизу и слева
                player[sizeX[0] + 1][sizeY[0] - 1] = " 🟦 ";
                player[sizeX[0] + 1][sizeY[0]] = " 🟦 ";
                player[sizeX[0]][sizeY[0] - 1] = " 🟦 ";
            }
            if (sizeX[0] != 9 && sizeY[0] != 9) {                                             //проверяем есть ли пространство снизу и справа
                player[sizeX[0] + 1][sizeY[0] + 1] = " 🟦 ";
                player[sizeX[0] + 1][sizeY[0]] = " 🟦 ";
                player[sizeX[0]][sizeY[0] + 1] = " 🟦 ";
            }
            //////////////////////////////////Корабль неоднопалубный///////////////////////////////////////
        } else {

            ////////////////////Корабль строиться вниз//////////////////////////////////////////////
            if (sizeX[0] < sizeX[1] && sizeY[0] == sizeY[1]) {
                if (sizeY[0] != 9) {                                                            //поверяем есть ли справа пространство
                    for (int i = sizeX[0]; i <= sizeX[end]; i++)
                        player[i][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeY[0] != 0) {                                                           //проверяем есть ли слева пространство
                    for (int i = sizeX[0]; i <= sizeX[end]; i++)
                        player[i][sizeY[0] - 1] = " 🟦 ";
                }
                if (sizeX[0] != 0 && sizeY[0] != 9) {                                         //проверяем есть ли пространство сверху и справа
                    player[sizeX[0] - 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[0] - 1][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeX[end] != 9 && sizeY[0] != 0) {                                          //проверяем есть ли пространство снизу и слева
                    player[sizeX[end] + 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[end] + 1][sizeY[0] - 1] = " 🟦 ";
                }
                if (sizeX[end] != 9 && sizeY[0] != 9) {                                         //проверяем есть ли пространство снизу и справа
                    player[sizeX[end] + 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[end] + 1][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeX[0] != 0 && sizeY[0] != 0) {                                              //проверяем есть ли пространство сверху и слева
                    player[sizeX[0] - 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[0] - 1][sizeY[0] - 1] = " 🟦 ";
                }
            }
            //////////////////////Корабль строиться вверх///////////////////////////////////////
            if (sizeX[0] > sizeX[1] && sizeY[0] == sizeY[1]) {
                if (sizeY[0] != 9) {                                                            //поверяем есть ли справа пространство
                    for (int i = sizeX[0]; i >= sizeX[end]; i--)
                        player[i][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeY[0] != 0) {                                                           //проверяем есть ли слева пространство
                    for (int i = sizeX[0]; i >= sizeX[end]; i--)
                        player[i][sizeY[0] - 1] = " 🟦 ";
                }
                if (sizeX[end] != 0 && sizeY[0] != 9) {                                         //проверяем есть ли пространство сверху и справа
                    player[sizeX[end] - 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[end] - 1][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeX[0] != 9 && sizeY[0] != 0) {                                          //проверяем есть ли пространство снизу и слева
                    player[sizeX[0] + 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[0] + 1][sizeY[0] - 1] = " 🟦 ";
                }
                if (sizeX[0] != 9 && sizeY[0] != 9) {                                         //проверяем есть ли пространство снизу и справа
                    player[sizeX[0] + 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[0] + 1][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeX[end] != 0 && sizeY[0] != 0) {                                              //проверяем есть ли пространство сверху и слева
                    player[sizeX[end] - 1][sizeY[0]] = " 🟦 ";
                    player[sizeX[end] - 1][sizeY[0] - 1] = " 🟦 ";
                }
            }
            ///////////////////////Корабль строиться влево///////////////////////////////////////////////
            if (sizeY[0] > sizeY[1] && sizeX[0] == sizeX[1]) {
                if (sizeX[0] != 0) {                                                                  //проверяем пространство сверху
                    for (int i = sizeY[0]; i >= sizeY[end]; i--)
                        player[sizeX[0] - 1][i] = " 🟦 ";
                }
                if (sizeX[0] != 9) {                                                                  //проверяем пространство снизу
                    for (int i = sizeY[0]; i >= sizeY[end]; i--)
                        player[sizeX[0] + 1][i] = " 🟦 ";
                }
                if (sizeX[0] != 9 && sizeY[0] != 9) {                                                 //проверяем есть пространство снизу и справа
                    player[sizeX[0]][sizeY[0] + 1] = " 🟦 ";
                    player[sizeX[0] + 1][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeX[0] != 9 && sizeY[end] != 0) {                                                //проверяем есть пространство снизу и слева
                    player[sizeX[0]][sizeY[end] - 1] = " 🟦 ";
                    player[sizeX[0] + 1][sizeY[end] - 1] = " 🟦 ";
                }
                if (sizeX[0] != 0 && sizeY[0] != 9) {                                                //проверяем есть пространство сверху и справа
                    player[sizeX[0]][sizeY[0] + 1] = " 🟦 ";
                    player[sizeX[0] - 1][sizeY[0] + 1] = " 🟦 ";
                }
                if (sizeX[0] != 0 && sizeY[end] != 0) {                                                //проверяем есть пространство сверху и слева
                    player[sizeX[0]][sizeY[end] - 1] = " 🟦 ";
                    player[sizeX[0] - 1][sizeY[end] - 1] = " 🟦 ";
                }
            }
            /////////////////////////////Корабль строиться вправо//////////////////////////////////////////////
            if (sizeY[0] < sizeY[1] && sizeX[0] == sizeX[1]) {
                if (sizeX[0] != 0) {                                                                  //проверяем пространство сверху
                    for (int i = sizeY[0]; i <= sizeY[end]; i++)
                        player[sizeX[0] - 1][i] = " 🟦 ";
                }
                if (sizeX[0] != 9) {                                                                  //проверяем пространство снизу
                    for (int i = sizeY[0]; i <= sizeY[end]; i++)
                        player[sizeX[0] + 1][i] = " 🟦 ";
                }
                if (sizeX[0] != 9 && sizeY[end] != 9) {                                                 //проверяем есть пространство снизу и справа
                    player[sizeX[0]][sizeY[end] + 1] = " 🟦 ";
                    player[sizeX[0] + 1][sizeY[end] + 1] = " 🟦 ";
                }
                if (sizeX[0] != 9 && sizeY[0] != 0) {                                                //проверяем есть пространство снизу и слева
                    player[sizeX[0]][sizeY[0] - 1] = " 🟦 ";
                    player[sizeX[0] + 1][sizeY[0] - 1] = " 🟦 ";
                }
                if (sizeX[0] != 0 && sizeY[end] != 9) {                                                //проверяем есть пространство сверху и справа
                    player[sizeX[0]][sizeY[end] + 1] = " 🟦 ";
                    player[sizeX[0] - 1][sizeY[end] + 1] = " 🟦 ";
                }
                if (sizeX[0] != 0 && sizeY[0] != 0) {                                                //проверяем есть пространство сверху и слева
                    player[sizeX[0]][sizeY[0] - 1] = " 🟦 ";
                    player[sizeX[0] - 1][sizeY[0] - 1] = " 🟦 ";
                }
            }
        }

    }

    public static String[][] addShips(String[][] player, String playerNum) {
        Scanner in = new Scanner(System.in);
        String battleship;
        String[] cruiser = new String[2];
        String[] destroyer = new String[3];
        String[] boat = new String[4];
        String error;


        System.out.println("Начнём расставлять корабли на поле " + playerNum);
        for (int i = 0; i < 10; i++)
            System.out.printf("  %d ", i);
        for (int i = 0; i < player.length; i++) {
            System.out.println();
            System.out.print(i);
            for (int j = 0; j < player[i].length; j++) {
                System.out.print(player[i][j]);
            }
        }
        System.out.println();
        do{
            error = null;
            try{
                System.out.println("Введи координаты четырёхпалубного корабля (формат: x,y;x,y;x,y;x,y)");
                battleship = in.nextLine();
                Pattern pattern = Pattern.compile("^([0-9])(,)([0-9])(;)([0-9])(,)([0-9])(;)([0-9])(,)([0-9])(;)([0-9])(,)([0-9])");
                Matcher match = pattern.matcher(battleship);
                boolean found = match.matches();
                if(!found)
                    throw new ScannerException("6");

                setAura(player, battleship, 4);
               } catch (ScannerException e) {
                switch (e.getDescription()) {
                    case "1":
                        System.out.println("Координаты уже заняты, введите данные повторно");
                        error = "1";
                        break;
                    case "2":
                        System.out.println("Вышли за пределы постройки корабля, введите данные повторно");
                        error = "1";
                        break;
                    case "3":
                        System.out.println("Вышли за пределы игрового поля, повторите ввод");
                        error = "1";
                        break;
                    case "4":
                        System.out.println("Вы строите корабль в неверном направлении, повторите ввод");
                        error = "1";
                        break;
                    case "5":
                        System.out.println("Вы ввели неверное колличесвто координат, повторите ввод");
                        error = "1";
                        break;
                    case "6":
                        System.out.println("Неверный формат ввода данных, повторите ввод");
                        error = "1";
                        break;
                    default:
                        System.out.println("Неизвестная ошибка ввода данных");
                        error = "1";
                        break;
                }
            }
        }while (error != null);
            for (int i = 0; i < 10; i++)
                System.out.printf("  %d ", i);
            for (int i = 0; i < player.length; i++) {
                System.out.println();
                System.out.print(i);
                for (int j = 0; j < player[i].length; j++) {
                    System.out.print(player[i][j]);
                }
            }
            System.out.println();


        for (int i = 0; i < cruiser.length; i++) {
            do {
                error = null;
                try {
                    System.out.println("Введи координаты " + (i + 1) + "-го трёхпалубного корабля (формат: x,y;x,y;x,y)");
                    cruiser[i] = in.nextLine();
                    Pattern pattern = Pattern.compile("^([0-9])(,)([0-9])(;)([0-9])(,)([0-9])(;)([0-9])(,)([0-9])");
                    Matcher match = pattern.matcher(cruiser[i]);
                    boolean found = match.matches();
                    if(!found)
                        throw new ScannerException("6");

                    setAura(player, cruiser[i], 3);
                } catch (ScannerException e) {
                    switch (e.getDescription()) {
                        case "1":
                            System.out.println("Координаты уже заняты, введите данные повторно");
                            error = "1";
                            break;
                        case "2":
                            System.out.println("Вышли за пределы постройки корабля, введите данные повторно");
                            error = "1";
                            break;
                        case "3":
                            System.out.println("Вышли за пределы игрового поля, повторите ввод");
                            error = "1";
                            break;
                        case "4":
                            System.out.println("Вы строите корабль в неверном направлении, повторите ввод");
                            error = "1";
                            break;
                        case "5":
                            System.out.println("Вы ввели неверное колличесвто координат, повторите ввод");
                            error = "1";
                            break;
                        case "6":
                            System.out.println("Неверный формат ввода данных, повторите ввод");
                            error = "1";
                            break;
                        default:
                            System.out.println("Неизвестная ошибка ввода данных");
                            error = "1";
                    }
                }

                    for (int j = 0; j < 10; j++)
                        System.out.printf("  %d ", j);
                    for (int j = 0; j < player.length; j++) {
                        System.out.println();
                        System.out.print(j);
                        for (int k = 0; k < player[j].length; k++) {
                            System.out.print(player[j][k]);
                        }
                    }

                System.out.println();
            } while (error != null);
        }
        System.out.println();


        for (int i = 0; i < destroyer.length; i++) {
            do {
                error = null;
                try {
                    System.out.println("Введи координаты " + (i + 1) + "-го двухпалубного корабля (формат: x,y;x,y)");
                    destroyer[i] = in.nextLine();
                    Pattern pattern = Pattern.compile("^([0-9])(,)([0-9])(;)([0-9])(,)([0-9])");
                    Matcher match = pattern.matcher(destroyer[i]);
                    boolean found = match.matches();
                    if(!found)
                        throw new ScannerException("6");
                    setAura(player, destroyer[i], 2);
                } catch (ScannerException e) {
                    switch (e.getDescription()) {
                        case "1":
                            System.out.println("Координаты уже заняты, введите данные повторно");
                            error = "1";
                            break;
                        case "2":
                            System.out.println("Вышли за пределы постройки корабля, введите данные повторно");
                            error = "1";
                            break;
                        case "3":
                            System.out.println("Вышли за пределы игрового поля, повторите ввод");
                            error = "1";
                            break;
                        case "4":
                            System.out.println("Вы строите корабль в неверном направлении, повторите ввод");
                            error = "1";
                            break;
                        case "5":
                            System.out.println("Вы ввели неверное колличесвто координат, повторите ввод");
                            error = "1";
                            break;
                        case "6":
                            System.out.println("Неверный формат ввода данных, повторите ввод");
                            error = "1";
                            break;
                        default:
                            System.out.println("Неизвестная ошибка ввода данных");
                            error = "1";
                    }
                }

                for (int j = 0; j < 10; j++)
                    System.out.printf("  %d ", j);
                for (int j = 0; j < player.length; j++) {
                    System.out.println();
                    System.out.print(j);
                    for (int k = 0; k < player[j].length; k++) {
                        System.out.print(player[j][k]);
                    }
                }
                System.out.println();
            } while (error != null);
        }
        System.out.println();


        for (int i = 0; i < boat.length; i++) {
            do {
                error = null;
                try {
                    System.out.println("Введи координаты " + (i + 1) + "-го однопалубного корабля (формат: x,y)");
                    boat[i] = in.nextLine();
                    Pattern pattern = Pattern.compile("^([0-9])(,)([0-9])");
                    Matcher match = pattern.matcher(boat[i]);
                    boolean found = match.matches();
                    if(!found)
                        throw new ScannerException("6");

                    setAura(player, boat[i], 1);
                } catch (ScannerException e) {
                    switch (e.getDescription()) {
                        case "1":
                            System.out.println("Координаты уже заняты, введите данные повторно");
                            error = "1";
                            break;
                        case "2":
                            System.out.println("Вышли за пределы постройки корабля, введите данные повторно");
                            error = "1";
                            break;
                        case "3":
                            System.out.println("Вышли за пределы игрового поля, повторите ввод");
                            error = "1";
                            break;
                        case "4":
                            System.out.println("Вы строите корабль в неверном направлении, повторите ввод");
                            error = "1";
                            break;
                        case "5":
                            System.out.println("Вы ввели неверное колличесвто координат, повторите ввод");
                            error = "1";
                             break;
                        case "6":
                            System.out.println("Неверный формат ввода данных, повторите ввод");
                            error = "1";
                            break;
                            default:
                            System.out.println("Неизвестная ошибка ввода данных");
                            error = "1";
                    }
                }

                for (int j = 0; j < 10; j++)
                    System.out.printf("  %d ", j);
                for (int j = 0; j < player.length; j++) {
                    System.out.println();
                    System.out.print(j);
                    for (int k = 0; k < player[j].length; k++) {
                        System.out.print(player[j][k]);
                    }
                }
                System.out.println();
            } while (error != null);
        }
        System.out.println();

        return player;
    }

    public static void main(String[] args) {
        Player player1 = new Player();
        Player player2 = new Player();
        fight(player1, player2);


    }
}
