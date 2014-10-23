package com.techiedb.app.j8recipes;

import com.techiedb.app.j8recipes.oops.IPFinder;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String mHost= null;
        Scanner input = new Scanner(System.in);
        IPFinder finder = new IPFinder(mHost, input);
        finder.printIPAddress();
        finder.printLocalAddress();
    }
}
