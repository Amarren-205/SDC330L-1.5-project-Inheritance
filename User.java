/*
Name: Amarren Hopkins
Date: 4/22/26
Assignment SDC330L Week 1 Project Inheritance, Composition, and User interactions
This is the compositon class just because i needed one very simple */
public class User {
    private String Name; 
    
    public User(String name){
        Name = name;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }

@Override
public String toString(){
    return Name;
}
}