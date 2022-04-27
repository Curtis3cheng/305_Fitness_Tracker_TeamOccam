import java.util.*;
import java.io.*;

/*
    Implementation of the Fitness Tracker Driver Class project for COMP 305.
    Professor Ahn Nuzen
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)


    Last Updated: April 26, 2022
*/

public class FitnessDemo 
{
    public static void main(String[] args) 
    {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Welcome to the Fitness Tracker App. \n Please choose from the following options: \n (1) Load your previous account \n (2) Create a new account \n");
        String loginChoice = userInput.next();
        if (loginChoice.equals("1"))
        {
            //new function loadData()
        }
        else 
        {
            System.out.print("Please enter your name: ");
            String name = userInput.nextLine();
            System.out.print("\nPlease enter your height: ");
            float height = userInput.nextFloat();
            System.out.print("\nPlease enter your weight: ");
            float weight = userInput.nextFloat();
            System.out.print("\nPlease enter your gender: ");
            String gender = userInput.nextLine();
            System.out.print("\nPlease enter your age: ");
            int age = userInput.nextInt();

            Person newMember = new Person(name, height, weight, gender, age);
            System.out.println(newMember);
        }

    }

    /*public person loadData()
    {

    }*/
}

