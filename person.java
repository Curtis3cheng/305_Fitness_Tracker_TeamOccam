

public class person
{
    private String name;
    private float height;
    private float weight;
    private String gender;
    private float age;
    private Object[] workoutHistory;


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

     
     @Override
     public String toString()
     {
        return "Code this later";
     }

}