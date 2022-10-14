import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // создаем меню с операциями для свитча
        System.out.println("Выберите операцию с матрицей :");
        System.out.println("1. Траспонирование матрицы");
        System.out.println("2. Умножение матрицы на число");
        System.out.println("3. Сложение матриц");
        System.out.println("4. Определитель матрицы");
        System.out.println("5. Умножение матриц");
        System.out.print("Введите номер операции: ");
        int q = sc.nextInt();

        switch (q) {

            case 1://кейс для транспонирования матрицы
                System.out.print("Введите количество строк массива: ");
                int a = sc.nextInt();
                System.out.print("Введите количество столбцов массива: ");
                int b = sc.nextInt();
                int[][] arr10 = new int[a][b];
                int[][] arr11 = new int[b][a];

                //Создаем матрицу
                for (int i = 0; i < arr10.length; i++) {
                    for (int j = 0; j < arr10[i].length; j++) {
                        System.out.print("Введите элемент arr[" + i + "][" + j + "]: ");
                        arr10[i][j] = sc.nextInt();
                    }
                }
                //Выводим введеную матрицу
                System.out.println("НАЧАЛЬНАЯ МАТРИЦА: ");
                for (int i = 0; i < arr10.length; i++) {
                    for (int j = 0; j < arr10[i].length; j++) {
                        System.out.print(arr10[i][j]+ " ");
                    }
                    System.out.println();
                }
                //Переворачиваем матрицу
                for (int i = 0; i < arr11.length; i++) {
                    for (int j = 0; j < arr11[i].length; j++) {
                        arr11[i][j] = arr10[j][i];
                    }
                }
                //Выведем транспонированную матрицу
                System.out.println("ТРАНСПАНИРОВАННАЯ МАТРИЦА: ");
                for (int i = 0; i < arr11.length; i++) {
                    for (int j = 0; j < arr11[i].length; j++) {
                        System.out.print(arr11[i][j]+ " ");
                    }
                    System.out.println();
                }
                break;


            case 2: //кейс для умножения матрицы на число
                System.out.print("Введите количество строк массива: ");
                int c = sc.nextInt();
                System.out.print("Введите количество столбцов массива: ");
                int d = sc.nextInt();
                int[][] arr20 = new int[c][d];
                //заполняем матрицу
                for (int i = 0; i < arr20.length; i++) {
                    for (int j = 0; j < arr20[i].length; j++) {
                        System.out.print("Введите элемент arr[" + i + "][" + j + "]: ");
                        arr20[i][j] = sc.nextInt();
                    }
                }
                //спрашиваем число для умножения
                System.out.print("Введите число для умножения массива: ");
                int k = sc.nextInt();
                System.out.println(" ");
                //перемножаем матрицу и сразу выводим
                System.out.println("РЕЗУЛЬТАТ:");
                int[][] arr21 = new int[c][d];
                for (int i = 0; i < arr21.length; i++) {
                    for (int j = 0; j < arr21[i].length; j++) {
                        arr21[i][j] = arr20[i][j] * k;
                        System.out.print(arr21[i][j] +" ");
                    }
                    System.out.println();
                }
                break;

            case 3://кейс для сложения матриц
                System.out.print("Введите количество строк массивов: ");
                int e = sc.nextInt();
                System.out.print("Введите количество столбцов массивов: ");
                int f = sc.nextInt();
                System.out.println();
                System.out.println("ВВЕДИТЕ ПЕРВЫЙ МАССИВ!");
                int[][] arr31 = new int[e][f];
                for (int i = 0; i < arr31.length; i++) {
                    for (int j = 0; j < arr31[i].length; j++) {
                        System.out.print("Введите элемент arr[" + i + "][" + j + "] первого массива: ");
                        arr31[i][j] = sc.nextInt();
                    }
                }
                System.out.println();
                System.out.println("ВВЕДИТЕ ВТОРОЙ МАССИВ!");
                int[][] arr32 = new int[e][f];
                for (int i = 0; i < arr32.length; i++) {
                    for (int j = 0; j < arr32[i].length; j++) {
                        System.out.print("Введите элемент arr[" + i + "][" + j + "] второго массива: ");
                        arr32[i][j] = sc.nextInt();
                    }
                }
                System.out.println();
                System.out.println("СУММА МАТРИЦ:");
                int[][] arr33 = new int[e][f];
                for (int i = 0; i < arr33.length; i++) {
                    for (int j = 0; j < arr33[i].length; j++) {
                        arr33[i][j] = arr31[i][j] + arr32[i][j];
                        System.out.print(arr33[i][j] + " ");

                    }
                    System.out.println();
                }
                break;

            case 4://кейс для определителся матрицы
                System.out.print("Введите величину квадратной матрицы (не более 3): ");
                int s = sc.nextInt();

                System.out.println("ВВЕДИТЕ МАССИВ");
                int[][] arr4 = new int[s][s];
                for (int i = 0; i < arr4.length; i++) {
                    for (int j = 0; j < arr4[i].length; j++) {
                        System.out.print("Введите элемент arr[" + i + "][" + j + "] первого массива: ");
                        arr4[i][j] = sc.nextInt();
                    }
                }
                switch (s) {
                    case 1:
                        System.out.println("Маловата матрица");
                        break;

                    case 2:
                        System.out.println((arr4[0][0] * arr4[1][1]) - (arr4[0][1] * arr4[1][0]));
                        break;

                    case 3:
                        System.out.println((arr4[0][0]*arr4[1][1]*arr4[2][2]+arr4[0][1]*arr4[1][2]*arr4[2][0]+arr4[1][0]*arr4[2][1]*arr4[0][2])-(arr4[2][0]*arr4[1][1]*arr4[0][2]+arr4[2][2]*arr4[0][1]*arr4[1][0]+arr4[0][0]*arr4[2][1]*arr4[1][2]));
                        break;
                };
                break;

            case 5://кейс для умножения матриц между собой
                System.out.print("Введите количество строк массивов: ");
                int g = sc.nextInt();
                System.out.print("Введите количество столбцов массивов: ");
                int h = sc.nextInt();
                System.out.println();

                System.out.println("ВВЕДИТЕ ПЕРВЫЙ МАССИВ!");
                int[][] arr51 = new int[g][h];
                for (int i = 0; i < arr51.length; i++) {
                    for (int j = 0; j < arr51[i].length; j++) {
                        System.out.print("Введите элемент arr[" + i + "][" + j + "] первого массива: ");
                        arr51[i][j] = sc.nextInt();
                    }
                }
                System.out.println();

                System.out.println("ВВЕДИТЕ ВТОРОЙ МАССИВ!");
                int[][] arr52 = new int[g][h];
                for (int i = 0; i < arr52.length; i++) {
                    for (int j = 0; j < arr52[i].length; j++) {
                        System.out.print("Введите элемент arr[" + i + "][" + j + "] второго массива: ");
                        arr52[i][j] = sc.nextInt();
                    }
                }
                System.out.println();

                System.out.println("ПРОИЗВЕДЕНИЕ МАТРИЦ:");
                int[][] arr53 = new int[g][h];
                for (int i = 0; i < arr53.length; i++) {
                    for (int j = 0; j < arr53[i].length; j++) {
                        arr53[i][j] = arr51[i][j] * arr52[i][j];
                        System.out.print(arr53[i][j] + " ");

                    }
                    System.out.println();
                }
                break;

        }
    }
}
