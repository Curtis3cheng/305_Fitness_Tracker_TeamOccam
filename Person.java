

public class Person extends Object //Person
{
    private String name;
    private float height;
    private float weight;
    private String gender;
    private float age;
    private Object[] workoutHistory;


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


    public void showWorkouts()
    {
        System.out.println("Code this later");
    }


    // This will write the personal information into a file so that a person can load their information
    public void writePersonalInfoToFile()
    {
        System.out.println("Code this later");
    }


    // This will write the persons workoutsinto a file so that a person can load their workouts
    public void writeWorkoutsToFile()
    {
        System.out.println("Code this later");
    }

     
    @Override
    public String toString()
    {
        return ( "Name:" + this.name + "\n" 
        + "Height: " + this.height + "\n"
        + "Weight: " + this.weight + "\n"
        + "Gender: " + this.gender + "\n" 
        + "Age: " + this.age) ;
    }

}
