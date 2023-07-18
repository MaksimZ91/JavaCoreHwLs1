package ru.gb.ui;

import java.util.Scanner;

public class UI {
    public String request(){
        System.out.println("Добрый день!");
        System.out.print("Введите заметку: ");
        Scanner sc = new Scanner(System.in);
        return sc.nextLine();
    }
}
