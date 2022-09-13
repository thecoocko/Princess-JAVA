package org.labatwo;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

// Розробити програму, що дозволить вам створити, як з клавіатури
// так і рандомно матрицю цілих чисел типу int заданої ширини та висоти(ввести з клавіатури),
// але не більше 20 на 20. Створити можливість пошуку в цій матриці мінімального і
// максимального елементу  та розрахунок середнього арифметичного. Програма може бути
// написана в одному класі, обов'язково розбиття на методи. Обов'язкове використання клавіатури,
// під час вибору ручного чи рандомного створення матриці. Створення системи зчитування з клавіатури
// зробити будь-яким способом, наприклад завдяки класу Scanner. Scanner являє собою найпростішу
// систему сканування клавіатури. Диапазон рандомних чисел для створення елементів матриці повинен
// зверігатись в спеціальних константах.
// Як завдання підвищеної складності додати  розрахунок середнього геометричного елементів матриці.
public class InputOutputArray {

    int x;
    int y;
    int choice;
    private static int randomBounds = 100;

    public InputOutputArray(int x, int y, int choice) {
        this.x=x;
        this.y=y;
        this.choice=choice;
    }

    public  int[][] setRandomMatrix(){
        Random random = new Random();
        int [][]array = new int [x][];
        for(int i =0;i<x;i++){
            array[i] = new int[y];
            for(int j=0; j<y;j++){
                array[i][j] = random.nextInt(randomBounds);
            }
        }

        return array;
    }
    public int[][] setMatrix() throws IOException {
        if(x > 20 || y > 20) {x = 20; y = 20;}
        int [][] array = new int[x][];
        Scanner input = new Scanner(System.in);
        for(int i = 0; i < x;i++){
            array[i] = new int[y];
            for(int j=0; j<y;j++){
                array[i][j] = input.nextInt();
            }
        }
        return array;
    }

    public int[][] getMatrix() throws IOException {
        int [][]array = new int[x][];
        if(choice==1){
            array = setRandomMatrix();
        }else{
            array = setMatrix();
        }
        return array;
    }

    public void printMatrix() throws IOException {
        int [][]array = getMatrix();
        for(int i = 0; i < x;i++){
            for(int j=0; j<y;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

}
