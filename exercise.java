public class Exercise extends Object
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

}