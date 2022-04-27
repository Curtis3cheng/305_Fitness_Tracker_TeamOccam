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
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) 
    {
        
        System.out.println("Welcome to the Fitness Tracker App. \n Please choose from the following options: \n (1) Load your previous account \n (2) Create a new account \n");
        String loginChoice = userInput.next();
        userInput.nextLine();
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
            userInput.nextLine();
            System.out.print("\nPlease enter your weight: ");
            float weight = userInput.nextFloat();
            userInput.nextLine();
            System.out.print("\nPlease enter your gender: ");
            String gender = userInput.nextLine();
            
            System.out.print("\nPlease enter your age: ");
            int age = userInput.nextInt();
            

            Person newMember = new Person(name, height, weight, gender, age);
            System.out.println(newMember);
        }

        while(true)
        {
            System.out.println("Please select an option from the menu below:");

            System.out.println("1.  View User Information");
            System.out.println("2.  Add an Exercise");
            System.out.println("3.  View Previous Workouts");

            int menuChoice = Integer.parseInt(userInput.nextLine());
            switch(menuChoice)
            {
                case 1: 
                    System.out.println("PRINT CUREENT USER");
                    break;
                case 2: 
                    Exercise newExercise;
                    newExercise =createExercise();
                    System.out.println(newExercise);
                    break;
                case 3: 
                    System.out.println("PRINT PREVIOUS WORKOUT HISTORY");
                    break;
                default: 
                    System.out.println("Input is invalid");
            }
        }

    }

    public static Person createPerson()
    {
        System.out.print("Please enter your name: ");
        String name = userInput.nextLine();
        System.out.print("\nPlease enter your height: ");
        String height = userInput.nextLine(); //float
        System.out.print("\nPlease enter your weight: ");
        String weight = userInput.nextLine(); //float
        System.out.print("\nPlease enter your gender: ");
        String gender = userInput.nextLine();
        System.out.print("\nPlease enter your age: ");
        String age = userInput.nextLine(); //int

        Person newMember = new Person(name, Float.parseFloat(height), Float.parseFloat(weight), gender, Integer.parseInt(age));
        return (newMember);
    }

    public static Exercise createExercise()
    {
        System.out.print("Please enter the name of the exercise: ");
        String name = userInput.nextLine();
        System.out.print("\nPlease enter the muscles used (separated by commas): ");
        String musclesUsed = userInput.nextLine(); 
        System.out.print("\nPlease enter 1 if the exercise is stationary, and 0 otherwise: ");
        String stationary = userInput.nextLine(); //boolean
        System.out.print("\nPlease enter 1 if the exercise requirese equipment, and 0 otherwise: ");
        String equipment = userInput.nextLine(); //boolean boolean
        System.out.print("\nPlease enter a description of the exercise: ");
        String description = userInput.nextLine(); //int

        boolean isStationary = false;
        boolean isEquipment = false;
        if (stationary.equals("1"))
        {
            isStationary = true;
        }
        if (equipment.equals("1"))
        {
            isEquipment = true;
        }

        Exercise newEx = new Exercise(name, musclesUsed, isStationary, isEquipment, description);
        return newEx;
    }
}

