public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int[] number1 = new int[12];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = 0; i < 3; i++) {
            System.out.println(number1[i]);
        }
        System.out.println();
        float[] number2 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < number2.length; i++) {
            System.out.println(number2[i]);
        }
        System.out.println();
        double[] number3 = {1_000_000_0000l, -3l, -90l, 210421402140240l};
        for (int i = 0; i < number3.length; i++) {
            System.out.println(number3[i]);
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = 0; i < number1.length; i++) {
            if (i < number1.length - 1) {
                System.out.print(number1[i] + ", ");
            } else {
                System.out.print(number1[i]);
            }
        }
        System.out.println();
        float[] number2 = {1.57f, 7.654f, 9.986f};
        for (int i = 0; i < number2.length; i++) {
            if (i < number2.length - 1) {
                System.out.print(number2[i] + ", ");
            } else {
                System.out.print(number2[i]);
            }
        }
        System.out.println();
        double[] number3 = {1_000_000_0000l, -3l, -90l, 210421402140240l};
        for (int i = 0; i < number3.length; i++) {
            if (i < number3.length - 1) {
                System.out.print(number3[i] + ", ");
            } else {
                System.out.print(number3[i]);
            }
        }
        System.out.println();
    }

    public static void task3() {
        System.out.println("Задача 3");
        int[] number1 = new int[3];
        number1[0] = 1;
        number1[1] = 2;
        number1[2] = 3;
        for (int i = number1.length - 1; i >= 0; --i) {
            if (i > 0) {
                System.out.print(number1[i] + ", ");
            } else {
                System.out.print(number1[i]);
            }
        }
        System.out.println();
        float[] number2 = {1.57f, 7.654f, 9.986f};
        for (int i = number2.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(number2[i] + ", ");
            } else {
                System.out.print(number2[i]);
            }
        }
        System.out.println();
        double[] number3 = {1_000_000_0000l, -3l, -90l, 210421402140240l};
        for (int i = number3.length - 1; i >= 0; i--) {
            if (i > 0) {
                System.out.print(number3[i] + ", ");
            } else {
                System.out.print(number3[i]);
            }
        }
        System.out.println();
    }

    public static void task4() {
        System.out.println("Задача 4");
        int[] number ={1, 2, 42, 24144, 124125532, 12, 1, 5, 9};
        for (int i = 0; i < number.length; i++) {
            if (number[i] % 2 != 0){
                int numberOdd = number[i] + 1;
                System.out.println(numberOdd);
            } else {
                System.out.println(number[i]);
            }
        }
    }
}

