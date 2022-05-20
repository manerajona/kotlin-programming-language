package com.manerajona._00_intro.java;

import java.util.Map;
import java.util.Scanner;

public class Main {
    private static final Map<Integer, Location> locations = new Locations().getMap();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int loc = 64;

        while (true) {
            System.out.println(locations.get(loc).getDescription());

            if (loc == 0) {
                break;
            }

            Map<String, Integer> exits = locations.get(loc).getExits();
            System.out.print("Available exits are ");
            for (String exit : exits.keySet()) {
                System.out.print(exit + ", ");
            }
            System.out.println();

            String direction = scanner.nextLine().toUpperCase();

            if (exits.containsKey(direction)) {
                loc = exits.get(direction);
            } else {
                System.out.println("You cannot go in that direction");
            }
        }

    }
}
