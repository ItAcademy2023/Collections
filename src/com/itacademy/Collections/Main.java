package com.itacademy.Collections;

import java.util.*;

import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //array small tasks
        //task 1
        /*Create an array of type String called cars. Add 3 cars.*/
        String[] cars = {"Subaru", "Bmw", "Suzuki"};
        //task 2
        /*Print the second item in the cars array.*/
        System.out.println(cars[1]);
        //task 3
        /*Change the value from „Suzuki" to „Honda", in the cars array.*/
        cars[2] = "Honda";
        //task 4
        /*Print how many elements the cars array have.*/
        System.out.println(cars.length);
        //task 5
        /*Loop through the items in the cars array.*/
        for (String car : cars) {
            System.out.println(car);
        }
        //array final task
        //task 1
        /*Create an array with these elements and print them in line.*/
        int[] numbers = {40, 55, 63, 17, 22, 68, 89, 97, 89};
        //System.out.println(Arrays.toString(numbers));
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        //arrayList tasks
        //task 1
        /*Create int array, convert it to a List and print it out.*/
        int[] someValues = {1, 2, 3};
        List<Integer> someValuesInList = new ArrayList<>();
        for (int value : someValues) {
            someValuesInList.add(value);
        }
        for (int someValue : someValuesInList) {
            System.out.print(someValue + " ");
        }
        System.out.println();
        //task 2
        /*Use already created Student class and create 5 students, add them to the list.*/
        List<Student> someStudents = new ArrayList<>();
        someStudents.add(new Student("Tom", 26, Grades.PRIMARY, 0));
        someStudents.add(new Student("Jerry", 12, Grades.PRIMARY, 1));
        someStudents.add(new Student("Pim", 5, Grades.KINDERGARDEN, 2));
        someStudents.add(new Student("Charlie", 18, Grades.UNIVERSITY, 3));
        someStudents.add(new Student("Joana", 20, Grades.UNIVERSITY, 4));
        someStudents.add(new Student("Steven", 21, Grades.UNIVERSITY, 5));

        for (Student someStudent : someStudents) {
            System.out.print(someStudent.getName() + " ");
        }
        System.out.println();
