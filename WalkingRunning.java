/*
    Implementation of the WalkingRuning Class for COMP 305 Final Project. 
    This is the WalkingRuning class that allows us to create WalkingRuning objects. 
    This class inherits from Exercise.
    Professor: Ahn Nuzen

    Proj: Final Programming Project
    Class: COMP-305
    Filename: WalkingRuning.java
    Author: Bo Kulbacki (rkulbacki@sandiego.edu)
            Curtis Cheng(curtischeng@sandiego.edu)
            Griffin Palmeri(gpalmeri@sandiego.edu)


    Last Updated: 25 May 2022 Version 4

*/

public class WalkingRunning extends Exercise
{
    private float duration;
    private float pace;
    private int cadence;
    private float distance;
    private float incline;
    private final String exerciseType = "WalkingRunning";


    public WalkingRunning(String name, String musclesUsed, boolean stationary, boolean equipment, String description,
     float duration, float pace, int cadence, float distance, float incline)
    {
        super(name,musclesUsed,stationary,equipment,description);
        this.duration = duration;
        this.pace= pace;
        this.cadence = cadence;
        this.distance = distance;
        this.incline = incline;
    }

    // Duration getter and setter
    public float getDuration()
    {
        return this.duration;
    }

    public void setDuration(float duration)
    {
        this.duration = duration;
    }

    // Pace getter and setter
    public float getPace()
    {
        return this.pace;
    }

    public void setPace(float pace)
    {
        this.pace = pace;
    }

    // Cadence getter and setter
    public int getCadence()
    {
        return this.cadence;
    }

    public void setCadence(int cadence)
    {
        this.cadence = cadence;
    }

    // Distance getter and setter
    public float getDistance()
    {
        return this.distance;
    }

    public void setDistance(float distance)
    {
        this.distance = distance;
    }


    // Incline getter and setter
    public float getIncline()
    {
        return this.incline;
    }

    public void setIncline(float incline)
    {
        this.incline = incline;
    }


    @Override
    public String toString()
    {
       return ("\n" + this.exerciseType + "\n" + super.toString() 
       + "The duration was: " + this.duration + "\n"
       + "The pace was: " + this.pace + "\n"
       + "The cadence was: " + this.cadence + "\n"
       + "The distance was: " + this.distance + "\n"
       + "The incline was: " + this.incline + "\n");
    }



}
