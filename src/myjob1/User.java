package myjob1;

/*
 * @author 
 */

public class User 
{
    String Name, UserName, Sex, Perpose, Email;
    int Age;
    float Weight, Height;

    public User(String Name, String UserName, String Sex, String Perpose, String Email, int Age, float Weight, float Height)
    {
        this.Name = Name;
        this.UserName = UserName;
        this.Sex = Sex;
        this.Perpose = Perpose;
        this.Email = Email;
        this.Age = Age;
        this.Weight = Weight;
        this.Height = Height;
    }
/*
    public String getName()
    {
        return Name;
    }

    public void setName(String Name)
    {
        this.Name = Name;
    }

    public String getUserName()
    {
        return UserName;
    }

    public void setUserName(String UserName)
    {
        this.UserName = UserName;
    }

    public String getSex()
    {
        return Sex;
    }

    public void setSex(String Sex)
    {
        this.Sex = Sex;
    }

    public String getPerpose()
    {
        return Perpose;
    }

    public void setPerpose(String Perpose)
    {
        this.Perpose = Perpose;
    }

    public String getEmail()
    {
        return Email;
    }

    public void setEmail(String Email)
    {
        this.Email = Email;
    }

    public int getAge()
    {
        return Age;
    }

    public void setAge(int Age)
    {
        this.Age = Age;
    }

    public double getWeight()
    {
        return Weight;
    }

    public void setWeight(float Weight)
    {
        this.Weight = Weight;
    }

    public double getHeight()
    {
        return Height;
    }

    public void setHeight(float Height)
    {
        this.Height = Height;
    }
*/
    @Override
    public String toString()
    {
        return ""+"\n Name = "+Name + "\n UserName = " + UserName + "\n Sex = " + Sex + "\n Perpose = " + Perpose + "\n Email = " + Email + "\n Age = " + Age + "\n Weight = " + Weight + "\n Height = " + Height+'}';
    }  
}
