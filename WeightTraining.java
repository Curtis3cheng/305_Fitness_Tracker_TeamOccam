
public class WeightTraining extends StrengthTraining
{
    private float weight;


    public WeightTraining(String name, String musclesUsed, boolean stationary, boolean equipment, String description, int reps, int sets, int weight)
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
       return (super.toString() + "\n"
       + "The amount of weight was: " + this.weight + " Pounds");
    }


}
