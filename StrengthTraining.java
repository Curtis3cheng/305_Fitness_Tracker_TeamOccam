/*
    Implementation of the StrengthTraining Class for COMP 305 Final Project. 
    This is the StrengthTraining class that allows us to create StrengthTraining objects. 
    This class inherits from Exercise.
    Professor: Ahn Nuzen

    Proj: Final Programming Project
    Class: COMP-305
    Filename: StrengthTraining.java
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)
            Curtis Cheng(curtischeng@sandiego.edu)
            Griffin Palmeri(gpalmeri@sandiego.edu)


    Last Updated: 25 May 2022 Version 4

*/

public class StrengthTraining extends Exercise
{
    private int reps;
    private int sets;
  
    public StrengthTraining(String name, String musclesUsed, boolean stationary, boolean equipment, String description, int reps, int sets)
    {
        super(name,musclesUsed,stationary,equipment,description);
        this.reps = reps;
        this.sets = sets;
    }

    // Reps getter and setter
    public int getReps()
    {
        return this.reps;
    }

    public void setReps(int reps)
    {
        this.reps = reps;
    }


    // Sets getter and setter

    public int getSets()
    {
        return this.sets;
    }

    public void setSets(int sets)
    {
        this.sets = sets;
    }

    @Override
    public String toString()
    {
       return (super.toString()
       + "The number of reps was: " + this.reps + "\n"
       + "The number of sets was: " + this.sets + "\n");
    }




}

