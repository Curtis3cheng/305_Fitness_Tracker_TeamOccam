/*
    Implementation of the WeightTraining Class for COMP 305 Final Project. 
    This is the WeightTraining class that allows us to create WeightTraining objects. 
    This class inherits from StrengthTraining.
    Professor: Ahn Nuzen

    Proj: Final Programming Project
    Class: COMP-305
    Filename: WeightTraining.java
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)
            Curtis Cheng(curtischeng@sandiego.edu)
            Griffin Palmeri(gpalmeri@sandiego.edu)


    Last Updated: 25 May 2022 Version 4

*/


public class WeightTraining extends StrengthTraining
{
    private float weight;
    private final String exerciseType = "WeightTraining";


    public WeightTraining(String name, String musclesUsed, boolean stationary, boolean equipment, String description, int reps, int sets, float weight)
    {
        super(name,musclesUsed,stationary,equipment,description,reps,sets);
        this.weight = weight;
    }
    // Weight getter and setter
    public float getWeight()
    {
        return this.weight;
    }

    public void setWeight(float weight)
    {
        this.weight = weight;
    }

    @Override
    public String toString()
    {
       return ("\n" + this.exerciseType + "\n" + super.toString()
       + "The amount of pounds was: " + this.weight + "\n");
    }


}
