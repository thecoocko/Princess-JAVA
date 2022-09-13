package org.labatwo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
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
public class LabaTwo {

    int x;
    int y;

    public LabaTwo(int x, int y) {
        this.x=x;
        this.y=y;
    }
    public  int[][] setRandomMatrix(){

        return array
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

    public void getMatrix() throws IOException {
        LabaTwo obj = new LabaTwo(x,y);
        int [][]array = obj.setMatrix();
        for(int i = 0; i < x;i++){
            for(int j=0; j<y;j++){
                System.out.print(array[i][j]+" ");
            }
            System.out.println();
        }
    }

}
