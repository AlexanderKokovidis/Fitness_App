package myjob1;

import java.util.ArrayList;
import java.util.List;


public class MyJob1
{
    public static void main(String[] args) 
    {
        
// Creating an ArrayList of String
        
        List <User>User = new ArrayList<>();
        
        User.add(new User("Nikos", "Magkas", "Male", "Fat Burning", "gon19@hotmail.gr", 25, 65, (float) 1.75));
        User.add(new User("Maik", "Fakos", "Male", "Muscle Increase", "maik19@hotmail.gr", 25, 60, (float) 1.72));
        User.add(new User("Alba", "Bonis", "Female", "Maintense Fitness", "alba19@hotmail.gr", 25, 90, (float) 1.87));
        
      
        
        System.out.println(User);            
    }   
    
//Add_Method for a new User    
     public boolean AddUser() throws Exception 
     {
         return false;
     }
     
}

