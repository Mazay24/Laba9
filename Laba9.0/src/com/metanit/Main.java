package com.metanit;

import java.util.Scanner;

interface product {
    String name();
    double price();
    double rank();
}

interface userslog {
    public String login();
    public String password();
}
class PC implements product, userslog {
    String name;
    double price;
    double rank;
    String login = "akimov69";
    String password = "1985OPq";

    PC(String name, double price, double rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }
    @Override
    public String name() {
this.name = name;
return name;
    }

    @Override
    public double price() {
        this.price = price;
        return price;
    }

    @Override
    public double rank() {
        this.rank = rank;
        return rank;
    }

    public String login() {
        return login;
    }
    @Override
    public String password() {
        return password;
    }
    public void Info() {
        System.out.println("Вы приобрели!");
        System.out.println("Товар: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Рейтинг: " + rank);
    }
}

class PS implements product, userslog {
    String name;
    double price;
    double rank;
    String login = "guram228";
    String password = "228aye228";

    PS(String name, double price, double rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }
    @Override
    public String name() {
        this.name = name;
        return name;
    }
    @Override
    public double price() {
        this.price = price;
        return price;
    }
    @Override
    public double rank() {
        return rank;

    }
    @Override
    public String login() {
        return login;
    }
    @Override
    public String password() {
        return password;
    }
    public void Info() {
        System.out.println("Вы приобрели!");
        System.out.println("Товар: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Рейтинг: " + rank);
    }
}

class Stick implements product, userslog {
    String name;
    double price;
    double rank;
    String login = "SisAdmin";
    String password = "YaAdmin39";

    Stick(String name, double price, double rank) {
        this.name = name;
        this.price = price;
        this.rank = rank;
    }
    @Override
    public String name() {
        this.name = name;
        return name;
    }
    @Override
    public double price() {
        this.price = price;
        return price;
    }
    @Override
    public double rank() {
        return rank;

    }
    @Override
    public String login() {
        return login;
    }
    @Override
    public String password() {
        return password;
    }
    public void Info() {
        System.out.println("Вы приобрели!");
        System.out.println("Товар: " + name);
        System.out.println("Цена: " + price);
        System.out.println("Рейтинг: " + rank);
    }
}
public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите логин");
        String login = in.nextLine();
        System.out.println("Введите пароль");
        String password = in.nextLine();
        PC pc = new PC("Компьютер", 599990, 8.6);
        PS ps = new PS("PlayStation", 79640, 6.4);
        Stick stick = new Stick("Клюшка", 16700.55, 9.8);

        pc.Info();
        ps.Info();
        stick.Info();
    }
}
