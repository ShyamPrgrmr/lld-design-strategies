package lld.design.patterns.builder;

//Has a static class with build method in it which returns object of given class after setting attributes. 
//Can help in adding immutability of an object. 

public class Student extends Person{

    //Immutability of an object. 
    private final String name;
    private final Integer age;
    private final Integer rollNumber;
    private final String className; 

    private Student(StudentBuilder builder){
        this.age = builder.age;
        this.name = builder.name; 
        this.rollNumber = builder.rollNumber; 
        this.className = builder.className;  
    }
    
    public String getName() {
        return name;
    }
    public Integer getAge() {
        return age;
    }
    public Integer getRollNumber() {
        return rollNumber;
    }
    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + ", rollNumber=" + rollNumber + ", className=" + className
                + "]";
    }

    public static class StudentBuilder implements Builder{
        private String name; 
        private String className;
        private Integer age;
        private Integer rollNumber; 

        public StudentBuilder(){}
        
        public StudentBuilder setName(String name) {
            this.name = name;
            return this; 
        }
        public StudentBuilder setClassName(String className) {
            this.className = className;
            return this; 
        }
        public StudentBuilder setAge(Integer age) {
            this.age = age;
            return this; 
        }
        public StudentBuilder setRollNumber(Integer rollNumber) {
            this.rollNumber = rollNumber;
            return this; 
        }

        @Override
        public Person build() {
            return new Student(this); 
        }
    }

}
