package se.lexicon.java.g34.week2.bl;



import java.util.Scanner;

public class ArrayExercises {
    public static void main(String[] args) {
        String[] menu = {"1. Exercise1", "2. Exercise2", "0. Quit"};
        Scanner inp = new Scanner(System.in);
        int menuInput;
        do {
            System.out.println("\nExercise Menue");
            for (String menuIndex:menu ) {
                System.out.println(menuIndex);
                }
            System.out.print("What Exercise do you want to run?:");
            menuInput = inp.nextInt();
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
                    System.out.print("Input number to search for:");
                    int iSearch = inp.nextInt();
                    int index = indexOf(list, iSearch);
                    if (index == -1) {
                        System.out.println(iSearch + " does not exist in the list");
                        }
                        else {
                        System.out.println("Index position of number " + iSearch + " is: " + index);
                        }
                    break;
                    }
                default: {
                    break;
                    }
                }
            }
            while (menuInput != 0) ;
        }

/** Write a program which will store elements in an array of type ‘int’ and print it out.
    Expected output: 11 23 39 etc.*/
public static void exercise1() {
    int[] numbers = {11, 23, 39};

    for (int array : numbers) {
        System.out.print(array + " ");
    }
}

/* Create a program and create a method with name
    ‘indexOf’ which will find and return the index
    of an element in the array. If the element does not
    exist your method should return -1 as value.
    Expected output: Index position of number 5 is: 2.
}
*/
public static int indexOf(int[] list, int find){
    for (int index=0;index<list.length;index++){
        if(list[index]==find) {
            return index;
            }
        }
    return -1;
    }
}
