import java.util.*;
import java.io.*;
import org.json.simple.JSONObject;



/*
    Implementation of the Fitness Tracker Driver Class project for COMP 305.
    Professor Ahn Nuzen
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)
            Curtis Cheng(curtischeng@sandiego.edu)
            Griffin Palmeri(gpalmeri@sandiego.edu)


    Last Updated: 12 May 2022 Version 3
*/

public class FitnessDemo 
{
    static Scanner userInput = new Scanner(System.in);
    public static void main(String[] args) 
    {
        Person member = new Person();
        
        System.out.println("Welcome to the Fitness Tracker App. \n Please choose from the following options: \n (1) Load your previous account \n (2) Create a new account \n");
        String loginChoice = userInput.next();
        userInput.nextLine();
        if (loginChoice.equals("1"))
        {
            loadData();
        }
        else 
        {
               
            member = createPerson();
            
            System.out.println(member);
        }

        boolean x = true;
        while(x == true)
        {
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
                    System.out.println(member.workoutHistory);
                    break;
                case 4:
                    System.out.println("Exiting");
                    x = false;

                default: 
                    System.out.println("Input is invalid");
            }
        }
        JSONObject workoutObj = new JSONObject();
        workoutObj.put(member.name, member.workoutHistory);
        try{
            FileWriter myWriter = new FileWriter(member.name +"Workouts.txt");
            myWriter.write(workoutObj.toJSONString());
            myWriter.close();
            } catch (IOException e){
                e.printStackTrace();
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
    }

    public static WeightTraining createWeight()
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
    public static void loadData(){
        System.out.println("What is your first name");
        String name = userInput.nextLine();
        try{
        FileReader fr = new FileReader(name+"Info.txt");
        Scanner myReader = new Scanner(fr);
        Object[] personParameters = new Object[5];
        int counter = 0;
        while(myReader.hasNextLine())
        {
            String data = myReader.nextLine();
            String [] arrOfStr = data.split(" ", 1);
            arrOfStr[1] = arrOfStr[1].replaceAll("}","" );
            personParameters[counter] = arrOfStr[1];
            counter++;
        }

        Person newMember = new Person(personParameters[0],personParameters[1], personParameters[2], personParameters[3], personParameters[4]);

        


        }catch(IOException e){
            System.out.println("File Not found");
        }
    }
}


