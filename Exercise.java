/*
    Implementation of the Excercise Class for COMP 305 Final Project..
    This is the exercise class that allows us to create Exercises. This is the parent class. 
    Professor: Ahn Nuzen

    Proj: Final Programming Project
    Class: COMP-305
    Filename: Excercise.java
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)
            Curtis Cheng(curtischeng@sandiego.edu)
            Griffin Palmeri(gpalmeri@sandiego.edu)


    Last Updated: 25 May 2022 Version 4

*/
class Exercise extends Object //Exercise class is concrete. Further implementation could allow user to create their own type of workout with this as a conrete class. 
{
    private String name;
    private String musclesUsed;
    private boolean stationary;
    private boolean equipment;
    private String description;

    public Exercise(String name, String musclesUsed, boolean stationary, boolean equipment, String description)
    {
        this.name = name;
        this.musclesUsed = musclesUsed;
        this.stationary = stationary;
        this.equipment = equipment;
        this.description = description;
    }
    
    // Name getter and setter
    public  String getName()
    {
        return this.name;
    }

    public  void setName(String name)
    {
       this.name = name;
    }


    // musclesUsed getter and setter
    public  String getMusclesUsed()
    {
        return this.musclesUsed;
    }

    public void setMusclesUsed(String muscleUsed)
    {
        this.musclesUsed = muscleUsed;
    }

    @Override
    public String toString()
    {
       return ("Name of Exercise: " + this.name + "\n"
       + "Muscles used: " + this.musclesUsed  + "\n" 
       + "Is the exercise stationary: " + this.stationary  + "\n"
       + "Is equipment required: " + this.equipment  + "\n"
       + "Description of workout: " + this.description + "\n");
     }

}
