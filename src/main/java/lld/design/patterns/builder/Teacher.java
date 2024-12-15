package lld.design.patterns.builder;

import java.util.List;

public class Teacher extends Person{
    private final String name;
    private final List<String> classNames;  
    
    private Teacher(TeacherBuilder builder){
        this.classNames = builder.classNames; 
        this.name = builder.name; 
    }

    public String getName() {
        return name;
    }


    public List<String> getClassNames() {
        return classNames;
    }

    @Override
    public String toString() {
        return "Teacher [name=" + name + ", classNames=" + classNames + "]";
    }

    public static class TeacherBuilder implements Builder{

        private String name;
        private List<String> classNames; 

        public TeacherBuilder setName(String name) {
            this.name = name;
            return this; 
        }

        public TeacherBuilder setClassNames(List<String> classNames) {
            this.classNames = classNames;
            return this; 
        }

        public TeacherBuilder() {}
        
        @Override
        public Person build() {
            return new Teacher(this); 
        }
        
    } 


}
