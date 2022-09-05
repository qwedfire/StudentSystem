/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package 練習學生管理;

import java.util.Scanner;

/**
 *
 * @author LAND
 */
public class 練習學生管理 {

    public enum Order {
        ADD,
        PRINT_SCORE,
        SORT_SCORE,
        SORT_NUMBER,
        NUMBER_SCORE,
        END,
        PRINTALL;

        public static Order getvalue(int index) {
            Order order[] = Order.values();
            return order[index - 1];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student arr[] = new Student[1];
        int count = 0;
        while (true) {
            System.out.println("輸入數字(1~7)");
            System.out.print("1.新增 2.指定座號的成績 3.成績排序 4.座號排序 "
                    + "5.更改指定座號成績 6.結束 7.印出所有學生");
            int chooseorder = sc.nextInt();
            Order order = Order.getvalue(chooseorder);
            switch (order) {
                case ADD:
                    if (count == arr.length) {
                        arr = doublearr(arr);
                    }
                    arr[count] = new Student();
                    count++;
                    break;
                case PRINT_SCORE:
                    System.out.print("請輸入指定的座號:");
                    int id = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (arr[i].getID() == id) {
                            System.out.println(arr[i]);
                        }
                    }
                    break;
                case SORT_SCORE:
                    sortscore(arr, count);
                    break;
                case SORT_NUMBER:
                    sortid(arr, count);
                    break;
                case NUMBER_SCORE:
                    System.out.print("請輸入指定的座號:");
                    id = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (arr[i].getID() == id) {
                            System.out.print("請輸入成績:");
                            int setscore = sc.nextInt();
                            arr[i].settscore(setscore);
                        }
                    }
                    break;
                case END:
                    System.exit(0);
                case PRINTALL:
                    for (int i = 0; i < count; i++) {
                        System.out.println(arr[i].toString());
                    }
                    break;
            }
        }
    }

    public static Student[] doublearr(Student arr[]) {
        Student newarr[] = new Student[arr.length * 2];
        for (int i = 0; i < arr.length; i++) {
            newarr[i] = arr[i];
        }
        return newarr;
    }

    public static void swap(Student arr[], int a, int b) {
        Student tmp = arr[a];
        arr[a] = arr[b];
        arr[b] = tmp;
    }

    public static void sortscore(Student arr[], int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (arr[j].getscore() < arr[j + 1].getscore()) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }

    public static void sortid(Student arr[], int count) {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {
                if (arr[j].getID() > arr[j + 1].getID()) {
                    swap(arr, j, j + 1);
                }
            }
        }
    }
}
