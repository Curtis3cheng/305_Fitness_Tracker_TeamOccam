public class WalkingRunning extends Exercise
{
    private float duration;
    private float pace;
    private int cadence;
    private float distance;
    private float incline;

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
    public float pace()
    {
        return this.pace;
    }

    public void setPace(float pace)
    {
        this.pace = pace;
    }

    // Cadence getter and setter
    public int cadence()
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
       return (super.toString() + "\n" 
       + "The duration was: " + this.duration + "\n"
       + "The pace was: " + this.pace + "\n"
       + "The cadence was: " + this.cadence + "\n"
       + "The distance was: " + this.distance + "\n"
       + "The incline was: " + this.incline);
    }


    public void addWorkout()
    {
        System.out.println("Code this later");
    }


}
