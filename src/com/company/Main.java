package com.company;

import java.util.*;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        // Movies (ArrayLists)
        Scanner input = new Scanner(System.in);
        String name, quit = "";
        ArrayList<String> Movies = new ArrayList<>();


        do {
            System.out.println("Enter name of favorite movie");

            name = input.nextLine();

            System.out.println("Add new Y (yes) or Q (quit)");
            quit = input.nextLine();

            System.out.println();

            Movies.add(name);

        } while (!quit.equalsIgnoreCase("Q"));

        Collections.sort(Movies);
        {
            System.out.println("List after sorting:");
            for (String s : Movies) {
                System.out.println(s);
            }
            System.out.println();
        }
        //Wrong way:
//        System.out.println("Watch movie: " + Movies.get(1));
        //not random;
//
//    }
//}
// Wrong way:
// String random = new String();
//        Random rnd = new Random();
//
//        for (int index = 0; index < Movies.size(); index++) {
//            int randomInt = 1 + rnd.nextInt(4);
//            System.out.println("Watch movie: " + name);
//        }
////    }
//}

//Her code
        Random rand = new Random();         //index also random not just movie
        int index = rand.nextInt(Movies.size() - 1); //max number of array list random generator goes to; last index = array-1; initialize int to random number generator
        String MovieToWatch = Movies.get(index);

        System.out.println("\nYou should watch " + MovieToWatch + "today");
    }
}
