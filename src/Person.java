import java.time.LocalDate;

import static java.lang.StringTemplate.STR;

public class Person {
    String fullName;
    int  age;
    String gender;
    public Person(){}
    public Person(String fullName, int age, String gender){
        this.fullName = fullName;
        this.age = age;
        this.gender = gender;
    }

    public String getInfo(String fullName, int age, String gender){
        return STR."""
                Name 1: \{fullName}
                Age: \{age}
                Gender: \{gender}
                """;
    }

    public String infoAge(){
        return STR."""
                Name : \{fullName}
                Age: \{age}
                Gender: \{gender}
                """;
    }


}
