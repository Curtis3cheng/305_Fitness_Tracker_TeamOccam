public class ResistanceTraining extends StrengthTraining
{
    private int bandStrength;

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
       return (super.toString() + "\n"
       + "The bandstength was: " + this.bandStrength);
    }




}
