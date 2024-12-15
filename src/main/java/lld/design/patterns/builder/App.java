package lld.design.patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {

        System.out.println("\n\n");

        Person student = new Student.StudentBuilder()
                                    .setAge(24)
                                    .setClassName(ClassNames.FIRST_YEAR.className).setRollNumber(1)
                                    .setName("Shyam Pradhan")
                                    .build();

        System.out.println(student.toString());

        List<String> classNames = new ArrayList<String>();
        classNames.add(ClassNames.FIRST_YEAR.className);
        classNames.add(ClassNames.SECOND_YEAR.className); 

        Person teacher = new Teacher.TeacherBuilder()
                                    .setName("Shyam Pradhan")
                                    .setClassNames(classNames)
                                    .build(); 
        
        System.out.println(teacher.toString());
    }    
}
