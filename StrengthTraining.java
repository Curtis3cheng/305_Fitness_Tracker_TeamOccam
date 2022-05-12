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
       return (super.toString() + "\n"
       + "The number of reps was: " + this.reps + "\n"
       + "The number of sets was: " + this.sets);
    }


    public void addWorkout()
    {
        System.out.println("Code this later");
    }

}

