/*
    Implementation of the ResistanceTraining Class for COMP 305 Final Project. 
    This is the ResistanceTraining class that allows us to create ResistanceTraining objects. 
    This class inherits from StrengthTraining.
    Professor: Ahn Nuzen

    Proj: Final Programming Project
    Class: COMP-305
    Filename: ResistanceTraining.java
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)
            Curtis Cheng(curtischeng@sandiego.edu)
            Griffin Palmeri(gpalmeri@sandiego.edu)


    Last Updated: 25 May 2022 Version 4

*/

public class ResistanceTraining extends StrengthTraining
{
    private int bandStrength;
    private final String exerciseType = "ResistanceTraining";


    public ResistanceTraining(String name, String musclesUsed, boolean stationary, boolean equipment, String description, int reps, int sets, int bandStrength)
    {
        super(name,musclesUsed,stationary,equipment,description,reps,sets);
        this.bandStrength = bandStrength;
        
    }

    // getter and setter for bandStrength
    public int getBandStrength()
    {
        return this.bandStrength;
    }

    public void setBandStrength(int bandStrength)
    {
        this.bandStrength = bandStrength;
    }


    @Override
    public String toString()
    {
       return ("\n" + this.exerciseType + "\n" + super.toString()
       + "The bandstength was: " + this.bandStrength + "\n");
    }




}
