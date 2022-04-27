public class Exercise extends Object //Exercise
{
    private String name;
    private String musclesUsed;
    private boolean stationary;
    private boolean equipment;
    private String description;

    
    // Name getter and setter
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    // musclesUsed getter and setter
    public String getMusclesUsed()
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
       + "Is the exercise stationary " + this.stationary  + "\n"
       + "Is equipment required " + this.equipment  + "\n"
       + "Description of workout: " + this.description);
    }

}
