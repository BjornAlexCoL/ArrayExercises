package se.lexicon.java.g34.week2.bl;


import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        String[] menu = {"\nExercise Menu", "1.\tArray Exercise 1", "2.\tArray Exercise 2", "3.\tArray Exercise 3", "4.\tArray Exercise 4",
                "5.\tArray Exercise 5", "6.\tArray Exercise 6", "7.\tArray Exercise 7", "8.\tArray Exercise 8", "9.\tArray Exercise 9",
                "10.\tArray Exercise 10", "11.\tArray Exercise 11", "12.\tArray Exercise 12", "13.\tArray Exercise 13",
                "Bonusquests from Week1", "101. Week 1 Exercise 1", "102. Week 1 Exercise 2", "103. Week 1 Exercise 3",
                "104. Week 1 Exercise 4", "105. Week 1 Exercise 5", "106. Week 1 Exercise 6", "107. Week 1 Exercise 7", "108. Week 1 Exercise 8",
                "99.\tGuess the number Challenge", "0.\tQuit"};
        int menuInput;
        printMenu(menu);
        do {
            System.out.print("\nWhat Exercise do you want to run?:");
            menuInput = getValidInt();//Reused from Exercise 9
            switch (menuInput) {
                case 0: {
                    System.out.println("Thx for this time. Catch you later");
                    break;
                }
                case 1: {
                    exercise1();
                    break;
                }
                case 2: { //Exercise 2
                    int[] list = {1, 3, 5, 7, 11, 13};
                    exercise2(list);
                    break;
                }
                case 3: { //Exercise 3
                    String[] cities = {"Paris", "London", "New York", "Stockholm"};
                    exercise3(cities);
                    break;
                }
                case 4: { //Exercise 4
                    int[] numbers = {1, 15, 20};
                    exercise4(numbers);
                    break;
                }
                case 5: { //Exercise 5
                    String[] locations = {"France", "Paris", "Sweden", "Stockholm", "Denmark", "Copenhagen"};
                    exercise5(locations);
                    break;
                }
                case 6: {
                    exercise6();
                    break;
                }
                case 7: {//Exercise 7
                    int[] intArray = {1, 2, 4, 7, 9, 12};
                    exercise7(intArray);
                    break;
                }
                case 8: {//Exercise 8
                    exercise8();
                    break;
                }
                case 9: {
                    exercise9();
                    break;
                }
                case 10: { //Exercise 10
                    exercise10();
                    break;
                }
                case 11: { //Exercise 11
                    exercise11();
                    break;
                }
                case 12: {
                    exercise12();
                    break;
                }
                case 13: {
                    exercise13();
                    break;
                }
                case 101: {
                    exercise101();
                    break;
                }
                case 102: {
                    exercise102();
                    break;
                }
                case 103: {
                    exercise103();
                    break;
                }
                case 104: {
                    exercise104();
                    break;
                }
                case 105: {
                    exercise105();
                    break;
                }
                case 106: {
                    exercise106();
                    break;
                }
                case 107: {
                    exercise107();
                    break;
                }
                case 108: {
                    exercise108();
                    break;
                }
                case 99: {
                    numberGuessChallenge();
                    break;
                }


                default: {
                    printMenu(menu);
                    break;
                }
            }

        }
        while (menuInput != 0);
    }

    public static void printMenu(String[] menu) {
        for (String menuIndex : menu) {
            System.out.println(menuIndex);
        }

    }

    /**
     * Write a program which will store elements in an array of type ‘int’ and print it out.
     * Expected output: 11 23 39 etc.
     */
    public static void exercise1() {
        int[] numbers = {11, 23, 39};

        for (int array : numbers) {
            System.out.print(array + " ");
        }
    }

    /* 2. Create a program and create a method with name
        ‘indexOf’ which will find and return the index
        of an element in the array. If the element does not
        exist your method should return -1 as value.
        Expected output: Index position of number 5 is: 2.
    */
    public static void exercise2(int[] list) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Input number to search for:");
        int iSearch = inp.nextInt();
        int index = indexOf(list, iSearch);
        if (index == -1) {
            System.out.println(iSearch + " does not exist in the list");
        } else {
            System.out.println("Index position of number " + iSearch + " is: " + index);
        }
    }

    public static int indexOf(int[] list, int find) {
        for (int index = 0; index < list.length; index++) {
            if (list[index] == find) {
                return index;
            }
        }
        return -1;
    }

    /*3. Write a program which will sort string array.
    Expected output: String array: [Paris, London, New York, Stockholm]
    Sort string array: [London, New York, Paris, Stockholm]*/
    public static void exercise3(String[] sortArray) {
        printStrings(sortArray, "String array", " [", ", ", "]");
        Arrays.sort(sortArray, String.CASE_INSENSITIVE_ORDER);
        printStrings(sortArray, "Sorted String array", " [", ", ", "]");
    }

    //Format output in Exercise 3
    public static void printStrings(String[] printArray, String label, String prefix, String seperator, String epifix) {
        System.out.print("\n" + label + prefix);
        int counter = 0;
        for (String index : printArray) {
            counter++;
            System.out.print(index);
            if (counter < printArray.length) {
                System.out.print(seperator);
            } else {
                System.out.print(epifix);
            }
        }
    }

    /* 4. Write a program which will copy the elements of one array into another array.
    Expected output: Elements from first array: 1 15 20
    Elements from second array: 1 15 20 */
    public static void exercise4(int[] numbers) {
        int[] copiedNumbers = Arrays.copyOf(numbers, numbers.length);
        printInt(numbers, "Elements from first array:", " ", " ", "");
        printInt(copiedNumbers, "Elements from second array:", " ", " ", "");
    }

    public static void printInt(int[] printArray, String label, String prefix, String seperator, String epifix) {
        System.out.print("\n" + label + prefix);
        int counter = 0;
        for (int index : printArray) {
            counter++;
            System.out.print(index);
            if (counter < printArray.length) {
                System.out.print(seperator);
            } else {
                System.out.print(epifix);
            }
        }
    }


    /* 5. Create a two-dimensional string array [2][2].
        Assign values to the 2d array containing any Country and City.
        Expected output: France Paris
                         Sweden Stockholm*/
    public static void exercise5(String[] list) {
        String[][] locations = new String[list.length / 2][2];
        int listIndex = 0;
        for (String postValue : list) {
            locations[listIndex / 2][listIndex % 2] = postValue;
            listIndex++;
        }
        printStringArray(locations);
    }

    //print exercise5
    public static void printStringArray(String[][] printArray) {
        System.out.print("\n");
        for (String[] array : printArray) {
            int index = 1;
            for (String post : array) {
                System.out.print(post + " ");
                if (index == array.length) {
                    System.out.println();
                }
                index++;
            }
        }
    }

    /*6. Write a program which will set up an array to hold the next values in this
    order: 43, 5, 23, 17, 2, 14 and print the average of these 6 numbers.
    Expected output:
    Average is: 17.3*/
    public static void exercise6() {
        int[] valueArray = {43, 5, 23, 17, 2, 14};
        System.out.print("Average is: ");
        printAverage(valueArray);
    }

    public static void printAverage(int[] numbers) {
        int sum = getSum(numbers);//The sum of the numbers is from Week 1 Exercise 3
        int average = sum / numbers.length;//The integerpart of the average
        int mod = sum * 10 / numbers.length % 10;//The decimal part we increase the sum with 10 for 1 decimal as we don't want to truncate it before getting the mod from it
        System.out.print(average + "." + mod);
    }


    /*7. Write a program which will set up an array to hold 10 numbers and print
     out only the uneven numbers.
     Expected output:
     Array: 1 2 4 7 9 12
     Odd Array: 1 7 9*/
    public static void exercise7(int[] originalArray) {
        System.out.print("Array: ");
        printIntegers(originalArray);
        printOddIntegers(originalArray);
    }

    public static void printIntegers(int[] elementArray) {
        for (int element : elementArray) {
            System.out.print(element + " ");
        }
    }

    public static void printOddIntegers(int[] checkArray) {
        System.out.print("\nOdd Array: ");
        for (int index : checkArray) {
            if (index % 2 == 1) {
                System.out.print(index + " ");
            }
        }
    }

    /*8. Write a program which will remove the duplicate elements of a given
    array [20, 20, 40, 20, 30, 40, 50, 60, 50]. Expected output: Array: 20 20 40 20 30 40 50 60 50
    Array without duplicate values: 20 40 30 50 60*/
    public static void exercise8() {
        int[] startArray = {20, 20, 40, 20, 30, 40, 50, 60, 50};
        int[] resultArray = new int[0];
        for (int index : startArray) {
            if (!doesExist(resultArray, index)) {
                resultArray = addElement(resultArray, index);//Reused from exercise 9
            }
        }
        System.out.print("Array: ");
        printIntegers(startArray);//reused from exercise 7
        System.out.print("\nArray without duplicate values: ");
        printIntegers(resultArray);//reused from exercise 7
    }

    public static boolean doesExist(int[] valueList, int seekValue) {
        Arrays.sort(valueList);
        return (Arrays.binarySearch(valueList, seekValue) >= 0);
    }

    /*9. Write a method which will add elements in an array.
    Remember that arrays are fixed in size so you need to come up with a
    solution to “expand” the array.*/
    public static void exercise9() {
        int[] elementArray = new int[0];
        int newElement;
        System.out.print("Elements in this Exercise are supposed to be an integer.");
        do {
            System.out.print("\nPlease input element: ");
            newElement = getValidInt();//input a valid integer
            elementArray = addElement(elementArray, newElement);//Add the new element
            printElementArray(elementArray); //Show us what we got
            System.out.print("\nDo you want to stop entering elements?");
        }
        while (!checkForYes());//Continue until Y is pressed
        System.out.println("Welcome Back!");
    }

    public static boolean checkForYes() { //you have to enter Y in the beginning. Everything else is false
        Scanner inp = new Scanner(System.in);
        String quitCheck;

        quitCheck = inp.nextLine();
        if (quitCheck.isEmpty()) {
            quitCheck = "N";
        }
        quitCheck = quitCheck.toLowerCase();
        return quitCheck.charAt(0) == 'y';
    }

    public static int getValidInt() {
        Scanner inp = new Scanner(System.in);
        String testValid;
        boolean isValid;
        do {
            isValid = true;
            testValid = inp.nextLine();
            if (testValid.isEmpty()) { /* if testValid is empty */
                System.out.println("How do you suppose I should work when not entering an integer? ");
                System.out.print("Try to input an Integer again, please:");
                isValid = false;
                continue;
            }
            try {//Check if it's and valid integer
                Integer.parseInt(testValid);
            } catch (NumberFormatException e) {
                System.out.println("Since when did " + testValid + " become an integer.");
                System.out.print("Try to input an Integer again, please:");
                isValid = false;
            }
        }
        while (!isValid);//loop until we get a valid integer.
        return Integer.parseInt(testValid);
    }

    public static int[] addElement(int[] oldArray, int element) {
        int[] newArray;
        newArray = Arrays.copyOf(oldArray, oldArray.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }

    public static void printElementArray(int[] elementArray) {
        for (int element : elementArray) {
            System.out.print(element + "\t");
        }
    }

    /*10. Write a program which will represent multiplication table stored in
    multidimensional array.
    Hint: You have two-dimensional array with values
    [[1,2,3,4,5,6,7,8,9,10], [1,2,3,4,5,6,7,8,9,10]]*/
    public static void exercise10() {
        int[][] productMatris = assignProductMatris(10);//assign the two dimentional array
        printArrayTable(productMatris); //print it.
    }

    public static int[][] assignProductMatris(int size) {
        int[][] productMatris = new int[size][size];
        for (int row = 0; row < size; row++) {
            for (int col = 0; col < size; col++) {
                productMatris[row][col] = (row + 1) * (col + 1);
            }
        }

        return productMatris;
    }

    public static void printArrayTable(int[][] productArray) {
        System.out.println();
        for (int[] row : productArray) {
            for (int col : row) {
                System.out.print(col);
                System.out.print("\t\t");
            }
            System.out.println();
        }
    }


    /*11. Write a program that ask the user for an integer and repeat that
     question until user give you a specific value that user already has been
     told about as a message in your program. Store these values in an array
     and print that array. After that reverse the array elements so that the
     first element becomes the last element, the second element becomes the second to last
     element, etc. Do not just reverse the order in which
     hey are printed. You need to change the way they are stored in the
      array.
     */
    public static void exercise11() {
        Random rnd = new Random();
        int secretNumber = rnd.nextInt(10);//Random number between 0-9
        int[] guesses = new int[0];
        int currentGuess;
        System.out.println("The secret number is " + secretNumber);
        do {
            System.out.print("Please enter an Integer: ");
            currentGuess = getValidInt(); //Reused from Exercise 9
            guesses = addElement(guesses, currentGuess);//reused from Exercise 9
        }
        while (currentGuess != secretNumber);
        System.out.println("\nguesslist");
        printIntegers(guesses); //reused from Exercise 7
        guesses = reverseArray(guesses);
        System.out.println("\ninverted guesslist");
        printIntegers(guesses); //reused from Exercise 7
    }

    public static int[] reverseArray(int[] orgArray) {
        int[] revArray = new int[orgArray.length];
        for (int i = 0; i < orgArray.length; i++) {
            revArray[revArray.length - i - 1] = orgArray[i];
        }
        return revArray;

    }

    /*12. Write a program which will print the diagonal elements of
    two-dimensional array.
    Expected output: 1 4 9
     */
    public static void exercise12() {
        int[][] sumMatris = assignProductMatris(3);//Reuse from exersize 10
        printArrayDiagonal(sumMatris); //print it.

    }

    public static void printArrayDiagonal(int[][] diagonalArray) {
        System.out.println("\n");
        for (int diagonal = 0; diagonal < diagonalArray.length; diagonal++) {
            System.out.print(diagonalArray[diagonal][diagonal] + "\t");
        }
    }

    /*13. Create two arrays with arbitrary size and fill one with random numbers.
    Then copy over the numbers from the array with random numbers so
    that the even numbers are located in the rear (the right side) part of the
    array and the odd numbers are located in the front part (the left side).*/
    public static void exercise13() {
        System.out.print("\nHow many random numbers do you want to work with?: ");
        int amount = getValidInt();
        System.out.print("\nWhat will be the highest value int the array?");
        int highValue = getValidInt();
        int[] randomArray = assignArrayWithRandoms(amount, highValue);
        int[][] sortedArray = oddEvenSortArray(randomArray);
        printArrayTable(sortedArray);
    }

    public static int[] assignArrayWithRandoms(int amount, int highValue) {
        int[] rndArray = new int[0];
        Random rnd = new Random();
        for (int index = 0; index < amount; index++) {
            rndArray = addElement(rndArray, rnd.nextInt(highValue) + 1);
            System.out.print(rndArray[index] + " ");
        }
        return rndArray;
    }

    public static int[][] oddEvenSortArray(int[] numList) {
        int[][] sortMatris = new int[2][];
        int[] evenArray = new int[0];
        int[] oddArray = new int[0];
        for (int number : numList) {
            if (number % 2 == 1) {
                oddArray = addElement(oddArray, number);
            } else {
                evenArray = addElement(evenArray, number);
            }
        }
        sortMatris[0] = Arrays.copyOf(oddArray, oddArray.length);
        sortMatris[1] = Arrays.copyOf(evenArray, evenArray.length);
        return sortMatris;
    }

    /*    1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.
        Expected result:
        Hello
        Ali!*/
    public static void exercise101() {
        printHelloName("\nBjörn");
    }

    public static void printHelloName(String name) {
        System.out.print("Hello ");
        System.out.println(name);
    }

    /*2. Create a program that takes a year as input from user and print if it’s leap year or not.*/
    public static void exercise102() {
        boolean isLeapYear;
        int iTestLeapYear;
        System.out.println("Leapyear in the way we resolve it today was intoduced in Sweden 1753 with the Gregorian Calender.\n" +
                "Before we used the Julian calender. The big difference is that leapyear only occur when centuries \n" +
                "is possible to divide with even with 4 in the Gregorian Calender. In the Julian every century was leapyear.\n" +
                "Besided that was the date 1753 between 18 of february to the end of the month removed and we went to bed the 17th\n"+
                "wake up at the §th of Mars.");

        do {
            System.out.print("Input year to test if leapyear: ");
            iTestLeapYear = getValidInt();
            if (iTestLeapYear > 1753) {
                isLeapYear = isGregorianLeapYear(iTestLeapYear);
            } else {
                isLeapYear = isJulianLeapYear(iTestLeapYear);
            }
            if (isLeapYear) {
                System.out.println(iTestLeapYear + " is a leapyear!");
            } else {
                System.out.println(iTestLeapYear + " is not a leapyear!");
            }

            System.out.print("Do you want to try another year?");
        }
        while (checkForYes());//reused from exercise 9
        System.out.println("Welcome Back!");
    }

    public static boolean isGregorianLeapYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0);
    }

    public static boolean isJulianLeapYear(int year) {
        return (year % 4 == 0);
    }


    /*3. Write a Java program to print the sum/multiplication/division and subtraction of two numbers
     Expected result:
             45 + 11 = 56
             12 * 4 = 48
             24 / 6 = 4
             55 – 12 = 43;*/
    public static void exercise103() {
        int[] numbers = new int[2];
        numbers[0] = 45;
        numbers[1] = 11;

        System.out.println(numbers[0] + "+" + numbers[1] + "=" + getSum(numbers));
        numbers[0] = 12;
        numbers[1] = 4;
        System.out.println(numbers[0] + "*" + numbers[1] + "=" + getProduct(numbers));
        numbers[0] = 24;
        numbers[1] = 6;
        System.out.println(numbers[0] + "/" + numbers[1] + "=" + getQuota(numbers));
        numbers[0] = 55;
        numbers[1] = 12;
        System.out.println(numbers[0] + "-" + numbers[1] + "=" + getDiff(numbers));
    }

    public static int getSum(int[] numbers) {
        int result = 0;
        for (int term : numbers) {
            result += term;
        }
        return result;
    }

    public static int getDiff(int[] numbers) {
        int result = 0;
        for (int term : numbers) {
            result -= term;
        }
        return result;
    }

    public static int getProduct(int[] numbers) {
        int result = 1;
        for (int term : numbers) {
            result *= term;
        }
        return result;

    }

    public static int getQuota(int[] numbers) {
        if (numbers.length > 1) {
            if (numbers[1] == 0) {
                System.out.println("Division with 0");
                return numbers[0];
            }
        }
        return numbers[0] / numbers[1];

    }

    /*4. Write a Java program that prints the average of three numbers
    Expected result:
            (23 + 11 + 77) / 3 = 37 */
    public static void exercise104() {
        int[] numbers = new int[]{23, 11, 77};
        System.out.print("Average is ");
        printAverage(numbers);//Reused from exercise 6
    }

    /*5. Create a program that asks user to input his/her name and store it in a variable
    instead of having fixed name. Then print ‘Hello username’ where username
    is what you got from user as input.*/
    public static void exercise105() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Whats your name? ");
        printHelloName(inp.nextLine());
    }

    /*6. Create a program that asks user to input two numbers and print the
    sum/multiplication/division and subtraction of given numbers*/
    public static void exercise106() {
        int[] numbers = new int[2];
        do {
            for (int index=0;index<2;index++) {
                System.out.print("\nInput number " + (index+1) + ": ");
                numbers[index] = getValidInt();
            }
            System.out.println(numbers[0] + "+" + numbers[1] + "=" + getSum(numbers));//Reused from Week 1Exercise 3 (103)
            System.out.println(numbers[0] + "*" + numbers[1] + "=" + getProduct(numbers));//Reused from Week 1Exercise 3 (103)
            System.out.println(numbers[0] + "/" + numbers[1] + "=" + getQuota(numbers));//Reused from Week 1Exercise 3 (103)
            System.out.println(numbers[0] + "-" + numbers[1] + "=" + getDiff(numbers));//Reused from Week 1Exercise 3 (103)
            System.out.println("Press Y to continue. Other keys will end!");
        }
        while (checkForYes());
        System.out.println("Welcome Back");

    }

    /*7. Create a program that converts seconds to hours, minutes and seconds
    Input seconds: 86399
    Expected output:
            23:59:59*/
    public static void exercise107() {
        int seconds;
        do {
            System.out.print("Input Seconds:");
            seconds=getValidInt();
            printTime(seconds);
            System.out.println("Press Y to quit other key to run again!");
        } while (!checkForYes());
    }

    public static void printTime(int seconds) {
        System.out.println((seconds / 3600) + ":" + (seconds % 3600) / 60 + ":" + (seconds % 3600 % 60));
    }

    /*8. Write a program that first generates a random number between 1 and 500
    and stores it into a variable (see the Random class). Then let the user make a
    guess for which number it is. If the user types the correct number, he should be
    presented with a message (including the number of guesses he has made). If he types
    a number that is greater or smaller than the given number, display either
    “Your guess was too small” or “Your guess was too big”. The program should
    keep executing until the user input the correct guess.
    */
    public static void exercise108() {
        int[] guesses = new int[0];
        int rounds = 0, maxNumber = 500;

        System.out.print("Do you want to guess a number?");
        while (checkForYes()) {
            rounds++;
            guesses = addElement(guesses, youGuess(maxNumber));
            System.out.print("You have made " + rounds + " rounds and guessed " + getSum(guesses) + " times in total. \nThat makes an average of ");
            printAverage(guesses);
            System.out.print(" each round.");
            System.out.print("\nDo you want to have another go?(Y/N)");
        }
    }


    public static int youGuess(int maxNumber) {
        Random rnd = new Random();
        //LocalTime startTime;
        int guesses = 0, number, guess;
        System.out.println("I am thinking of a number between 1 and " + maxNumber);
        //startTime = LocalTime.now();
        number = rnd.nextInt(maxNumber) + 1;
        do {
            guesses++;
            System.out.print("Input guess no " + guesses + ":");
            guess = getValidInt();
            if (guess > number) {
                System.out.println("Your guess was too big! Go Lower.");
            } else {
                if (guess < number) {
                    System.out.println("Your guess was too small! Go Higher.");
                }
            }
        }
        while (guess != number);

        System.out.println("Good Work! The Number was " + number + ". It took " + guesses + " tries to get it!");
        return guesses;
    }

    public static void numberGuessChallenge() {
        int[] yourGuesses = new int[0];
        int[] myGuesses = new int[0];
        int maxNumber, round = 0, myWon = 0, youWon = 0;
        System.out.println("First I think of a number and you guess. Then you think  \n of a number and I try to guess it.");
        System.out.print("Do you want to try it?");
        while (checkForYes()) {
            System.out.print("What is the highest number you want to guess of this round? ");
            maxNumber = getValidInt();
            round++;
            System.out.println("Lets start round " + round);
            yourGuesses = addElement(yourGuesses, youGuess(maxNumber));
            myGuesses = addElement(myGuesses, myGuess(maxNumber));
            if (yourGuesses[yourGuesses.length - 1] < myGuesses[myGuesses.length-1]) {
                youWon++;
            }
            if (myGuesses[myGuesses.length - 1] < yourGuesses[yourGuesses.length-1]) {
                myWon++;
            }
            if (yourGuesses[yourGuesses.length - 1] == myGuesses[myGuesses.length-1]) {
                System.out.println("Equal amount of guesses. Noone won but noone lost either!  ");
            }

            System.out.println("I have guessed totally " + getSum(myGuesses) + " and you have " + getSum(yourGuesses) + " Guesses");
            System.out.println("I have won " + myWon + " rounds and you have won " + youWon + " rounds");
            System.out.print("Do you want to have another round?(Y/N)");
        }
    }

    public static int myGuess(int maxNumber) {
        Scanner scanner = new Scanner(System.in);
        int guesses = 1, guess, lowSpan = 1, highSpan = maxNumber + 1;
        char choice;
        String inp;
        System.out.println("\n" +
                "My turn to guess.");
        System.out.println("Think of a number between 1 and " + maxNumber + "!");
        System.out.println("If my guess is to low press 'L'. If my guess is to high press 'H'.");
        System.out.println("If i am spot on press 'Y'.");
        do {
            System.out.print("Are you ready? ");
        }
        while (!checkForYes()) ;

        do {
            guess = (highSpan - lowSpan) / 2 + lowSpan;
            System.out.print("My guess no " + guesses + " is " + guess + ".");
            inp = scanner.nextLine();
            inp = inp.toUpperCase();
            if (!inp.isEmpty()) {
                choice = inp.charAt(0);
            } else {
                choice = 'F';
            }
            switch (choice) {
                case 'L': {
                    lowSpan = guess;
                    break;
                }
                case 'H': {
                    highSpan = guess;
                    break;
                }
                case 'Y': {
                    break;
                }
                default: {
                    System.out.println("This is hard enough. Please enter either L,H or Y!");
                    guesses--;
                    break;
                }
            }
            guesses++;
        }
        while (choice != 'Y') ;
        System.out.println("Wow! I am amzing. The Number was " + guess + ". It took " + guesses + " tries to get it!");

        return guesses;
    }
}

