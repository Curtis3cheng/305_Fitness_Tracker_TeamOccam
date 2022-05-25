import java.util.*;
public class Person extends Object //Person
{
    protected String name;
    protected float height;
    protected float weight;
    protected String gender;
    protected float age;
    protected List<Object>workoutHistory = new ArrayList<Object>();

    public Person()
    {
        this.name = "NA";
        this.height = 0;
        this.weight = 0;
        this.gender = "NA";
        this.age = 0;
    }

    public Person(String name, float height, float weight, String gender, float age)
    {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.age = age;
    }
    // Name getter and setter
    public String getName()
    {
        return this.name;
    }

    public void setName(String name)
    {
        this.name = name;
    }


    // Height getter and setter
    public float getHeight()
    {
        return this.height;
    }

    public void setHeight(float height)
    {
        this.height = height;
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


    // Gender getter and setter
    public String getGender()
    {
        return this.gender;
    }


    public void setGender(String gender)
    {
        this.gender = gender;
    }


     // Age getter and setter

    public float getAge()
    {
        return this.age;
    }

    public void setAge(float age)
    {
        this.age = age;
    }


    public void addWorkout(Object Workout)
    {
        workoutHistory.add(Workout);
    }

     
    @Override
    public String toString()
    {
        return ( "Name: " + this.name + "\n" 
        + "Height: " + this.height + "\n"
        + "Weight: " + this.weight + "\n"
        + "Gender: " + this.gender + "\n" 
        + "Age: " + this.age) ;
    }

}
