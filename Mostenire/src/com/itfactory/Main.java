package com.itfactory;

import com.itfactory.utils.Menu;

public class Main {

    public static void main(String[] args) {
        while (true) {
            Menu.displayMenu();
            Menu.parseOptions();
        }
    }
}
