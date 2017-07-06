public class Address   //public keyword means class is available to other classes in this program
{
    // These are the attributes (variables that each instance is given a set of), private meaning accesible only within the declared class itself
    private String User ;
    private String Street;
    private String Number;
 
    //This section is the constructor
    public Address(String User, String Street, String Number) 
    {        
        this.User = User;
        this.Street = Street;
        this.Number = Number;
    }
 
    //override the toString() method, if you don't have this when outputting you get a reference to the object
    // not the values of the object
    @Override   
    public String toString() 
    {
        return this.User + ", " + this.Number + ", " +   this.Street;
    }
 
    //methods - getters and setters, also known as accessor methods
    public String getUser() { return User;}
 
    public String getNumber() {return Number;}
 
    public String getStreet() {return Street;}
 
    //this keyword highlights that the attribute is being assigned to rather than the parameter being assigned to itself
    public void setUser(String User) {this.User = User;}
 
    public void setNumber(String Number){this.Number = Number;}
 
    public void setStreet(String Street){this.Street = Street;}
}
 
