
public class WeightTraining extends StrengthTraining
{
    private float weight;

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
       return (super.toString() + "\n"
       + "The amount of weight was: " + this.weight + " Pounds");
    }

    public void addWorkout()
    {
        System.out.println("Code this later");
    }

}
