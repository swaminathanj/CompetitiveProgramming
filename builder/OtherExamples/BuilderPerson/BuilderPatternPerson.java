class Person 
{
    //All final attributes
    private final String firstName; // required
    private final String lastName; // required
    private final int age; // optional
    private final String phone; // optional
    private final String address; // optional
 
    private Person(PersonBuilder builder) 
    {
        this.firstName = builder.firstName;
        this.lastName = builder.lastName;
        this.age = builder.age;
        this.phone = builder.phone;
        this.address = builder.address;
    }
 
    //All getter, and NO setter to provide immutability
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return "Person: "+this.firstName+", "+this.lastName+", "+this.age+", "+this.phone+", "+this.address;
    }
 
    public static class PersonBuilder 
    {
        private final String firstName;
        private final String lastName;
        private int age;
        private String phone;
        private String address;
 
        public PersonBuilder(String firstName, String lastName) 
        {
            this.firstName = firstName;
            this.lastName = lastName;
        }
        public PersonBuilder age(int age) 
        {
            this.age = age;
            return this;
        }
        public PersonBuilder phone(String phone) 
        {
            this.phone = phone;
            return this;
        }
        public PersonBuilder address(String address) 
        {
            this.address = address;
            return this;
        }
        
        //Return the finally constructed Person object
        public Person build() 
        {
            return new Person(this);
        }
        
    }
}
public class BuilderPatternPerson 
{
    public static void main(String[] args) 
    {
        Person person1 = new Person.PersonBuilder("John", "Alley").age(25).phone("123001").address("CHD").build();
        System.out.println(person1);
                 
        Person person2 = new Person.PersonBuilder("Amy", "Reacher").age(40).phone("5655").build();
        System.out.println(person2);
                 
        Person person3 = new Person.PersonBuilder("Mary", "Kal").build();
        System.out.println(person3);
    }
}