//        int currentLength = someStudents.size();
//        for (int i = 0; i < currentLength; i++) {
//            if (someStudents.get(i).getAge() > 25) {
//                someStudents.remove(someStudents.get(i));
//                currentLength--;
//            }
//        }
        /*If student age is more than 25 then delete it from student list.*/
        someStudents.removeIf(student -> (student.getAge() > 25));
        /*Print student list using toString method.*/
        System.out.println(someStudents.toString());

        //set tasks
        //task 1
        /*Create a ArrayList of fruits and add them to the list.*/
        List<String> fruits = Arrays.asList("Apple", "Pear", "Banana", "Apple", "Cherry", "Fig", "Orange", "Banana", "Apple");
        /*Print the size of this list.*/
        System.out.println("fruit items in list: " + fruits + "\nfruit array list size: " + fruits.size());
        //task 2
        /*Convert ArrayList items to HashSet.*/
        Set<String> fruitSet = new HashSet<String>(fruits);
        /*Print what items are in the list.*/
        /*Print the size of HashSet.*/
        System.out.println("fruit items in set: " + fruitSet + "\nfruit set size: " + fruitSet.size());

        //map tasks
        /*Convert ArrayList of Students to the Map.*/
        Map<Integer, Student> studentMap = someStudents.stream().collect(Collectors.toMap(Student::getId, student -> student));
        /*Print map.*/
        System.out.println(studentMap);
        /*Take 4 index Student and change his grade and age.*/
        Student modifiedStudent = new Student(studentMap.get(4).getName(), 17, Grades.PRIMARY, 4);
        studentMap.put(4, modifiedStudent);
        /*Print map key and value*/
        //System.out.println(studentMap.toString());
        System.out.println(studentMap.keySet());
        //System.out.print(studentMap.values());
        /*For value use toString.*/
        System.out.println(studentMap.values().toString());

        //sorting tasks
        /*//someStudents.sort(Comparator.comparing(Student::getAge));
        //task 1
        *//*Create 4 game objects*//*
        Game clue = new Game("Clue", Genre.PUZZLE, 59.99, 60);
        Game battleship = new Game("Battleship", Genre.LOGIC, 25.99, 100);
        Game trivialPursuit = new Game("Trivial Pursuit", Genre.TRIVIA, 3.29, 150);
        Game candyLand = new Game("Candy Land", Genre.FAMILY, 30.33, 50);
        //task 2
        *//*Create ArrayList and add Games*//*
        List<Game> arrayListOfGames = new ArrayList<>();
        arrayListOfGames.add(clue);
        arrayListOfGames.add(battleship);
        arrayListOfGames.add(trivialPursuit);
        arrayListOfGames.add(candyLand);*/

        //task 1 and 2
        /*Create 4 game objects
        Create ArrayList and add Games*/
        GameStore gameStore = new GameStore();
        gameStore.addGameToStore(new Game("Clue", Genre.PUZZLE, 59.99, 60));
        gameStore.addGameToStore(new Game("Battleship", Genre.LOGIC, 25.99, 100));
        gameStore.addGameToStore(new Game("Trivial Pursuit", Genre.TRIVIA, 3.29, 150));
        gameStore.addGameToStore(new Game("Candy Land", Genre.FAMILY, 30.33, 50));
        //task 3
        /*Use foreach to go through array of games and print it
        For printing use toString*/
        gameStore.getGameList().forEach(game -> System.out.println(game.toString()));
        //task 4
        /*Remove second game*/
        gameStore.removeFromGameList(1);
        //task 5
        /*Move Printing to the method and print list again*/
        gameStore.printListOfGames();
        //task 6
        /*Implement PriceComparator and sort Games by Price ascending/descending*/
        gameStore.sortGamesByPriceAscending();
        gameStore.printListOfGames();
        gameStore.sortGamesByPriceDescending();
        gameStore.printListOfGames();

        //stream tasks 1
        //task 1
        /* Using Streams ForEach method increment Game price*/
        gameStore.getGameList().stream()
                .forEach(game -> game.incrementPrice(3.33));
        //task 2
        /*Using Stream Filter, use new list and filter games by
         * Price is more than 10 euro
         * Have sold copied are more than 50
         * Print it*/
        List<Game> gamesThatAreExpensiveAndGamesThatSoldALotOfCopies = gameStore.getGameList().stream()//.filter(game -> game.getPrice() > 10&&game.getCopiesSold() > 50)
                .filter(game -> game.getPrice() > 10)
                .filter(game -> game.getCopiesSold() > 50)
                .toList();//.collect(Collectors.toList());
        gamesThatAreExpensiveAndGamesThatSoldALotOfCopies.forEach(game -> System.out.println(game.toString()));

        //stream tasks 2
        //task 1
        /*Using Streams Sorted sort Games by copies sold*/
        /*Print sorted Games*/
        gameStore.getGameList().stream().sorted(Comparator.comparing(Game::getCopiesSold)).toList()
                .forEach(System.out::println);
        //task 2
        /*Using Streams Min/Max find Games that has sold minimum copies and maximum
        Print Min, Max game*/
        Game soldLeastGames = gameStore.getGameList()
                .stream()
                .min(Comparator.comparing(Game::getCopiesSold))
                .orElse(null);
        System.out.println(soldLeastGames.getTitle() + " sold least, with " + soldLeastGames.getCopiesSold() + " copies");
        Game soldMostGames = gameStore.getGameList()
                .stream()
                .max(Comparator.comparing(Game::getCopiesSold))
                .orElse(null);
        System.out.println(soldMostGames.getTitle() + " sold most, with " + soldMostGames.getCopiesSold() + " copies");

    }

//    static void printing(List<Game> listOfGames) {
//        listOfGames.forEach(game -> System.out.println(game.toString()));
//    }


}