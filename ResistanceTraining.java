public class ResistanceTraining extends StrengthTraining
{
    private int bandStrength;

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


    public void addWorkout()
    {
        System.out.println("Code this later");
    }


}
