import java.util.*;
import java.io.*;
import org.json.simple.JSONObject;

/*
    Implementation of the Fitness Tracker Driver Class project for COMP 305.
    This is the driver class that incorporates all of our different objects that make up the Fitness Tracker
    Professor Ahn Nuzen

    Proj: Final Programming Project
    Class: COMP-305
    Filename: FitnessDemo.java
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)
            Curtis Cheng(curtischeng@sandiego.edu)
            Griffin Palmeri(gpalmeri@sandiego.edu)


    Last Updated: 25 May 2022 Version 4

*/


public class FitnessDemo 
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) 
    //main method, this runs our entire program
    {
        Person member = new Person();
        
        //user is presented with a menu of choices, and their input is taken and then handled 
        System.out.println("Welcome to the Fitness Tracker App. \n Please choose from the following options: \n (1) Load your previous account \n (2) Create a new account -- Choose this if you are a first time user! \n");
        String loginChoice = userInput.next();
        userInput.nextLine();
        if (loginChoice.equals("1"))
        {
            member = loadData();
        }
        else 
        {  
            member = createPerson();
            
            System.out.println(member);
        }

        boolean x = true;
        while(x == true)
        {
            //user is presented with more options specific to their account 
            System.out.println("Please select an option from the menu below:");

            System.out.println("1.  View User Information");
            System.out.println("2.  Add an Exercise");
            System.out.println("3.  View Previous Workouts");
            System.out.println("4.  Close program");


            int menuChoice = Integer.parseInt(userInput.nextLine());
            switch(menuChoice)
            {
                case 1: 
                    System.out.println(member);
                    break;
                case 2: 
                System.out.println("What type of workout is this?");
                System.out.println("1. Resistance Training \n2. Walking or Running \n3. Weight Training");
                
                int workoutType = Integer.parseInt(userInput.nextLine());
                    switch(workoutType)
                    {
                        case 1: 
                            //create Resistance workout 
                            ResistanceTraining rt = createResistance();
                            member.addWorkout(rt);
                            break;
                        case 2: 
                            // create walking or running workout 
                            WalkingRunning wr = createWalk();
                            member.addWorkout(wr);
                            break;
                        case 3: 
                            // create weight training 
                            WeightTraining w = createWeight();
                            member.addWorkout(w);
                            break;
                        default: 
                            System.out.println("Input is invalid");
                    }
                    break;
                case 3: 
                    //display user workout history 
                    System.out.println(member.workoutHistory);
                    break;
                case 4:
                    //exit the program
                    System.out.println("Exiting");
                    x = false;
                    break;

                default: 
                    System.out.println("Input is invalid");
            }
        }
        //creating a JSON object to save the member and workout history
        JSONObject workoutObj = new JSONObject();
        workoutObj.put(member.name, member.workoutHistory);
        //writing files with the JSON  objects
        try{
            FileWriter myWriter = new FileWriter(member.name +"Workouts.txt");
            myWriter.write(workoutObj.toJSONString());
            myWriter.close();
            } catch (IOException e){
                e.printStackTrace();
            }
    }

    public static Person createPerson()
    //createPerson is a method that allows the user to create their own "account"
    {
        try{
            System.out.print("Please enter your first and last name separated by a space: ");
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
        

            //add JSON object
            JSONObject personObj = new JSONObject();
            personObj.put(name, newMember);
            try{
            FileWriter myWriter = new FileWriter(name +"Info.txt");
            myWriter.write(personObj.toJSONString());
            myWriter.close();
            } catch (IOException e){
            e.printStackTrace();
            }



            return (newMember);
        }catch(InputMismatchException ex){
            System.out.println("The given input is unacceptable. Please insert a valid input" +ex);
        }
        return null;
    }

    public static WeightTraining createWeight()
    //createweight is a method that allows the user to create their own weight training exercise
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
        String description = userInput.nextLine(); 
        System.out.print("\nPlease enter the number of reps: ");
        int reps = Integer.parseInt(userInput.nextLine()); //int
        System.out.print("\nPlease enter the number of sets: ");
        int sets = Integer.parseInt(userInput.nextLine()); //int
        System.out.print("\nPlease enter the weight used: ");
        int weight = Integer.parseInt(userInput.nextLine()); //int


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

        WeightTraining newEx = new WeightTraining(name, musclesUsed, isStationary, isEquipment, description, reps, sets, weight);
        


        return newEx;
    }


    public static WalkingRunning createWalk()
    //createWalk is a method that allows the user to create their own walking or running (cardio) exercise
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
        String description = userInput.nextLine(); 
        System.out.print("\nPlease enter the number duration: ");
        float duration = Float.parseFloat(userInput.nextLine()); //float
        System.out.print("\nPlease enter the pace: ");
        float pace = Float.parseFloat(userInput.nextLine()); //float
        System.out.print("\nPlease enter the cadence: ");
        int cadence = Integer.parseInt(userInput.nextLine()); //int
        System.out.print("\nPlease enter the distance (in miles): ");
        float distance = Float.parseFloat(userInput.nextLine()); //float
        System.out.print("\nPlease enter the incline degree: ");
        float incline = Float.parseFloat(userInput.nextLine()); //float
        


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

        WalkingRunning newEx = new WalkingRunning(name, musclesUsed, isStationary, isEquipment, description, 
        duration, pace, cadence, distance, incline);
        return newEx;
    }

    public static ResistanceTraining createResistance()
    //createResistance is a method that allows the user to create their own resistance training exercise
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
        String description = userInput.nextLine(); 
        System.out.print("\nPlease enter the number of reps: ");
        int reps = Integer.parseInt(userInput.nextLine()); //int
        System.out.print("\nPlease enter the number of sets: ");
        int sets = Integer.parseInt(userInput.nextLine()); //int
        System.out.print("\nPlease enter the resistance of the band: ");
        int bandStrength = Integer.parseInt(userInput.nextLine()); //int


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

        ResistanceTraining newEx = new ResistanceTraining(name, musclesUsed, isStationary, isEquipment, description, reps, sets, bandStrength);
        return newEx;
    }
    public static Person loadData()
    //loadData is the method that allows the user to load in data from their account
    //This information is loaded in from a text file.
    {
        
        System.out.println("What is the name on your account?");
        String name = userInput.nextLine();

        try{
        FileReader fr = new FileReader(name+"Info.txt");
        System.out.println("File was opened");
        Scanner myReader = new Scanner(fr);
        String[] personParameters = new String[5];
        int counter = 0;
        while(myReader.hasNextLine())
        {
            String data = myReader.nextLine();
            String [] arrOfStr = data.split(" ", 2);
            arrOfStr[1] = arrOfStr[1].replaceAll("}","" );
            personParameters[counter] = arrOfStr[1];
            counter++;
        }
        

        myReader.close();
        //substring to correctly gather the name of the user 
        personParameters[0] = personParameters[0].substring(personParameters[0].lastIndexOf(":")+2);
        Person newMember = new Person((String) personParameters[0],Float.valueOf(personParameters[1]), Float.valueOf(personParameters[2]), (String)personParameters[3],Float.valueOf(personParameters[4]));
        System.out.println("Welcome back");
        System.out.println(newMember);


        FileReader fr2 = new FileReader(name+"Workouts.txt");
        System.out.println("File was opened");

        Scanner myReader2 = new Scanner(fr2);
        String[] WorkoutType1 = new String[8];
        String[] WorkoutType2 = new String[10];
        String[] WorkoutType3 = new String[8];

        String data2 = myReader2.nextLine();

        while(myReader2.hasNextLine())
        //this section is reading in the data from the user's workout history
        //The data is read in, split up, and then used to re-create those same workout objects
        {
            data2 = myReader2.nextLine();
            String [] arrOfStr2 = data2.split(": ", 2);
            
            if(arrOfStr2[0].equals("ResistanceTraining") )
            {
                for (int i = 0; i < 8; i++)
                {
                    data2 = myReader2.nextLine();
                    arrOfStr2 = data2.split(": ", 2);
                    WorkoutType1[i] = arrOfStr2[1];
                    
                }
                ResistanceTraining newWorkout = new ResistanceTraining(WorkoutType1[0], WorkoutType1[1], Boolean.parseBoolean(WorkoutType1[2]),
                    Boolean.parseBoolean(WorkoutType1[3]), WorkoutType1[4], Integer.parseInt(WorkoutType1[5]), Integer.parseInt(WorkoutType1[6]), Integer.parseInt(WorkoutType1[7]));
                
                newMember.addWorkout(newWorkout);                
            }
            else if(arrOfStr2[0].equals("WalkingRunning"))
            {
                for (int i = 0; i < 10; i++)
                {
                    data2 = myReader2.nextLine();
                    arrOfStr2 = data2.split(": ", 2);
                    WorkoutType2[i] = arrOfStr2[1];

                }
                WalkingRunning newWorkout2 = new WalkingRunning(WorkoutType2[0], WorkoutType2[1], Boolean.parseBoolean(WorkoutType2[2]),
                    Boolean.parseBoolean(WorkoutType2[3]), WorkoutType2[4], Float.valueOf(WorkoutType2[5]), Float.valueOf(WorkoutType2[6]), Integer.parseInt(WorkoutType2[7]), Float.valueOf(WorkoutType2[8]), Float.valueOf(WorkoutType2[9]));
                
                newMember.addWorkout(newWorkout2);
               
            }
            else if(arrOfStr2[0].equals("WeightTraining"))
            {
                for (int i = 0; i < 8; i++)
                {
                    data2 = myReader2.nextLine();
                    arrOfStr2 = data2.split(": ", 2);
                    WorkoutType3[i] = arrOfStr2[1];

                }
                WeightTraining newWorkout3 = new WeightTraining(WorkoutType3[0], WorkoutType3[1], Boolean.parseBoolean(WorkoutType3[2]),
                Boolean.parseBoolean(WorkoutType3[3]), WorkoutType3[4], Integer.parseInt(WorkoutType3[5]), Integer.parseInt(WorkoutType3[6]), Float.valueOf(WorkoutType3[7]));
                
                newMember.addWorkout(newWorkout3);
                
            }

       
        }
        
        
        new File(name+"Workouts.txt").delete();
        myReader2.close();


        return newMember;
        }catch(IOException e){
            System.out.println("Invalid Account Name.");
            return loadData();
        }
        //return null;

    }
}


