import java.time.LocalDate;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Person person = new Person();


        Person person1 = new Person("Ali", 21, "M");
        Person person2 = new Person("Aliaskar", 25, "M");
        Person person3 = new Person("Zhigit", 29, "M");
        Person person4 = new Person("Nurlan", 45, "M");
        Person person5 = new Person("Eldiar", 34, "M");

        Person[] mass = new Person[]{person1, person2, person3, person4, person5};


        int max = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i].age > max){
                max = mass[i].age;
                index = i;
            }
        }
        int min = 0;
        int index1 = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i].age < min){
                min = mass[i].age;
                index1 = i;
            }
        }

        System.out.println("Uluusu");
        System.out.println(mass[index].infoAge());

        System.out.println("Kichuusu");
        System.out.println(mass[index1].infoAge());


    }
}